public class Bottle implements Comparable<Bottle> {
    int ounces;

    public Bottle(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }


    @Override
    public int compareTo(Bottle o) {
        return this.ounces - o.ounces;
    }
}
