class Q4 {
    public static void main(String[] args) {
  int a=20; 
  int b=30; 
  System.out.println(a++>15 && b++>20);  
  System.out.println(a); 
  System.out.println(b); 
    }
}


// In && operator if first condition is true then second condition execute other wise second condition is not executed.
// Here first condition is true, so second condition is also executed and due to this a & b both are increament after display. Hence a = 21 and b = 31.