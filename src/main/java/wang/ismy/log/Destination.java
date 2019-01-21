package wang.ismy.log;

import java.io.OutputStream;
import java.io.PrintStream;

/*
* 输出目的地的抽象表示，内含正常及错误两个打印输出流
*/
public class Destination {

    private PrintStream normalStream;
    
    private PrintStream errorStream;

    public Destination() {
        normalStream = System.out;
        errorStream = System.err;
    }

    public Destination(PrintStream normalStream, PrintStream errorStream) {
        this.normalStream = normalStream;
        this.errorStream = errorStream;
    }
    
    public void printErr(String str){
        errorStream.print(str);
    }

    public void printOut(String str){
        normalStream.print(str);
    }
    
    
}
