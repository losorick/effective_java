package chapter2._01_UsingStaticFactoryReplaceConstructor.canReturnAnySubclass;

public class SingerB implements Singer {
    public String saySomething(String something) {
        return "You say "+something;
    }
}
