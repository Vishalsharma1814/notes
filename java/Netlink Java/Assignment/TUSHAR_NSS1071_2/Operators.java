// Create a simple program based on the java relational operators’ concept.

public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 8;
        System.out.println("Equals To: ");
        System.out.println(a==b);
        System.out.println("Not Equals To: ");
        System.out.println(a!=b);
        System.out.println("Greater Than: ");
        System.out.println(a>b);
        System.out.println("Greater Than Equal To:  ");
        System.out.println(a>=b);
        System.out.println("Less Than: ");
        System.out.println(a<b);
        System.out.println("Less Than Equal To: ");
        System.out.println(a<=b);
    }
}

// Create program where we will use the if-else statement to compare among three numeric values.

//public class Operators {
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 8;
//        int c = 75;
//
//        if((a>b) && (a>c)){
//            System.out.println(a+" "+"is greater");
//        }
//        if((b>c) && (b>a))
//        {
//            System.out.println(b+" "+"is greater");
//        }
//        else{
//            System.out.println(c+" "+"is greater");
//        }
//    }
//}

// Create a program where we will implement && and ||  operator to combine two conditions.

//public class Operators {
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 8;
//
//        System.out.println((a>b) && (b>a)); // false
//        System.out.println((a>b) || (b>a)); // true
//    }
//}

// Create a program related to NOT( ! ) operator.

//public class Operators {
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 8;
//
//        System.out.println(!(a<b));
//    }
//}

// Create program based on compound assignment operator.

//public class Operators {
//    public static void main(String[] args) {
//        int p = 45;
//        p += 76;
//        System.out.println("Value of p: "+p);
//    }
//}

// Create program related to pre-post increment operators' concept.

//public class Operators {
//    public static void main(String[] args) {
//        int p = 45;
//        System.out.println(p++); // 45
//        System.out.println(p); // 46
//        System.out.println(++p); // 47
//        System.out.println(p); // 47
//        System.out.println(++p); // 48
//        System.out.println(++p); // 49
//    }
//}

// Create a program where we will find out the greatest number between the two numbers.

//public class Operators {
//    public static void main(String[] args) {
//        int p = 45;
//        int q = 34;
//        if(p>q){
//            System.out.println(p+" "+"is greater");
//        }
//        else{
//            System.out.println(q+" "+"is greater");
//        }
//    }
//}

// Create a program where we will implement all the bitwise operator to combine two conditions.

//public class Operators {
//    public static void main(String[] args) {
//        int p = 7;
//        int q = 9;
//        // Bitwise AND
//        System.out.println(p & q); // 1
//        // Bitwise OR
//        System.out.println(p | q); // 15
//        // Bitwise XOR
//        System.out.println(p ^ q); // 14
//        // Bitwise NOT
//        System.out.println(~q); // -10
//    }
//}

// Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

//public class Operators {
//    public static void main(String[] args) {
//        int length = 5;
//        int breadth = 7;
//        int area = length*breadth;
//        int perimeter= 2*(length+breadth);
//        System.out.println("Area of rectangle: "+area); // 35
//        System.out.println("Perimter of rectangle: "+perimeter); // 24
//
//    }
//}

// Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

//public class Operators {
//    public static void main(String[] args) {
//        float res;
//        res = (((8+2345)/3)%5)*5;
//        System.out.println("Final result: "+res); // 20.0
//    }
//}

// Write a program to check if the two numbers 23 and 45 are equal.

//public class Operators {
//    public static void main(String[] args) {
//        int r = 23;
//        int s = 45;
//        if(r==s){
//            System.out.println("Numbers are equal");
//        }
//        else{
//            System.out.println("Numbers are not equal");
//        }
//    }
//}

// Write a program to print the power of 7 raised to 5.

//public class Operators {
//    public static void main(String[] args) {
//        int r = 7;
//        int y = 5;
//        double res = Math.pow(r,y);
//        System.out.println("Result : "+res); // 16807.0
//
//    }
//}

// Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
//public class Operators {
//    public static void main(String[] args) {
//        int a = 55;
//        int b = 70;
//        if((a<50) && (a<b)){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//
//    }
//}

// Write a program to reverse a 3-digit number.

//public class Operators {
//    public static void main(String[] args) {
//        int a = 789;
//        int r;
//        int rev=0;
//        while(a>0){
//            r = a%10;
//            rev = rev*10+r;
//            a = a/10;
//        }
//        System.out.println("Reversed Number: "+rev);
//
//    }
//}

// Write a program to calculate the sum of the digits of a 3-digit number.

//public class Operators {
//    public static void main(String[] args) {
//        int a = 439;
//        int r;
//        int sum=0;
//        while(a>0){
//            r = a%10;
//            sum = sum+r;
//            a = a/10;
//        }
//        System.out.println("Sum of three digit number: "+sum); // 16
//
//    }
//}