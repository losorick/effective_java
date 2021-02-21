package chapter2._01_UsingStaticFactoryReplaceConstructor.canReturnAnySubclass;

public class SingerA implements Singer {
    public String saySomething(String something) {
        return "I say "+something;
    }
}
