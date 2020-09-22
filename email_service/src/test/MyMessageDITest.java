package test;

import consumer.Consumer;
import injector.EmailServiceInjector;
import injector.MessageServiceInjector;
import injector.SMSServiceInjector;

/**
 * https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial
 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Heo";
        String email = "heo@gamil.com";
        String phone = "0123456789";
        MessageServiceInjector injector;
        Consumer app;

        // Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);


    }
}
