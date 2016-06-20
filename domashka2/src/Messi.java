/**
 * Created by donni on 19.06.2016.
 */
public class Messi extends FCBarcelona {
    public double getAge(int date) {
        return 28 - date;
    }
    public String getSourcesOfIncome () {
        return "Football, " + "adidas, " + "lays";
    }
    public String toString (){
        return getClass().getName()+"'sallary per week = " + sallary(250000,100000,100000);
    }
    public static void main (String [] args) {
        Messi messi = new Messi ();
        messi.setName("Lionel Messi");
        messi.setAge(28);
        System.out.println("The name of this guy is " +messi.name);
        System.out.println("He's age is " + messi.age + "years old ");
        System.out.println("Lionel Messi is the Best player of our planet");
        System.out.println(messi.toString());
    }
}
