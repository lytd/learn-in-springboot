package td.learn.springboot.springevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

public class SpringEvent {
    public static void main(String[] args) {

        GenericApplicationContext genericApplicationContext=new GenericApplicationContext();
        //添加全事件监听器
        genericApplicationContext.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.err.println("获取事件:" + event.getClass().getSimpleName());
            }
        });
        //添加自定义事件监听器
        genericApplicationContext.addApplicationListener(new MyListener());
        //容器刷新操作
        genericApplicationContext.refresh();
        //发布payload事件
        genericApplicationContext.publishEvent("自定义");
        //发布自定义事件
        genericApplicationContext.publishEvent(new MyEvent("MyEvent!!!"));
        //容器关闭操作
        genericApplicationContext.close();

    }
}

class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.err.println("监听到自定义事件:" + event.getSource());
    }
}
class MyEvent extends ApplicationEvent{
    public MyEvent(Object source) {
        super(source);
    }
}