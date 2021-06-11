package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientReverse {
        public static void main(String args[])throws Exception
    {
        Socket s = new Socket("localhost",3333);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int n =  Integer.parseInt(br.readLine());
        dos.writeInt(n);
        dos.flush();
        int r = dis.readInt();
        System.out.println("Reverse of number : "+r);   
        dos.close();
        s.close();
    }
}
