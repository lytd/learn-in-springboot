package td.learn.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import td.learn.springboot.model.User;

@Configuration
public class MyConfig {
    @Bean
    public User user(){

        User user=new User();
        user.setAge(20);
        user.setName("td");
        return user;
    }

}
