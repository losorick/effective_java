package chapter2._01_UsingStaticFactoryReplaceConstructor.canReturnAnySubclass;

/**
 * Java 8之后可以在接口中设置静态方法，从而可以不用使用伴生类。
 */

public interface Singer {
    
    String saySomething(String something);

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
