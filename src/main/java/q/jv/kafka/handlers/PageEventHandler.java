package q.jv.kafka.handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import q.jv.kafka.events.PageEvent;

import java.util.function.Consumer;

@Component
public class PageEventHandler {
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("***************");
            System.out.println(input.toString());
            System.out.println("***************");
        };
    }
}
