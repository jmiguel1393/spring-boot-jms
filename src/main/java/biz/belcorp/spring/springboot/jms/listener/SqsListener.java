package biz.belcorp.spring.springboot.jms.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
@Log4j2
public class SqsListener {

    @JmsListener(destination = "${queue.name}")
    public void receive(String message) throws JMSException {
        log.info("Received message {}", message);
        System.out.println(message);
    }
}
