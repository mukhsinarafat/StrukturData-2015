import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Mukhsin
 */
public class LapenSocketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            Socket s = new Socket("192.168.43.139", 33333);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
           
            String pesan = "Mukhsin Arafat (1408107010073)\r\n";
           
            os.write(pesan.getBytes());
           

            int c;
            while(true)
            {
                c=is.read();
                System.out.print((char)c);
               
                if((char)c=='\n')
                    break;
            }
           
            is.close();
            os.close();
            s.close();
        } catch (Exception ex) {
            System.out.println("Failled");

        }
    }
}