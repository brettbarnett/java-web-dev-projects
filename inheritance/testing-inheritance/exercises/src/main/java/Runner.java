public class Runner {
    public static void main(String[] args) {
        HouseCat fluffy = new HouseCat("Fluffy", 20);
        fluffy.eat();
        System.out.println(fluffy.isTired());
    }
}
