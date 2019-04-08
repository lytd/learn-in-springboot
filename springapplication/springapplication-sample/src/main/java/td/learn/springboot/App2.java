package td.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App2
{
    public static void main( String[] args )
    {
        //创建引导
        new SpringApplicationBuilder(App2.class)
                .properties("server.port=0")  // 随机向 OS 要可用端口
                .run(args);//启动
    }
}
