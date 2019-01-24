package wang.ismy.log;

import org.junit.Test;


import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class LogTest {

    Log log = Log.getInstance(this.getClass());

    @Test
    public void run(){

        log.setDestination(new Destination(System.out,System.out));
        log.info("测试输出：{1}",LocalDate.now());
        log.error("错误输出:{1},{2}",Thread.currentThread(),LocalDate.now());

        log.setLogPrinter((log, level, msg) -> level+msg+"\n");
        System.out.println("----------------");
        log.info("测试输出：{1}",LocalDate.now());
        log.error("错误输出:{1},{2}",Thread.currentThread(),LocalDate.now());
    }
}