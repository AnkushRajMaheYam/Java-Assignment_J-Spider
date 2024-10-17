// Understanding of Memory ALocation. // Heap and Stack Memory //How to all static and non-static methods
class Employees {
    static String cname = "Qspider"; //can assign vlaue in static members either here or during object creation or static members call with every non-static object in heap area. also static members call at class reference if it is call in other class else call it directly.
           String ename;
           int empId;
           double salary;



           public static void attendance(){
            System.out.println("Employees Attendance");
           }

           public void work(){
            System.out.println("Employee is working Now");
           }


           public static void main(String[] args){   // main method crate in stack memory else oject create in heap memory location.
            System.out.println("----Calling of Fast Employee----");
             
            Employees e1 = new Employees();
            e1.empId=101;
            e1.ename="Ankush";
            e1.salary=22345.9784;
            // due to its(static member) in same class so it can call directly but we call this as by object reference like e1.cname after the object creation.
            System.out.println("Company Name of Employee 1st : "+cname);
            System.out.println("Employee Id of Employee 1st : "+e1.empId);
            System.out.println("Employee Name of Employee 1st : "+e1.ename);
            System.out.println("Employee Salary of Employee 1st : "+e1.salary);

            attendance(); //or e1.attendance(); // due to static method
            e1.work();

            System.out.println("----Calling of Second Employee----");
             
            Employees e2 = new Employees();
            e2.empId=102;
            e2.ename="Raj";
            e2.salary=12345.678;
            // due to its(static member) in same class so it can call directly but we call this as by object reference like e1.cname after the object creation.
            System.out.println("Company Name of Employee 2nd : "+e2.cname); //or cname; or e1.cname;
            System.out.println("Employee Id of Employee 2nd : "+e2.empId);
            System.out.println("Employee Name of Employee 2nd : "+e2.ename);
            System.out.println("Employee Salary of Employee 2nd : "+e2.salary);

            e2.attendance(); //or e1.attendance; or attendance; // due to static method
            e2.work();




             
           }
}
