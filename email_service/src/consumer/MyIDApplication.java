package consumer;

import service.MessageService;

public class MyIDApplication implements Consumer {

    private MessageService service;

    public MyIDApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
