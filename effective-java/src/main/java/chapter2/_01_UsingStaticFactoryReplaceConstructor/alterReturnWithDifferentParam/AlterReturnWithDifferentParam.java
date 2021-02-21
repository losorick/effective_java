package chapter2._01_UsingStaticFactoryReplaceConstructor.alterReturnWithDifferentParam;

/**
 * 可以根据参数的不一样来进行返回类型的调整，这样可以屏蔽上层应用的感知，在需要的情况下可以增加返回的类型。
 */
public class AlterReturnWithDifferentParam {

    Counting wantCounting(int number) {
        if (number > 100){
            return new CountingQuick();
        }
        return new CountingSlow();
    }

}
