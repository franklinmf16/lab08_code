package lab08_code;

import java.io.*;

/**
 * Created by bok on 30/4/18.
 */
public class ByFile implements RollingStrategy {
    @Override
    public void operation(Method method) {
        //System.out.println("by File class ByFile");
        method.printFile(method.getFile());


    }
}
