/**
 * Created by donni on 19.06.2016.
 */
public abstract class FCBarcelona {
    public String name;
    public int age;
    public double sallary (double play, double bus, double advert) {
        double sallary = play * 0.25 + bus * 0.25 + advert * 0.25;
        return sallary;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public double getAge () {
        return age;
    }
    public void setAge (int age) {
        switch (this.age = age) {
        }
    }


}
