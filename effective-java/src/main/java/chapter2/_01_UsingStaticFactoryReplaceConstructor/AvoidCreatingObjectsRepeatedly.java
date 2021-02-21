package chapter2._01_UsingStaticFactoryReplaceConstructor;

/**
 * 1. 静态工厂方法可以返回已有的对象，避免重复的创建对象，这样能极大的提高性能
 * 2. 可以灵活的把握创建对象的时机，比如保证对象是单例的。
 *
 */
public class AvoidCreatingObjectsRepeatedly {

    private static final AvoidCreatingObjectsRepeatedly BIG = new AvoidCreatingObjectsRepeatedly("大");

    private static final AvoidCreatingObjectsRepeatedly SMALL = new AvoidCreatingObjectsRepeatedly("小");

    private String result;

    /**
     * 当输入大于3的时候 返回大的对象，反之返回小的对象
     * @param a
     * @return
     */

    public static AvoidCreatingObjectsRepeatedly getResult(int a){
        if (a >3){
            return BIG;
        }else{
            return SMALL;
        }
    }

    public AvoidCreatingObjectsRepeatedly(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
