package com.showapi;

import com.show.api.NormalRequest;
import com.show.api.ShowApiRequest;
import java.io.File;
import java.io.IOException;

public class NormalRequestTest {

    public static void main(String argv[]) throws IOException {
        String responseData=new NormalRequest("https://www.showapi.com")//发生https请求
//                .addHeadPara("head-key","head-value")//设置头部
                .addHeads("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8\n" +
                        "Accept-Encoding: gzip, deflate, br\n" +
                        "Accept-Language: zh-CN,zh;q=0.9\n" +
                        "Cache-Control: no-cache\n" +
                        "Connection: keep-alive\n" +
                        "Cookie: UM_distinctid=16720635b1da6b-026bab......423758-1542432509-%7C1542444516\n" +
                        "Host: www.showapi.com\n" +
                        "Pragma: no-cache\n" +
                        "Referer: https://www.showapi.com/\n" +
                        "Upgrade-Insecure-Requests: 1\n" +
                        "User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36")//批量设置头部
                .addTextPara("myname","showapi.com")//请求参数一
//                .addFilePara("fileImg",new File("d:\\123.jpg")) //上传文件时,使用该方法
//                .postAsByte()//发送post请求,返回byte数组,同理可以使用getAsByte()方法
                .get();//发送post请求,返回字符串,同理可以使用post()方法
        System.out.println(responseData);

        //请求万维易源showapi.com上的接口
        String appId = "1234";//接口调用的应用ID
        String appSecret = "5711c3......e613a2";//接口调用的秘钥
        String res=new ShowApiRequest("http://route.showapi.com/64-19","appId","appSecret")
//                .addHeadPara("head-key","head-value")//设置头部
                .addHeads("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8\n" +
                        "Accept-Encoding: gzip, deflate, br\n" +
                        "Accept-Language: zh-CN,zh;q=0.9\n" +
                        "Cache-Control: no-cache\n" +
                        "Connection: keep-alive\n" +
                        "Cookie: UM_distinctid=16720635b1da6b-026bab......423758-1542432509-%7C1542444516\n" +
                        "Host: www.showapi.com\n" +
                        "Pragma: no-cache\n" +
                        "Referer: https://www.showapi.com/\n" +
                        "Upgrade-Insecure-Requests: 1\n" +
                        "User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36")//批量设置头部
                .addTextPara("com","zhongtong")//请求参数一,具体参数参考接口文档
                .addTextPara("nu","632671345422")//请求参数二
//                .addFilePara("file",new File("d:\\123.txt")) //上传文件时,使用该方法
//                .postAsByte()//发送post请求,返回byte数组,同理可以使用getAsByte()方法
                .post();//发送post请求,返回字符串,同理可以使用get()方法
        System.out.println(res);

    }
}
