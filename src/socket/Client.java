package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {

        try {
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",8888);
            // 打开输出流
            OutputStream os = s.getOutputStream();

            //把输出流封装在DataOutputStream中
            DataOutputStream dos = new DataOutputStream(os);

            //使用Scanner读取控制台的输入，并发送到服务端
            Scanner sc = new Scanner(System.in);

            String str = sc.next();
            dos.writeUTF(str);

            dos.close();
            s.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
