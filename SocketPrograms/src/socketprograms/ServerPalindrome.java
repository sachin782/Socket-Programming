package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerPalindrome{
    public static void main(String args[])throws Exception
    {
        ServerSocket so = new ServerSocket(3333);
        Socket s = so.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1,msg,s2="";
        char c;     
        s1 = dis.readUTF();
        for(int i = s1.length()-1;i>=0;i--)
        {
            c = s1.charAt(i);
            s2 = s2 + c;
        }
        if(s2.equalsIgnoreCase(s1))
            msg = "Palindrome";
        else
            msg = "Not Palindrome";
        dos.writeUTF(msg);
        dos.flush();
        dos.close();
        s.close();
        so.close();
     }
  }
