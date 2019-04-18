package td.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main(String[] args )
    {
        SpringApplication springApplication=new SpringApplication(App.class);
        //人工设置
        //springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext applicationContext=springApplication.run(args);

        System.out.println("当前的web类型为:"+springApplication.getWebApplicationType());
        System.out.println("当前上下文:"+applicationContext.getClass().getName());
    }
}
