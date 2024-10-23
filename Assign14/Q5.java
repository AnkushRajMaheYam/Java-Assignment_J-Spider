class Q5 {
    public static void main(String[] args) {
        int a=20; 
        int b=30; 
        System.out.println(a++>25 && b++>20); 
        System.out.println(a); 
        System.out.println(b); 
    }
}


// In && operator if first condition is true then second condition execute other wise second condition is not executed.
// Here first condition is false, so second condition is not executed and due to this a is increament and b is not change after display. Hence a = 21 and b = 30.