# log
这是一个简单java 日志项目
#
2019-1-20

启动了项目

#
2019-1-21

第一个应用：

```java
public class LogTest {

    Log log = Log.getInstance(this.getClass());

    @Test
    public void run(){

        log.setDestination(new Destination(System.out,System.out));
        log.info("测试输出：{1}",LocalDate.now());
        log.error("错误输出:{1},{2}",Thread.currentThread(),LocalDate.now());

        log.setLogPrinter((log, level, msg) -> "["+level+"]\t"+msg+"\n");

        System.out.println("----------------");
        log.info("测试输出：{1}",LocalDate.now());
        log.error("错误输出:{1},{2}",Thread.currentThread(),LocalDate.now());
    }
}
```

产生输出：
```text
2019-01-26T19:29:46.882238500	[INFO]	wang.ismy.log.LogTest	:	测试输出：2019-01-26
2019-01-26T19:29:46.884236500	[ERROR]	wang.ismy.log.LogTest	:	错误输出:Thread[main,5,main],2019-01-26
----------------
[INFO]	测试输出：2019-01-26
[ERROR]	错误输出:Thread[main,5,main],2019-01-26
```
