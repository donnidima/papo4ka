/**
 * Created by donni on 19.06.2016.
 */
public interface iBarca {
    public double getAge (int date);

    public default String getName(String name) {
        return null;
    }
}
