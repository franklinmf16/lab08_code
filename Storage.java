package lab08_code;

/**
 * Created by bok on 30/4/18.
 */
public class Storage {
    private RollingStrategy rollingStrategy;

    public Storage(RollingStrategy rollingStrategy) {
        this.rollingStrategy = rollingStrategy;
    }

    public void operate(InputMethods methods){
        this.rollingStrategy.operate(methods);
    }

}
