class Q4 {
    public static void main(String[] args) {
        int a = 5; 
        int b = 10; 
        int c = (a > b) ? b++ : (a < b) ? --b : b;
        System.out.println(c);  
    }   
}


// This line contains a nested ternary operator. It works as follows:

// First, check if a > b.
// 5 > 10 is false, so move to the next condition.
// Now, check if a < b (since the previous condition was false).
// 5 < 10 is true, so the value of c will be assigned --b (which means b is decremented by 1 and then used).
// Breakdown of the decrement operation:
// --b decreases b from 10 to 9.
// Now, c is assigned the value 9.