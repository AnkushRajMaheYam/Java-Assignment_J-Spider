class Q7 {
    public static void main(String[] args) {
        int a=20; 
        int b=30; 
        System.out.println(a++>15 || b++>20); 
        System.out.println(a); 
        System.out.println(b); 
    }
}


// In || operator will skip second operends if its first operend is true.
// Here first condition is true, so second condition(operend) is not executed and due to this a is increment & b is not executed after display. Hence a = 21 and b = 30.
