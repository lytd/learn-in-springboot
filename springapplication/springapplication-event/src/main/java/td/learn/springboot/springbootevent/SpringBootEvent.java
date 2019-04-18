package td.learn.springboot.springbootevent;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class SpringBootEvent {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootEvent.class)
                .listeners(event-> {
                    System.err.println("监听到事件:" + event.getClass().getSimpleName());
                })
                .run(args);
    }
}
