package com.showapi;

import com.show.api.NormalRequest;
import com.show.api.ShowApiRequest;
import java.io.File;
import java.io.IOException;

public class NormalRequestTest {

    public static void main(String argv[]) throws IOException {

        String res = new NormalRequest("https://www.showapi.com/stat/apiInvokeStat")
                .addHeads("Accept: application/json, text/javascript, */*; q=0.01\n" +
                        "Accept-Encoding: gzip, deflate, br\n" +
                        "Accept-Language: zh-CN,zh;q=0.9\n" +
                        "Cache-Control: no-cache\n" +
                        "Connection: keep-alive\n" +
                        "Content-Length: 33\n" +
                        "Content-Type: application/x-www-form-urlencoded; charset=UTF-8\n" +
                        "Cookie: UM_distinctid=16d4d799b49d18-0915fd72e8da7b-5373e62-1fa400-16d4d799b4ab63; auth=af0dahsLIpXZZv5rHUZxXVLf4yHUXCTL5OhEA8Udeh4/pKfqDXftc5fM5d6QSKuWwoX3HwbTePLlTEw; Hm_lvt_2b8b8260aa5e70de7faf1de4f9221ee0=1574393118,1574433267,1574495336,1574653403; Hm_lpvt_2b8b8260aa5e70de7faf1de4f9221ee0=1574653403; JSESSIONID=88524EB176512F19738CB3CA5E4FFD59; showApiAuth=R49OfEwTUjxU4Vow6WGUiEyb-rgZ9SEg9vd5CjtTas2JRZUvyBWRWRhVvKqR0UgptFEp-dJLimg\n" +
                        "Pragma: no-cache\n" +
                        "Sec-Fetch-Mode: cors\n" +
                        "Sec-Fetch-Site: same-origin\n" +
                        "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36\n" +
                        "X-Requested-With: XMLHttpRequest")
                .addTextPara("type","0")
                .addTextPara("options","1")
                .post();
        System.out.println(res);


    }
}
