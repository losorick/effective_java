package chapter2._01_UsingStaticFactoryReplaceConstructor.canReturnAnySubclass;

import java.util.Arrays;
import java.util.Collections;

/**
 * Java 8 之前 可以使用伴生类来进行静态方法获取子类。
 */
public class Singers {

    private Singers() {}

    static Singer getSinger(String name){
        if ("A".equals(name)){
            return new SingerA();
        }else if ("B".equals(name)){
            return new SingerB();
        }else{
            throw new IllegalArgumentException();
        }
    }

}
