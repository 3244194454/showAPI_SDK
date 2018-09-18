import com.show.api.ShowApiRequest;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String appid="";//应用ID,请在showapi.com-->个人中心-->我是接口使用者->我的应用 中查找
        String secret="";//应用密钥 
        //调用示例
        String res=new ShowApiRequest("http://route.showapi.com/66-22", appid, secret)
                .addTextPara("code","6938166920785")
                .post();

        System.out.println(res);//调用结果--返回的是json字符串

    }
}
