package chapter2._01_UsingStaticFactoryReplaceConstructor.codingFactoryBeforeCodingReturnClass;

import java.util.ServiceLoader;

/**
 * 在静态方法类中，可以只针对接口进行变成，或者使用 ServiceLoader等方法进行变成，这样可以在只针对服务框架进行程序的编写。
 * 而将实际业务的实现交给具体的实现者。
 */
public class CodingFactoryBeforeCodingReturnClass {

    static Coding getCoding(Coding a){
        return a.getInstance();
    }

}
