package wang.ismy.log;


/*
* 实现该接口的类，可以被Log所注册，能自定义日志输出格式
*/
public interface LogPrinter {

    String print(Log log,LogLevel level,String msg);
}
