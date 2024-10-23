# Logical Operator MCQ

1. What is the output of the program:

*** java ***
 ```bash
   boolean a = true;
	boolean b = false;
	boolean c = true;
	boolean result = (a && b) || (a && c);
   ```
- a) true   ✓✓✓
- b) false      
- c) Compilation error
- d) Depends on the values of 'a', 'b', and 'c'



2. What is the output of the program:

*** java ***
 ```bash
   int x = 5;
	int y = 10;
	boolean result =  (++x > 5) && (--y <10);
	System.out.println(result);
   ```
- a) true   ✓✓✓
- b) false    
- c) Compilation error
- d) Depends on the values of 'x' and 'y'


3. What is the output of the program? 

*** java ***
 ```bash
   boolean p = true;
	boolean q = false;
	boolean r = true;
	boolean result = (p || q) && (q || r);
   ```
- a) true   ✓✓✓
- b) false 
- c) Compilation error
- d) Depends on the values of 'p', 'q', and 'r'


4. What is the output of the program:

*** java ***
 ```bash
class Program1 
{ 
 public static void main(String[] args) 
 { 
  int a=20; 
  int b=30; 
  System.out.println(a++>15 && b++>20); 
  System.out.println(a); 
  System.out.println(b);   
 }  
}
   ```
- a) true, 20, 30 
- b) false, 21, 30 
- c) true, 21, 31   ✓✓✓
- d) false, 21, 31 



5. What is the output of the program:

*** java ***
 ```bash
class Program1 
{ 
public static void main(String[] args) 
{ 
int a=20; 
int b=30; 
System.out.println(a++>25 && b++>20); 
System.out.println(a); 
System.out.println(b);  
}
}
   ```
- a) true, 20, 30 
- b) false, 21, 30  ✓✓✓
- c) true, 21, 31 
- d) false, 21, 31



6. What is the output of the program:

*** java ***
 ```bash
class Program1 
{ 
public static void main(String[] args) 
{ 

int a=20; 
int b=30; 
System.out.println(a++>25 || b++>20); 
System.out.println(a); 
System.out.println(b); 
}
}
   ```
- a) true, 20, 30 
- b) false, 21, 30 
- c) true, 21, 31  ✓✓✓
- d) false, 21, 31



7. What is the output of the program:

*** java ***
 ```bash
class Program1 
{ 
public static void main(String[] args) 
{ 

int a=20; 
int b=30; 
System.out.println(a++>15 || b++>20); 
System.out.println(a); 
System.out.println(b); 
}
}
   ```
- a) true, 21, 30 
- b) false, 21, 30 
- c) true, 21, 31 
- d) false, 21, 31




## Disclaimer

This project has not been tested by a professional coder or programmer, and it may contain bugs or unintended behavior. Users are responsible for thoroughly testing the code and making any necessary adjustments. This project is provided for **educational purposes only** and should not be used in production environments.

The assignment questions in this repository were retrieved from the **Q-Spider and J-Spider Software Training Institute** (Noida Branch).

## About Me

Hi, I’m Ankush Raj Mahe Yam (ARMY), a passionate software developer and tech enthusiast currently pursuing Java Full Stack Development. I'm also involved in various business ventures, including a tech-based YouTube channel, logistics business, and real estate.

Feel free to connect with me through the following platforms:

- **LinkedIn:** [Ankush Raj Mahe Yam](https://linkedin.com/in/AnkushRajMaheYam)
- **GitHub:** [Ankush Raj Mahe Yam](https://github.com/AnkushRajMaheYam)
- **Instagram:** [@AnkushRajaMaheYam](https://instagram.com/AnkushRajaMaheYam)
- **Facebook:** [Ankush Raj Mahe Yam](https://facebook.com/AnkushRajMaheYam)

---

**License:**  
This project is licensed under the MIT License.

