public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService cs = new CivilService();
        System.out.println(cs.getDaysLeft());
        MilitaryService ms = new MilitaryService(111);
        System.out.println(ms.getDaysLeft());
        ms.work();
    }
}
