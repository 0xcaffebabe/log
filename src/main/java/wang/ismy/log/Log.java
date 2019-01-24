package wang.ismy.log;

import java.time.LocalDateTime;

public class Log {

    private Destination destination = new Destination();

    private String logName;

    private LogPrinter logPrinter = new DefaultLogPrinter();

    private Log(String logName) {
        this.logName = logName;
    }

    public synchronized static Log getInstance(String logName) {
        return new Log(logName);
    }

    public synchronized static Log getInstance(Class<?> klass) {
        return new Log(klass.getName());
    }

    public Destination getDestination() {
        return destination;
    }

    public String getLogName() {
        return logName;
    }

    public void info(String format, Object... params) {

        String result = format;

        for (int i = 0; i < params.length; i++) {
            result = result.replace("{"+(i+1)+"}",params[i].toString());
        }

        destination.printOut(logPrinter.print(this,LogLevel.INFO,result));
    }

    public void warm(String format, Object... params) {

        String result = format;

        for (int i = 0; i < params.length; i++) {
            result = result.replace("{"+(i+1)+"}",params[i].toString());
        }

        destination.printOut(logPrinter.print(this,LogLevel.WARM,result));
    }

    public void error(String format, Object... params) {

        String result = format;

        for (int i = 0; i < params.length; i++) {
            result = result.replace("{"+(i+1)+"}",params[i].toString());
        }

        destination.printErr(logPrinter.print(this,LogLevel.ERROR,result));
    }


    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setLogPrinter(LogPrinter logPrinter) {
        this.logPrinter = logPrinter;
    }
}
