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
            System.out.printf("***************");
            System.out.printf(input.toString());
            System.out.printf("***************");
        };
    }
}
