package lab08_code;

/**
 * Created by bok on 6/5/18.
 */
public class Manager implements RollingStrategy{
    private RollingStrategy rollingStrategy;

    public void setRollingStrategy(RollingStrategy rollingStrategy) {
        this.rollingStrategy = rollingStrategy;
    }

    @Override
    public void operation(Method method) {
        this.rollingStrategy.operation(method);
    }
}
