class Q6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 3;
        int result = (x > y) ? (y > z) ? x : y : (x > z) ? x : z;
        System.out.println(result);
    }
}


// This line contains a nested ternary operator, which works as follows:

// First, check if x > y.

// 5 > 7 is false, so the second part (after the :) is executed.
// Since x > y is false, the next condition is checked: x > z.

// 5 > 3 is true, so x is chosen as the value for result.
// Now, the value of result is 5.