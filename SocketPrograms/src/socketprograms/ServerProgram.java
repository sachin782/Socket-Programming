package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerProgram {
    public static void main(String args[])throws Exception
    {
        ServerSocket so = new ServerSocket(3333);
        Socket s = so.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = " ";
        String s2 = "Client connected";
        s1 = dis.readUTF();
        System.out.println(s1);
        dos.writeUTF(s2);
        dos.flush();
        dos.close();
        s.close();
        so.close();
     }
  }

