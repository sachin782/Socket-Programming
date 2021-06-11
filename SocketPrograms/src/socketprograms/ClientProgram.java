package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientProgram {
        public static void main(String args[])throws Exception
    {
        Socket s = new Socket("localhost",3333);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = "";
        String s2 = "Server connected  ";
        dos.writeUTF(s2);
        dos.flush();
        s1 = dis.readUTF();
        System.out.println(s1);    
        dos.close();
        s.close();
    }
}
