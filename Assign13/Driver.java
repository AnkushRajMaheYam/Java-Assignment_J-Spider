public class Driver {
    public static void main(String[] args) {
        
        School s1 = new School();
        s1.setValues("school", 2000, 5000);
        s1.getDetails();
        System.out.println("=========");

        Weapon w1 = new Weapon();
        w1.setValues("AK47", 2, 3);
        w1.getDetails();
        System.out.println("============");
        
        Rectangle r1 = new Rectangle();
        r1.setValues(52, 56);
        r1.getDetails();       
        System.out.println("==========");
        
        Circle c1 = new Circle();
        c1.setValues(5);
        c1.getDetails();

    }
}
