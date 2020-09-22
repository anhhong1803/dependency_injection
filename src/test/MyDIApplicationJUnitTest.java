package test;

import consumer.Consumer;
import consumer.MyIDApplication;
import injector.MessageServiceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.MessageService;

public class MyDIApplicationJUnitTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        // mock the injector with anonymous class
        injector = () -> {
                // mock the message service
                return new MyIDApplication((msg, rec) -> System.out.println("Mock message service implementation"));
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Heo", "heo@gmail.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
