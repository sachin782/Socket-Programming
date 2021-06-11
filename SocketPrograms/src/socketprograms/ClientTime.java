package socketprograms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientTime {
        public static void main(String args[])throws Exception
    {
        Socket s = new Socket("localhost",3333);
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()  ));
        System.out.println(br.readLine());
        s.close();
    }
}
