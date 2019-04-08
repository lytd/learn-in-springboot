package td.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //创建引导类
        SpringApplication springApplication=new SpringApplication(App.class);
        //创建参数集
        Map<String,Object> map=new LinkedHashMap<>();
        //添加参数
        map.put("server.port",0);
        //设置参数
        springApplication.setDefaultProperties(map);
        //启动引导类
        springApplication.run(args);
    }
}
