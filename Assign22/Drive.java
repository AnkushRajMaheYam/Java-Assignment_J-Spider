public class Drive {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.setName("HP");
        l1.setprice(78944);
        l1.setclockSpeed(2.4);


        System.out.println(l1.getName());
        System.out.println(l1.getprice());
        System.out.println(l1.getclockSpeed());
    }
}
