package chapter2._01_UsingStaticFactoryReplaceConstructor;

/**
 * 1. 使用静态工厂方法可以 为方法起一个指定的名字用于明确起功能。
 * 2. 对于参数列表相同的方法，可以通过名称来避免使用混乱
 */
public class NameStaticFactory {

    private int value;

    /**
     * 获取一个 值为1 的 NameStaticFactory
     *
     * @return NameStaticFactory
     */

    public static NameStaticFactory getOne() {
        return new NameStaticFactory(1);
    }

    /**
     * 获取一个 值为2 的 NameStaticFactory
     *
     * @return NameStaticFactory
     */
    public static NameStaticFactory getTwo() {
        return new NameStaticFactory(2);
    }

    /**
     * 获取一个和
     * @param a number a
     * @param b number b
     * @return NameStaticFactory
     */
    public static NameStaticFactory getSum(int a, int b) {
        return new NameStaticFactory(a + b);
    }

    /**
     * 获取一个差值
     * @param a number a
     * @param b number b
     * @return NameStaticFactory
     */
    public static NameStaticFactory getDValue(int a, int b) {
        return new NameStaticFactory(a - b);
    }

    private NameStaticFactory(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
