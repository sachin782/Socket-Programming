package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerReverse{
    public static void main(String args[])throws Exception
    {
        ServerSocket so = new ServerSocket(3333);
        Socket s = so.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,r = 0; 
        n = dis.readInt();
        while(n!=0)
        {
            r = (r * 10) + (n % 10); 
            n = n / 10;
        }
        dos.writeInt(r);
        dos.flush();
        dos.close();
        s.close();
        so.close();
     }
  }
