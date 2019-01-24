package wang.ismy.log;

import java.time.LocalDateTime;

public class DefaultLogPrinter implements LogPrinter {

    @Override
    public String print(Log log, LogLevel level, String msg) {

        StringBuilder sb = new StringBuilder();
        sb.append(LocalDateTime.now())
                .append("\t[")
                .append(level.getLevel())
                .append("]\t")
                .append(log.getLogName())
                .append("\t:\t")
                .append(msg)
                .append("\n");


        return sb.toString();
    }
}
