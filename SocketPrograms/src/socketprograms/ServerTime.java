package socketprograms;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class ServerTime{
    public static void main(String args[])throws Exception
    {
            ServerSocket s=new ServerSocket(3333);
            Socket so=s.accept();
            DataOutputStream dos = new DataOutputStream(so.getOutputStream());
            dos.writeBytes("Server Date: " + (new Date()).toString() + "\n");
            dos.close();
            so.close();
     }
  }
