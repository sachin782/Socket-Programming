package socketprograms;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientSorting {
        public static void main(String args[])throws Exception
    {
        Socket s = new Socket("localhost",3333);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array:");
        int a[] = new int[10];
        int b[]=new int[10];
        for(int i = 0;i<10;i++ )
        {
            a[i] = Integer.parseInt(br.readLine());
            dos.writeInt(a[i]);
        }
        dos.flush();
        System.out.print("Sorted array: ");
        for(int i=0;i<10;i++)
        {
          b[i] = dis.readInt();
          System.out.print(b[i]+" ");   
        }
        System.out.println();
        dos.close();
        s.close();
    }
}
