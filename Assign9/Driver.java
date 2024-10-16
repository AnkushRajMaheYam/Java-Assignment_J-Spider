
public class Driver {
    
    public static void main(String[] args) {
        //1. Student
        System.out.println("-----call Student Class-----");
        Student s1 = new Student();
        s1.name = "Ankush";
        s1.age=20;
        s1.sid=101;
        s1.sub="math";
        System.out.println("Student Id : "+s1.sid);
        System.out.println("Student Name : "+s1.name);
        System.out.println("Student age : "+s1.age);
        System.out.println("Student sub : "+s1.sub);
        s1.read();
        s1.write();
        System.out.println("-----call Student Class of 2nd student-----");
        Student s2 = new Student();
        s2.name = "Raj";
        s2.age=22;
        s2.sid=102;
        s2.sub="bio";
        System.out.println("2nd Student Id : "+s2.sid);
        System.out.println("2nd Student Name : "+s2.name);
        System.out.println("2nd Student age : "+s2.age);
        System.out.println("2nd Student sub : "+s2.sub);
        s2.read();
        s2.write();



        //2. School
        System.out.println("----call School Class-----");
        School s = new School();

        s.name="Bal Niketan Public School";
        s.board="CBSE";
        s.std=12;
        s.noOfStudents=1200;

        System.out.println("School's name is :"+s.name);
        System.out.println("School's Board name is :"+s.board);
        System.out.println("School Max Standard is :"+s.std);
        System.out.println("NO of Student in This School is :"+s.name);

        s.classRun();
        s.events();


        //3. Browser
        System.out.println("----call Browser Class-----");
        Browser b = new Browser();

        b.name="Bal Niketan Public School";
        b.size=28.6;
        b.version=12.5;
        b.icons=120;

        System.out.println("Browser size is :"+b.size);
        System.out.println("Browser name is :"+b.name);
        System.out.println("Browser version is :"+b.version);
        System.out.println("NO of icons in Browser is :"+b.icons);

        b.features();
        b.search();

        





    }
}
