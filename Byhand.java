package lab08_code;


import java.io.File;

public class Byhand implements RollingStrategy{
    @Override
    public void operation(Method method) {
        System.out.println(method.toString());

    }



}
