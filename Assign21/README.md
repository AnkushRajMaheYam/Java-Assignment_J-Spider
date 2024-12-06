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

### **Examples of Armstrong Numbers**
# The first few are given by 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, ... 
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
   ### **Definition of a Prime Number**

A **prime number** is a natural number greater than 1 that has no divisors other than 1 and itself. In other words, a prime number is only divisible by 1 and itself.

### **Key Points**
1. A prime number must be **greater than 1**.
2. It has **exactly two positive divisors**: 1 and the number itself.

### **Examples of Prime Numbers**
- 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, etc.


### **Special Cases**
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


   ### **Palindrome Number**

A **palindrome number** is a number that remains the same when its digits are reversed.

#### **Key Characteristics**:
- A palindrome number reads the same forwards and backwards.
- Examples of palindrome numbers are `121`, `454`, `12321`, `999`, etc.

---

### **How to Check if a Number is Palindrome**

To determine if a number is a palindrome:
1. Reverse the digits of the number.
2. Compare the reversed number to the original number.
3. If they are the same, the number is a palindrome.

---

### **Example**

#### **Palindrome**:
- **Input**: `121`
  - Reverse: `121`
  - Since `121 == 121`, it is a palindrome.

#### **Not a Palindrome**:
- **Input**: `123`
  - Reverse: `321`
  - Since `123 != 321`, it is not a palindrome.

---



8. **Palindrome Numbers in a Range**  
   WAJP to print and count all the palindrome numbers in a given range.  
   **Q8**

9. **LeetCode Palindrome Problem**  
   [Link](https://leetcode.com/problems/palindrome-number/description/)  
   **Q9**

- **Leetcode Answer Link:** [Palindrome Solutions](https://leetcode.com/submissions/detail/1471843450/)

Given an integer x, return true if x is a 
palindrome, and false otherwise.

 

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

11. **LeetCode Prime Palindrome Problem**  
    [Link](https://leetcode.com/problems/prime-palindrome/description/)  
    **Q11**

12. **Perfect Number Check**  
    WAJP to take user input and print whether the number is a perfect number or not.  
    **Q12**

13. **All Perfect Numbers Up to 100**  
    WAJP to print and count all the perfect numbers up to 100.  
    **Q13**

14. **LeetCode Perfect Number Problem**  
    [Link](https://leetcode.com/problems/perfect-number/description/)  
    **Q14**

15. **Dissarium Number Check**  
    WAJP to take user input and print whether the number is a Dissarium number or not.  
    **Q15**

16. **All Dissarium Numbers Up to 1000**  
    WAJP to print and count all the Dissarium numbers up to 1000.  
    **Q16**

17. **LeetCode Happy Number Problem**  
    [Link](https://leetcode.com/problems/happy-number/)  
    **Q17**

18. **All Happy Numbers Up to 100**  
    WAJP to print and count all the Happy numbers up to 100.  
    **Q18**

    n=86 -> sum of sq = 64+36=100 -> sum of sq = 1+0+0 =1 (check one digit number(if it is equal to 1 and 7 ))

19. **Automorphic Number Check**  
    WAJP to take user input and print whether the number is Automorphic or not.  
    **Q19**

20. **All Automorphic Numbers Up to 100**  
    WAJP to print and count all the Automorphic numbers up to 100.  
    **Q20**

21. **LeetCode Fascinating Number Problem**  
    [Link](https://leetcode.com/problems/check-if-the-number-is-fascinating/description/)  
    **Q21**

22. **All Fascinating Numbers Up to 10000**  
    WAJP to print and count all the Fascinating numbers up to 10000.  
    **Q22**

    n=192 
    string = n + "" + n*2 + "" + n*3; = "192384576"
23. **Strong Number Check**  
    WAJP to take user input and print whether the number is Strong or not.  
    **Q23**

24. **All Strong Numbers Up to 100**  
    WAJP to print and count all the Strong numbers up to 100.  
    **Q24**

25. **Swap Two Numbers Using Third Variable**  
    WAJP to swap two numbers using a third variable.  
    **Q25**

26. **Swap Two Numbers Without Third Variable**  
    WAJP to swap two numbers without using a third variable.  
    **Q26**

27. **LeetCode Add Digits Problem**  
    [Link](https://leetcode.com/problems/add-digits/description/)  
    **Q27**

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

Connect with me on:
- **Search on Google:** [Ankush Raj Mahe Yam](https://www.google.com/search?q=ankush+raj+mahe+yam)
- **LinkedIn:** [Ankush Raj](https://linkedin.com/in/AnkushRajMaheYam)
- **GitHub:** [Ankush Raj](https://github.com/AnkushRajMaheYam)
- **Leetcode:** [Ankush Raj](https://leetcode.com/u/AnkushRajMaheYam/)
- **Instagram:** [@AnkushRaj](https://instagram.com/AnkushRajaMaheYam)
- **Facebook:** [Ankush Raj](https://facebook.com/AnkushRajMaheYam)

---

**License:**  
This repository is licensed under the MIT License.


## **Acknowledgements**
Special thanks to the mentor([Shambhu Sir](https://www.instagram.com/kumarsam07)) and faculty at **J-Spider Software Training Institute (Noida Branch)** for providing excellent guidance and support throughout the course.

---

Feel free to explore the projects, and happy coding! 😊
