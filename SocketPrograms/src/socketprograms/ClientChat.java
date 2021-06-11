package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientChat {
    public static void main(String args[])throws Exception
    {
        Socket s = new Socket("localhost",3333);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1="",s2="";  
        while(!s1.equals("stop"))
        {  
            s1=br.readLine();  
            dos.writeUTF(s1);  
            dos.flush();  
            s2=dis.readUTF();  
            System.out.println("Server: "+s2);  
        }  
        dos.close();  
        s.close();  
    }
}  
