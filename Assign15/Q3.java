class Q3 {
    public static void main(String[] args) {
        int x = 10; 
        int y = 5; 
        int z = 7; 
        int result = (x < y) ? (y < z) ? z : y : x; 
        System.out.println(result);
    }
}


// Check x < y:
// 10 < 5 is false, so we skip the inner ternary and go straight to the else part, which sets result to x.
// Thus, result is assigned the value of x, which is 10.