import java.util.Scanner;
public class vairable {
    static int b = 5; //static variable
    public static void main(String[] args) {
        int a = 10; //local variable
        System.out.println(a);
        System.out.println(b);
         System.out.println(Byte.MIN_VALUE+" TO "+Byte.MAX_VALUE);
         System.out.println(Short.MIN_VALUE+" TO "+Short.MAX_VALUE);
         System.out.println(Double.MIN_VALUE+" TO "+Double.MAX_VALUE);
         System.out.println(Float.MIN_VALUE+" TO "+Float.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE+" TO "+Integer.MAX_VALUE);
         System.out.println(Long.MIN_VALUE+" TO "+Long.MAX_VALUE);
        Scanner SC = new Scanner(System.in);
        int c = SC.nextInt();
        System.out.println(a+b+c);
        int d = SC.nextInt();
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c/d);
        System.out.println(c*d);
        System.out.println(c%d);
        int []arr ={1,7,9};
        for(int j: arr){
            System.out.println(j);
        }

    }
}   // public class variable {

//     // Instance variable
//     int instanceVar = 10;

//     // Static variable
//     static String staticVar = "I am static";

//     public static void main(String[] args) {
//         // Local variable
//         double localVar = 3.14;

//         // Creating object to access instance variable
//         variable obj = new variable();

//         // Printing variables
//         System.out.println("Instance variable: " + obj.instanceVar);
//         System.out.println("Static variable: " + staticVar);
//         System.out.println("Local variable: " + localVar);
//     }
// }
// public class variable {
//     public static void main (String[] args){
//         int a=1;
//         float c = 2.3f;
//         boolean b=true;
//         char ch='a';

//         System.out.println(a);
//         System.out.println(c);
//         System.out.println(b);
//         System.out.println(ch);
//     }

    
// }
// import java.util.Scanner;
// public class variable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//         System.out.println("Modulus: " + (a % b));

//         sc.close();
//     }
// }
