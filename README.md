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

        log.setLogPrinter((log, level, msg) -> level+msg+"\n");
        System.out.println("----------------");
        log.info("测试输出：{1}",LocalDate.now());
        log.error("错误输出:{1},{2}",Thread.currentThread(),LocalDate.now());
    }
}
```

产生输出：
```text
2019-01-24T15:38:54.107179900	[INFO]	wang.ismy.log.LogTest	:	测试输出：2019-01-24
2019-01-24T15:38:54.108180200	[ERROR]	wang.ismy.log.LogTest	:	错误输出:Thread[main,5,main],2019-01-24
----------------
INFO测试输出：2019-01-24
ERROR错误输出:Thread[main,5,main],2019-01-24
```
