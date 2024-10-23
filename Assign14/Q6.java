class Q6 {
    public static void main(String[] args) {
        int a=20; 
        int b=30; 
        System.out.println(a++>25 || b++>20); 
        System.out.println(a); 
        System.out.println(b); 
    }
}

// In || operator will skip second operends if its first operend is true.
// Here first condition is false, but second condition is also executed and due to this a & b both are increament after display. Hence a = 21 and b = 31.