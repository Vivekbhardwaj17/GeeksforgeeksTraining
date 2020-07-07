package NewPackage;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class ClientThread implements Runnable
{

    ArrayList al=new ArrayList();
    ArrayList users=new ArrayList();
    ServerSocket ss;
    Socket s;

    public final static int PORT=8686;
    public final static String UPDATE_USERS="updateuserslist:";
    public final static String LOGOUT_MESSAGE="@@logoutme@@:";
    DataInputStream dis;
    MyClient client;

    ClientThread(DataInputStream dis,MyClient client)
    {
        this.dis=dis;
        this.client=client;
    }
    ////////////////////////
    public void run()
    {
        String s2="";
        do
        {
            try{
                s2=dis.readUTF();
                if(s2.startsWith(MyServer.UPDATE_USERS))
                    updateUsersList(s2);
                else if(s2.equals(MyServer.LOGOUT_MESSAGE))
                    break;
                else
                    client.txtBroadcast.append("\n"+s2);
                int lineOffset=client.txtBroadcast.getLineStartOffset(client.txtBroadcast.getLineCount()-1);
                client.txtBroadcast.setCaretPosition(lineOffset);
            }
            catch(Exception e){client.txtBroadcast.append("\nClientThread run : "+e);}
        }
        while(true);
    }

    public void updateUsersList(String ul)
    {
        Vector ulist=new Vector();

        ul=ul.replace("[","");
        ul=ul.replace("]","");
        ul=ul.replace(MyServer.UPDATE_USERS,"");

        StringTokenizer st=new StringTokenizer(ul,",");
        while(st.hasMoreTokens())
        {
            String temp=st.nextToken();
            ulist.add(temp);
        }
        client.usersList.setListData(ulist);
    }
/////////////////////////
}