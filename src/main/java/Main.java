public class Main {
    public static void main(String[] args) {
        FixedList<Bottle> sixpack = new FixedList<>(6);

        sixpack.add(new Bottle(12));
        sixpack.add(new Bottle(12));
        sixpack.add(new Bottle(1));
        sixpack.add(new Bottle(2));
        sixpack.add(new Bottle(222));

        for (Bottle b: sixpack.getItems()){
            System.out.println(b.ounces);
        }


    }
}
