# Number Based Programming Assignments

This repository contains a comprehensive set of number-based programming problems. Each problem focuses on specific number operations, problem-solving techniques, and algorithm implementations. 

The problems range from basic operations to advanced mathematical challenges, including prime numbers, palindromes, number conversions, and more.

## Repository Structure

Each problem is assigned a unique question number (e.g., `Q1`, `Q2`, etc.). These questions are categorized and numbered sequentially.

---

### List of Questions

1. **Armstrong Number Check**  
   WAJP to take user input and print whether the number is an Armstrong number or not.  
   **Q1**

An **Armstrong number** (also known as a **narcissistic number**, **pluperfect digital invariant (PPDI)**) is a number that is equal to the sum of its digits each raised to the power of the number of digits.

**Examples of Armstrong Numbers**
The first few are given by 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, ... 
- 153: 
   - It has 3 digits.
   - 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
   - Hence, 153 is an Armstrong number.

- 9474:
   - It has 4 digits.
   - 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474.
   - Hence, 9474 is an Armstrong number.

---

2. **All Armstrong Numbers Up to 100**  
   WAJP to print and count all the Armstrong numbers up to 100.  
   **Q2**

---

3. **Prime Number Check**  
   WAJP to take user input and print whether the number is Prime or not.  
   **Q3**
     **Definition of a Prime Number**

A **prime number** is a natural number greater than 1 that has no divisors other than 1 and itself. In other words, a prime number is only divisible by 1 and itself.

 **Key Points**
1. A prime number must be **greater than 1**.
2. It has **exactly two positive divisors**: 1 and the number itself.

 **Examples of Prime Numbers**
- 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, etc.


 **Special Cases**
- 2: The smallest and the only **even prime number**.
- 1 : Not a prime number as it does not have two distinct positive divisors.
---

4. **All Prime Numbers in a Range**  
   WAJP to print and count all the Prime numbers up to a given range.  
   **Q4**
---
5. **Alternate Prime Numbers**  
   WAJP to print all the alternate Prime numbers up to a given range.  
   - Example Outputs:  
     - 2, 5, 11, 17...  
     - 3, 7, 13, 19  
   **Q5**
---
6. **Prime Numbers With Prime Sum Digits**  
   WAJP to print and count all prime numbers in a range where the sum of digits is also prime.  
   **[TCS NQT 2024]**  
   **Q6**
---
7. **Palindrome Number Check**  
   WAJP to take user input and check whether the number is a palindrome or not.  
   **Q7**


 **Palindrome Number**

A **palindrome number** is a number that remains the same when its digits are reversed.

 **Key Characteristics**:
- A palindrome number reads the same forwards and backwards.
- Examples of palindrome numbers are `121`, `454`, `12321`, `999`, etc.
 **How to Check if a Number is Palindrome**

To determine if a number is a palindrome:
1. Reverse the digits of the number.
2. Compare the reversed number to the original number.
3. If they are the same, the number is a palindrome.
 **Example**

 **Palindrome**:
- **Input**: `121`
  - Reverse: `121`
  - Since `121 == 121`, it is a palindrome.

 **Not a Palindrome**:
- **Input**: `123`
  - Reverse: `321`
  - Since `123 != 321`, it is not a palindrome.

---

8. **Palindrome Numbers in a Range**  
   WAJP to print and count all the palindrome numbers in a given range.  
   **Q8**
---

9. **LeetCode Palindrome Problem**  
   [Given an integer x, return true if x is a 
palindrome, and false otherwise.](https://leetcode.com/problems/palindrome-number/description/)  
   **Q9**

- **Leetcode Answer Link:** [Palindrome Solutions](https://leetcode.com/submissions/detail/1471843450/)


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1

---

10. **Prime Palindrome Numbers**  
    WAJP to print all palindrome numbers in a range that are also prime numbers.  
    **Q10**
---

11. **LeetCode Prime Palindrome Problem**  
    [Given an integer n, return the smallest prime palindrome greater than or equal to n.](https://leetcode.com/problems/prime-palindrome/description/)  
    **Q11**

    - **Leetcode Answer Link:** [PrimePalindrome Solutions](https://leetcode.com/problems/prime-palindrome/solutions/6129991/very-simple-way-solution-in-java-for-smallest-prime-palindrome-greater-than-or-equal-to-n/)

An integer is prime if it has exactly two divisors: 1 and itself. Note that 1 is not a prime number.

For example, 2, 3, 5, 7, 11, and 13 are all primes.
An integer is a palindrome if it reads the same from left to right as it does from right to left.

For example, 101 and 12321 are palindromes.
The test cases are generated so that the answer always exists and is in the range [2, 2 * 108].

 

Example 1:

Input: n = 6
Output: 7
Example 2:

Input: n = 8
Output: 11
Example 3:

Input: n = 13
Output: 101
 

Constraints:

1 <= n <= 108

---

12. **Perfect Number Check**  
    WAJP to take user input and print whether the number is a perfect number or not.  
    **Q12**

 **What is a Perfect Number?**

A **perfect number** is a positive integer that is equal to the sum of its **proper divisors** (excluding itself).  

 **Key Characteristics**:
1. A number \( n \) is perfect if the sum of its divisors (excluding \( n \) itself) equals \( n \).  
2. Proper divisors are the positive divisors of \( n \) other than \( n \) itself.  

---
 **Examples of Perfect Numbers**

 **Example 1**: \( 6 \)  
- Proper divisors of \( 6 \): \( 1, 2, 3 \).  
- Sum of divisors: \( 1 + 2 + 3 = 6 \).  
- \( 6 \) is a perfect number.  

 **Example 2**: \( 28 \)  
- Proper divisors of \( 28 \): \( 1, 2, 4, 7, 14 \).  
- Sum of divisors: \( 1 + 2 + 4 + 7 + 14 = 28 \).  
- \( 28 \) is a perfect number.  

 **Example 3**: \( 496 \)  
- Proper divisors of \( 496 \): \( 1, 2, 4, 8, 16, 31, 62, 124, 248 \).  
- Sum of divisors: \( 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496 \).  
- \( 496 \) is a perfect number.  
 **Properties of Perfect Numbers**

1. **Rarity**: Perfect numbers are rare and grow very large quickly.  
2. **Relationship with Mersenne Primes**:  
   - A number is perfect if and only if it can be written in the form:  
     \[
     n = 2^{p-1} \times (2^p - 1)
     \]  
     where \( 2^p - 1 \) is a **Mersenne prime** (a prime number of the form \( 2^p - 1 \)).  
   - For example:  
     - \( p = 2 \): \( 2^{2-1} \times (2^2 - 1) = 1 \times 3 = 6 \).  
     - \( p = 3 \): \( 2^{3-1} \times (2^3 - 1) = 4 \times 7 = 28 \).  

3. **Even Nature**: All known perfect numbers are even. It is unknown if odd perfect numbers exist.  

 **How to Check if a Number is Perfect**

1. Find all divisors of the number (excluding itself).  
2. Compute the sum of these divisors.  
3. Compare the sum with the original number:  
   - If they are equal, the number is perfect.  

---


13. **All Perfect Numbers Up to 100**  
    WAJP to print and count all the perfect numbers up to 100.  
    **Q13**
---

14. **LeetCode Perfect Number Problem**  
    [Given an integer n, return true if n is a perfect number, otherwise return false.](https://leetcode.com/problems/perfect-number/description/)  
    **Q14**
    A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.


Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
 

Constraints:

1 <= num <= 108

- **Leetcode Answer Link:** [Easiest Solution to determine Perfect Number](https://leetcode.com/problems/perfect-number/solutions/6133614/ease-way-in-java-for-perfect-number-by-ankush-raj/)
    

---

15. **Dissarium Number Check**  
    WAJP to take user input and print whether the number is a Dissarium number or not.  
    **Q15**
    
A **Disarium Number** is a number where the sum of its digits, each raised to the power of its positional order, equals the number itself.

 **Formula**:
For a number \( n \) with digits \( d_1, d_2, \dots, d_k \):
\[
n = d_1^1 + d_2^2 + \dots + d_k^k
\]
Where \( d_1 \) is the first digit, \( d_2 \) is the second digit, and so on.

 **Examples of Disarium Numbers**

 **Example 1**: \( 135 \)  
- Digits: \( 1, 3, 5 \)  
- Positional Powers:  
  \[
  1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
  \]
- Since the sum equals the original number, \( 135 \) is a Disarium Number.

 **Example 2**: \( 89 \)  
- Digits: \( 8, 9 \)  
- Positional Powers:  
  \[
  8^1 + 9^2 = 8 + 81 = 89
  \]
- Since the sum equals the original number, \( 89 \) is a Disarium Number.

 **Example 3**: \( 175 \)  
- Digits: \( 1, 7, 5 \)  
- Positional Powers:  
  \[
  1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175
  \]
- \( 175 \) is a Disarium Number.

 **Non-Disarium Numbers**
Numbers that do not satisfy this property are **not Disarium Numbers**. For example:

 **Example**: \( 10 \)  
- Digits: \( 1, 0 \)  
- Positional Powers:  
  \[
  1^1 + 0^2 = 1 + 0 = 1
  \]
- Since \( 1 \neq 10 \), \( 10 \) is not a Disarium Number.

 **How to Identify a Disarium Number**

1. **Extract Digits**:
   - Break the number into its individual digits.

2. **Compute Positional Powers**:
   - Raise each digit to the power of its positional index (starting from 1).

3. **Sum the Powers**:
   - Compute the sum of all these powers.

4. **Compare with the Original Number**:
   - If the sum equals the original number, it is a Disarium Number.


 **Examples of Disarium Numbers (Below 200)**
- \( 1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 135, 175 \)




---

16. **All Dissarium Numbers Up to 1000**  
    WAJP to print and count all the Dissarium numbers up to 1000.  
    **Q16**

---

17. **LeetCode Happy Number Problem**  
    [Write an algorithm to determine if a number n is happy.](https://leetcode.com/problems/happy-number/)  
    **Q17**

    
    - **Leetcode Answer Link:** [World's Easiest Solution to Determine a Happy Number](https://leetcode.com/problems/happy-number/solutions/6136792/world-s-easiest-solution-to-determine-a-happy-number-ankush-raj-ankush-raj-mahe-yam/)



    ### **What is a Happy Number?**

A **happy number** is a positive integer that satisfies the following process:  

1. **Sum of Squares of Digits**:
   - Starting with any positive integer \( n \), replace it with the sum of the squares of its digits.  

2. **Repeat the Process**:
   - Continue replacing the number with the sum of the squares of its digits until one of the following happens:
     - The number becomes `1` (indicating the number is happy).  
     - The number enters a cycle that does not include `1` (indicating the number is not happy).  


 **Examples of Happy Numbers**


 **Example 1**: \( n = 19 \)  
- \( 19 \rightarrow 1^2 + 9^2 = 82 \)  
- \( 82 \rightarrow 8^2 + 2^2 = 68 \)  
- \( 68 \rightarrow 6^2 + 8^2 = 100 \)  
- \( 100 \rightarrow 1^2 + 0^2 + 0^2 = 1 \)  
- \( n = 19 \) is a happy number because the process ends at `1`.  


 **Example 2**: \( n = 7 \)  
- \( 7 \rightarrow 7^2 = 49 \)  
- \( 49 \rightarrow 4^2 + 9^2 = 97 \)  
- \( 97 \rightarrow 9^2 + 7^2 = 130 \)  
- \( 130 \rightarrow 1^2 + 3^2 + 0^2 = 10 \)  
- \( 10 \rightarrow 1^2 + 0^2 = 1 \)  
- \( n = 7 \) is also a happy number.  



 **Examples of Unhappy Numbers**


 **Example 1**: \( n = 4 \)  
- \( 4 \rightarrow 4^2 = 16 \)  
- \( 16 \rightarrow 1^2 + 6^2 = 37 \)  
- \( 37 \rightarrow 3^2 + 7^2 = 58 \)  
- \( 58 \rightarrow 5^2 + 8^2 = 89 \)  
- \( 89 \rightarrow 8^2 + 9^2 = 145 \)  
- \( 145 \rightarrow 1^2 + 4^2 + 5^2 = 42 \)  
- \( 42 \rightarrow 4^2 + 2^2 = 20 \)  
- \( 20 \rightarrow 2^2 + 0^2 = 4 \) (Cycle starts again).  

The number `4` is not a happy number because it enters a cycle and never reaches `1`.  

 **Key Characteristics**
1. **Happy Numbers Always Reach `1`**:
   - If the process results in `1`, the number is happy.  

2. **Unhappy Numbers Enter a Cycle**:
   - Numbers that are not happy will enter a repetitive cycle of values.  

3. **Properties of Happy Numbers**:
   - Happy numbers are always positive integers.  
   - Numbers like \( 1 \) and \( 7 \) are inherently happy.  

---

18. **All Happy Numbers Up to 100**  
    WAJP to print and count all the Happy numbers up to 100.  
    **Q18**

    n=86 -> sum of sq = 64+36=100 -> sum of sq = 1+0+0 =1 (check one digit number(if it is equal to 1 and 7 ))
    
---

19. **Automorphic Number Check**  
    WAJP to take user input and print whether the number is Automorphic or not.  
    **Q19**


 **What is an Automorphic Number?**

An **Automorphic Number** is a number whose **square ends with the same digits as the number itself**.  


 **Definition**:
If a number \( n \) satisfies the condition:  
\[
n^2 \, \text{(ends with)} \, n
\]
then \( n \) is an **Automorphic Number**.

 **Examples of Automorphic Numbers**


 **Example 1**: \( 5 \)  
- \( 5^2 = 25 \)  
- The square (\( 25 \)) ends with the same digit as the number (\( 5 \)).  
- Therefore, \( 5 \) is an Automorphic Number.


 **Example 2**: \( 6 \)  
- \( 6^2 = 36 \)  
- The square (\( 36 \)) ends with the same digit as the number (\( 6 \)).  
- Therefore, \( 6 \) is an Automorphic Number.


 **Example 3**: \( 76 \)  
- \( 76^2 = 5776 \)  
- The square (\( 5776 \)) ends with the same digits as the number (\( 76 \)).  
- Therefore, \( 76 \) is an Automorphic Number.

 **Non-Automorphic Numbers**


 **Example**: \( 7 \)  
- \( 7^2 = 49 \)  
- The square (\( 49 \)) does not end with the same digit as the number (\( 7 \)).  
- Therefore, \( 7 \) is not an Automorphic Number.

 **How to Check for Automorphic Numbers**

1. **Square the Number**:
   - Compute the square of the given number.

2. **Compare Digits**:
   - Extract the last \( d \) digits of the square, where \( d \) is the number of digits in \( n \).  
   - Compare the extracted digits with the original number.

 **Properties of Automorphic Numbers**

1. Automorphic numbers can exist in any number system (e.g., base 10, base 2).  
2. Automorphic numbers are also known as **curious numbers**.  
3. Some examples of automorphic numbers in base 10 are:  
   \( 1, 5, 6, 25, 76, 376, 625, 9376 \).  


---

20. **All Automorphic Numbers Up to 100**  
    WAJP to print and count all the Automorphic numbers up to 100.  
    **Q20**
---

21. **LeetCode Fascinating Number Problem**  
    [2729. Check if The Number is Fascinating](https://leetcode.com/problems/check-if-the-number-is-fascinating/description/)  
    **Q21**

    [Solution for Check a Number is Fascinating or not](https://leetcode.com/problems/check-if-the-number-is-fascinating/post-solution/?submissionId=1488188206)


 **What is a Fascinating Number?**

A **Fascinating Number** is a number that, when concatenated with its multiples (usually 2 and 3), contains all the digits from 1 to 9 exactly once. Fascinating Numbers do not contain the digit 0 and are typically 3-digit or higher.


 **Definition**
A number \( n \) is **Fascinating** if:
1. Concatenate \( n \), \( n \times 2 \), and \( n \times 3 \).
2. Check if the concatenated result contains **exactly all digits 1 to 9, once each**.
3. If true, \( n \) is Fascinating.



 **Examples of Fascinating Numbers**


 **Example 1: \( 192 \)**
- Original Number: \( 192 \)
- \( n \times 1 = 192 \), \( n \times 2 = 384 \), \( n \times 3 = 576 \)
- Concatenated Result: \( 192384576 \)
- Check Digits: \( 192384576 \) contains **all digits from 1 to 9 exactly once**.
- Conclusion: \( 192 \) is a Fascinating Number.


 **Example 2: \( 273 \)**
- Original Number: \( 273 \)
- \( n \times 1 = 273 \), \( n \times 2 = 546 \), \( n \times 3 = 819 \)
- Concatenated Result: \( 273546819 \)
- Check Digits: \( 273546819 \) contains **all digits from 1 to 9 exactly once**.
- Conclusion: \( 273 \) is a Fascinating Number.



 **Non-Fascinating Numbers**


 **Example: \( 123 \)**
- Original Number: \( 123 \)
- \( n \times 1 = 123 \), \( n \times 2 = 246 \), \( n \times 3 = 369 \)
- Concatenated Result: \( 123246369 \)
- Check Digits: \( 123246369 \) is missing \( 5, 7, 8 \).
- Conclusion: \( 123 \) is **not a Fascinating Number**.



 **Steps to Check if a Number is Fascinating**

1. **Compute Multiples**:
   - Multiply the number by \( 1 \), \( 2 \), and \( 3 \).
2. **Concatenate Results**:
   - Combine the results of \( n \), \( n \times 2 \), and \( n \times 3 \) into a single string.
3. **Check Digits**:
   - Ensure the concatenated string contains all digits \( 1 \) to \( 9 \), with no repetitions and no missing digits.



 **Key Points**
1. Fascinating Numbers are usually 3-digit or more.
2. The digit 0 is excluded in the concatenated result.
3. Examples of Fascinating Numbers:
   - \( 192, 273, 327 \).


---

22. **All Fascinating Numbers Up to 10000**  
    WAJP to print and count all the Fascinating numbers up to 10000.  
    **Q22**

    n=192 
    string = n + "" + n*2 + "" + n*3; = "192384576"
---

23. **Strong Number Check**  
    WAJP to take user input and print whether the number is Strong or not.  
    **Q23**

 **What is a Strong Number?**

A **Strong Number** is a number in which the sum of the **factorials of its digits** is equal to the number itself.


 **Definition**:
If a number \( n \) has digits \( d_1, d_2, \ldots, d_k \), it is a **Strong Number** if:
\[
n = d_1! + d_2! + \ldots + d_k!
\]
Where \( d_i! \) represents the factorial of the digit \( d_i \).

 **Examples of Strong Numbers**


 **Example 1**: \( 145 \)  
- Digits: \( 1, 4, 5 \)  
- Factorials:
  \[
  1! = 1,\; 4! = 24,\; 5! = 120
  \]
- Sum of factorials:
  \[
  1 + 24 + 120 = 145
  \]
- Since the sum equals the original number, \( 145 \) is a **Strong Number**.


 **Example 2**: \( 2 \)  
- Digits: \( 2 \)  
- Factorials:
  \[
  2! = 2
  \]
- Sum of factorials:
  \[
  2
  \]
- Since the sum equals the original number, \( 2 \) is a **Strong Number**.


 **Example 3**: \( 40585 \)  
- Digits: \( 4, 0, 5, 8, 5 \)  
- Factorials:
  \[
  4! = 24,\; 0! = 1,\; 5! = 120,\; 8! = 40320,\; 5! = 120
  \]
- Sum of factorials:
  \[
  24 + 1 + 120 + 40320 + 120 = 40585
  \]
- Since the sum equals the original number, \( 40585 \) is a **Strong Number**.

 **Non-Strong Numbers**


 **Example**: \( 10 \)  
- Digits: \( 1, 0 \)  
- Factorials:
  \[
  1! = 1,\; 0! = 1
  \]
- Sum of factorials:
  \[
  1 + 1 = 2
  \]
- Since the sum (\( 2 \)) does not equal the original number (\( 10 \)), \( 10 \) is **not a Strong Number**.


 **How to Check for a Strong Number**

1. **Extract Digits**:
   - Break the number into its individual digits.

2. **Calculate Factorials**:
   - Compute the factorial of each digit.

3. **Sum the Factorials**:
   - Add up the factorials of all the digits.

4. **Compare with Original**:
   - If the sum equals the original number, it is a Strong Number.

 **Properties of Strong Numbers**

1. Strong Numbers are rare.
2. Examples of Strong Numbers are:  
   \( 1, 2, 145, 40585 \).


---

24. **All Strong Numbers Up to 100**  
    WAJP to print and count all the Strong numbers up to 100.  
    **Q24**
---

25. **Swap Two Numbers Using Third Variable**  
    WAJP to swap two numbers using a third variable.  
    **Q25**
---

26. **Swap Two Numbers Without Third Variable**  
    WAJP to swap two numbers without using a third variable.  
    **Q26**

27. **LeetCode Add Digits Problem**  
    [258. Add Digits](https://leetcode.com/problems/add-digits/description/)  
    **Q27**
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

    [Add Digits Solution](https://leetcode.com/problems/add-digits/post-solution/?submissionId=1488249925)

28. **Count Binary Bits in a Number**  
    WAJP to count the number of binary bits in a number.  
    **Q28**

29. **Count 0's and 1's in a Binary Number**  
    WAJP to count the number of 0’s and 1’s in a binary number.  
    **Q29**

30. **LeetCode Nth Digit Problem**  
    [Link](https://leetcode.com/problems/nth-digit/description/)  
    **Q30**

31. **LeetCode Number of Digits Problem**  
    [Link](https://leetcode.com/problems/number-of-digit-one/description/)  
    **Q31**

32. **LeetCode Number of 1 Bits Problem**  
    **Q32**

33. **LeetCode Prime Number of Set Bits Problem**  
    [Link](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/)  
    **Q33**

34. **LeetCode Binary Number with Alternating Bits Problem**  
    [Link](https://leetcode.com/problems/binary-number-with-alternating-bits/description/)  
    **Q34**

35. **Shift 0's to Left and 1's to Right in Binary Number**  
    WAJP to shift all 0’s to the left side and all 1’s to the right side in a binary number.  
    Example:  
    Input: `100111101`  
    Output: `000111111`  
    **Q35**

36. **Shift Even and Odd Digits in a Number**  
    WAJP to shift all even digits to the left side and all odd digits to the right side.  
    Example:  
    Input: `253687`  
    Output: `268537`  
    **Q36**

37. **Shift 0's to Left While Maintaining Order**  
    WAJP to shift all 0’s to the left side and all other digits to the right side while maintaining the order.  
    Example:  
    Input: `2030680`  
    Output: `0002368`  
    **Q37**

38. **LeetCode Count the Digits That Divide a Number Problem**  
    [Link](https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/)  
    **Q38**

39. **LeetCode Number of Steps to Reduce a Number to Zero Problem**  
    [Link](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/)  
    **Q39**

40. **LeetCode Valid Perfect Square Problem**  
    [Link](https://leetcode.com/problems/valid-perfect-square/description/)  
    **Q40**

41. **Find GCD/HCF of Two Numbers**  
    WAJP to take two user inputs and print their GCD (Greatest Common Divisor) or HCF (Highest Common Factor).  
    **Q41**

42. **Find LCM of Two Numbers**  
    WAJP to take two user inputs and print their LCM (Least Common Multiple).  
    **Q42**

43. **Convert Decimal to Binary**  
    WAJP to convert a decimal number into a binary number.  
    Example:  
    Input: `28`  
    Output: `11100`  
    **Q43**

44. **Convert Binary to Decimal**  
    WAJP to convert a binary number into a decimal number.  
    Example:  
    Input: `101101`  
    Output: `45`  
    **Q44**

45. **Convert Decimal to Octal**  
    WAJP to convert a decimal number into an octal number.  
    Example:  
    Input: `235`  
    Output: `353`  
    **Q45**

46. **Convert Octal to Decimal**  
    WAJP to convert an octal number into a decimal number.  
    **Q46**

47. **Convert Decimal to Hexadecimal**  
    WAJP to convert a decimal number into a hexadecimal number.  
    **Q47**

48. **Convert Hexadecimal to Decimal**  
    WAJP to convert a hexadecimal number into a decimal number.  
    **Q48**

49. **Generate Random Numbers**  
    WAJP to generate random numbers in Java.  
    **Q49**

50. **Calculate Permutations**  
    WAJP to calculate the number of permutations.  
    Example:  
    In a class, there are 12 seats available. Calculate the number of ways to arrange 8 boys on them.  
    **Q50**

51. **Calculate Combinations**  
    WAJP to calculate the number of combinations.  
    Example:  
    There are 15 players. Calculate the number of ways to select a team of 11 players.  
    **Q51**

52. **Print Nth Row of Pascal's Triangle**  
    WAJP to print the nth row of Pascal's Triangle.  
    **[Amazon Question]**  
    **Q52**

53. **Replace 0's with 1's in a Number**  
    WAJP to take an integer input and replace all 0’s with 1’s in the number.  
    Example:  
    Input: `41022005`  
    Output: `41122115`  
    **[Amazon Question]**  
    **Q53**

54. **Replace 7's with 0's in a Number**  
    WAJP to take an integer input and replace all 7’s with 0’s in the number.  
    Example:  
    Input: `41072707`  
    Output: `41002000`  
    **[Amazon Question]**  
    **Q54**

55. **BigInteger and BigDecimal Arithmetic Operations**  
    Use `BigInteger` and `BigDecimal` classes to perform arithmetic operations.  
    **Q55**

56. **Calculate Factorial Using BigInteger**  
    Use `BigInteger` class to calculate the factorial of a number.  
    **Q56**

57. **LeetCode Ugly Number Problem**  
    [Link](https://leetcode.com/problems/ugly-number/description/)  
    **Q57**

58. **LeetCode Ugly Number II Problem**  
    [Link](https://leetcode.com/problems/ugly-number-ii/description/)  
    **Q58**

59. **LeetCode Ugly Number III Problem**  
    [Link](https://leetcode.com/problems/ugly-number-iii/description/)  
    **Q59**

60. **LeetCode Three Divisors Problem**  
    [Link](https://leetcode.com/problems/three-divisors/description/)  
    **Q60**

61. **LeetCode Smallest Even Multiple Problem**  
    [Link](https://leetcode.com/problems/smallest-even-multiple/description/)  
    **Q61**

62. **LeetCode Number of Common Factors Problem**  
    [Link](https://leetcode.com/problems/number-of-common-factors/description/)  
    **Q62**

63. **LeetCode Square Root Problem**  
    [Link](https://leetcode.com/problems/sqrtx/description/)  
    **Q63**

64. **LeetCode Factorial Trailing Zeroes Problem**  
    [Link](https://leetcode.com/problems/factorial-trailing-zeroes/description/)  
    **Q64**

65. **LeetCode Number of Digits One Problem**  
    [Link](https://leetcode.com/problems/number-of-digit-one/description/)  
    **Q65**





## Tech Stack

- **Language:** Java
- **IDE:** You can use any Java-supported IDE such as VScode, IntelliJ, Eclipse, or the command line to compile and run the programs.

## Disclaimer

The code provided in this repository has **not been tested by a professional coder or programmer** and may contain bugs. It is the user's responsibility to thoroughly test the code and make any necessary adjustments. The code is intended for **educational purposes only** and should not be used in production environments.

The Projectment questions in this repository were obtained from the **Q-Spider and J-Spider Software Training Institute** (Noida Branch).

## About Me

Hi, I’m Ankush Raj Mahe Yam (ARMY), an aspiring software developer currently pursuing Java Full Stack Development. I’m also involved in various business ventures, including a tech-based YouTube channel, a logistics business, and real estate projects.

🌟 **Connect with Me:**  
🔍 [Search on Google](https://www.google.com/search?q=ankush+raj+mahe+yam)  
🌟 [Portfolio](https://ankushrajamaheyam.blogspot.com/)  
💼 [LinkedIn](https://linkedin.com/in/AnkushRajMaheYam)  
💻 [GitHub](https://github.com/AnkushRajMaheYam)  
🎯 [LeetCode](https://leetcode.com/u/AnkushRajMaheYam/)  
🏅 [HackerRank](https://www.hackerrank.com/profile/ankushrajmaheyam/)  
📸 [Instagram](https://instagram.com/AnkushRajaMaheYam)  
📘 [Facebook](https://facebook.com/AnkushRajMaheYam)  
🎨 [Fiverr](https://www.fiverr.com/ankushrajmaheya/)  
🛠️ [Upwork](https://www.upwork.com/freelancers/~01bf6d1e8483199ba6)  


---

**License:**  
This repository is licensed under the MIT License.


## **Acknowledgements**
Special thanks to the mentor([Shambhu Sir](https://www.instagram.com/kumarsam07)) and faculty at **J-Spider Software Training Institute (Noida Branch)** for providing excellent guidance and support throughout the course.

---

Feel free to explore the projects, and happy coding! 😊
