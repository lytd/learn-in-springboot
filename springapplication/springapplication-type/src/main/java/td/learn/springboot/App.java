package td.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        SpringApplication springApplication=new SpringApplication(App.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext applicationContext=springApplication.run(args);

        System.out.println("当前上下文:"+applicationContext.getClass().getName());
    }
}
