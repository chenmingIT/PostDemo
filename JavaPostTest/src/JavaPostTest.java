import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

import java.io.*;

public class JavaPostTest {
    public static void postNotReturn(String urlAddr, String value) {
        URL url = null;
        HttpURLConnection conn = null;
        InputStream is = null;
        try {
            url = new URL(urlAddr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);  //使用URL连接进行输入
            conn.setDoOutput(true);   ////使用URL连接进行输出
            conn.setRequestMethod("POST");  //设置URL的请求方法
            //conn.setRequestProperty("Accept-Encoding","gzip");   //?加了乱码
            conn.setRequestProperty("Content-Type","application/json"); 
            conn.setRequestProperty("Connection","keep-alive");
            conn.setRequestProperty("Content-Length","106"); //设置属性设置 key-value
         
            conn.getOutputStream().write(value.getBytes());
            conn.getOutputStream().flush();
            conn.getOutputStream().close();
            
            int code = conn.getResponseCode();
            
            if ( code == HttpURLConnection.HTTP_OK ) {
               is = conn.getInputStream();
               BufferedReader rd = new BufferedReader(new InputStreamReader(is, "utf-8"));
               String line;
               StringBuffer sb = new StringBuffer();
               while ((line = rd.readLine()) != null) {
                   sb.append(line);
               }
               System.out.println(sb.toString());
               rd.close();   //关闭
            }
        } catch (Exception e) {


        } finally {

        }
    }
    public static void main(String[] args) {

        //发送 POST 请求
        String val = "{\"id\":222,\"jsonrpc\":\"2.0\",\"method\":\"Regist.Rank\",\"params\" :{}}";
        String url = "http://10.82.82.105:12345/";
        postNotReturn(url,val);

    }


}


