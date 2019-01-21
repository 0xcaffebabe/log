package wang.ismy.log;

import java.time.LocalDateTime;

public class Log {



    private Destination destination = new Destination();

    private String logName;

    private Log(String logName) {
        this.logName = logName;
    }



    public synchronized static Log getInstance(String logName) {
        return new Log(logName);
    }

    public synchronized static Log getInstance(Class<?> klass) {
        return new Log(klass.getName());
    }

    public void info(String format, Object... params) {

        String result = format;

        for (int i = 0; i < params.length; i++) {
            result = result.replace("{"+(i+1)+"}",params[i].toString());
        }

        destination.printOut(LocalDateTime.now()+" [INFO]  "+logName+" : "+result+"\n");
    }
}
