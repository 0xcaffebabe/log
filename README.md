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
        log.info("测试输出：{1}",LocalDate.now());
    }
}
```
