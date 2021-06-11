package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
public class ServerSorting{
    public static void main(String args[])throws Exception
    {
        ServerSocket so = new ServerSocket(3333);
        Socket s = so.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] =new int[10];    
        for(int i = 0;i<10;i++)
            a[i] = dis.readInt();
        Arrays.sort(a);
        for(int i = 0;i<10;i++)
           dos.writeInt(a[i]);
        dos.flush();
        dos.close();
        s.close();
        so.close();
     }
  }
