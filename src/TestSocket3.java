import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestSocket3 {
    public static void main(String[] args) throws IOException {
        InetAddress host = InetAddress.getLocalHost();
        String hostip = host.getHostAddress();
        System.out.println("ip address: " + hostip);

        String pre_ip = hostip.substring(0,hostip.lastIndexOf('.')+1);
        System.out.println("pre-ip address: " + pre_ip);
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(100, 200 , 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());     //线程池处理
        for (int i = 1; i <= 255; i++)
        {
            final int j = i;
            tpe.execute(new Runnable()
            {
                @Override
                public void run()
                {
                    Process P;
                    try
                    {
                        P = Runtime.getRuntime().exec("ping " + pre_ip + j);
                        BufferedReader br = new BufferedReader(new InputStreamReader(P.getInputStream(), "GBK"));
                        String temp = null;
                        boolean tag = false;
                        while ((temp = br.readLine())!=null)
                        {
                            if (temp.contains("TTL"))
                            {
                                tag = true;
                                break;
                            }
                        }
                        if (tag)
                            System.out.println("可用ip地址：" + pre_ip + j);
                    } catch (IOException e)
                    {
                        System.out.println("wocao?");
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
