package core.logging;

public class DBLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Veri tabanına loglandı : " + message);

    }
}
