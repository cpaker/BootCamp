package core.logging;

import core.logging.Logger;

public class MailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Mail gönderildi : " + message);
    }
}
