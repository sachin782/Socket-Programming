package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerChat {
    public static void main(String args[])throws Exception
    {
        ServerSocket so = new ServerSocket(3333);
        Socket s = so.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = " ",s2 = " ";
        while(!s1.equals("stop"))
        {  
          s1=dis.readUTF();  
          System.out.println("Client:  "+s1);  
          s2=br.readLine();  
          dos.writeUTF(s2);  
          dos.flush();  
        }  
        dis.close();  
        so.close();  
        s.close();      
     }
  }

