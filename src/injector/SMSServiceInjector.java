package injector;

import consumer.Consumer;
import consumer.MyIDApplication;
import service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyIDApplication(new SMSServiceImpl());
    }
}
