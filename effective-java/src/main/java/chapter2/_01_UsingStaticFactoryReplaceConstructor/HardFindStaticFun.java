package chapter2._01_UsingStaticFactoryReplaceConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Security;
import java.sql.Date;
import java.sql.SQLData;
import java.util.*;

/**
 * 往往很难反映出具有对应的工厂方法，所以需要对其进行明明规范，常用的有：
 */
public class HardFindStaticFun {

    public static void main(String[] args) throws IOException {

        //from 类型的转换
        //Date d = Date.from(instant)

        //of, valueOf 单个或者多个类型的转换
        Integer integer = Integer.valueOf(1);

        //getInstance 获取实例，但是可能是获取的 是同一个
        // StackWalker luke =  StackWalker.getInstance(options)

        //create newInstance, 获取实例，但是确保每次都是新的
        Object o = Array.newInstance(String.class, 5);

        // getType 在有多种类型的时候 替代 getInstance
        Path path = Paths.get(".");
        FileStore fileStore = Files.getFileStore(path);

        // newType 在有多种类型的时候替代 newInstance
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        //type 简化版本的 getType 和 newType
        Vector<String> dayNames = new Vector<String>();
        ArrayList<String> list = Collections.list(dayNames.elements());
    }

}
