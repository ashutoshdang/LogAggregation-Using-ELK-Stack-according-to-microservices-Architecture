/**
 * 
 *//*
package com.asu;

*//**
 * @author Ashutosh Dang(ashutosh@sdrc.co.in)
 * Created Date :  27-Jul-2018 10:35:47 am
 *//*
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.logback.AmqpAppender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.encoder.Encoder;
import lombok.Getter;
import lombok.Setter;

public class AmqpLogbackAppender extends AmqpAppender {

    @Getter
    @Setter
    private Encoder<ILoggingEvent> encoder;

    *//**
     * We remove the default message layout and replace with the JSON {@link Encoder}
     *//*
    @Override
    public Message postProcessMessageBeforeSend(Message message, Event event) {
        return new Message(this.encoder.encode(event.getEvent()), message.getMessageProperties());
    }

    @Override
    public void start() {
        super.start();
        encoder.setContext(getContext());

        if (!encoder.isStarted()) {
            encoder.start();
        }

    }

    @Override
    public void stop() {
        super.stop();
        encoder.stop();
    }

}*/