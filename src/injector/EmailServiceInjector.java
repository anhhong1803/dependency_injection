package injector;

import consumer.Consumer;
import consumer.MyIDApplication;
import service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyIDApplication(new EmailServiceImpl());
    }
}
