// Create a program where we will input marks for three subjects such as maths, chemistry, and physics.
// Then we will calculate the total_marks of three subject marks and display “Grade A”
// if the total_marks is greater than or equal to 85.

//public class FlowControl {
//    public static void main(String[] args) {
//        int maths = 98;
//        int chemistry = 87;
//        int physics = 89;
//        float percent = ((maths+chemistry+physics)/3)*100;
//        if(percent>=85)
//        {
//            System.out.println("Grade A");
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create a program to prompt the user to enter a number.
// If the number is divisible by 2, the program displays a message “number is divisible by 2”.
// Look at the source code to understand better.

//public class FlowControl{
//    public static void main(String[] args) {
//        int num = 68;
//        if(num%2==0){
//            System.out.println("Number is divisible by 2");
//        }
//    }
//}

// ----------------------------------------------------------------------------------------------- //
// Create a program where we will take marks as input of five subjects and calculate the total marks,
// total_marks, and grade. Look at the program source code.

//public class FlowControl {
//    public static void main(String[] args) {
//        int marks[] = {89,95,99,88,78};
//        int total_marks=0;
//        for(int a:marks){
//            total_marks = total_marks+ a;
//        }
//        float percentage = total_marks/5;
//        if(percentage<=100 && percentage>=90){
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: A");
//        }
//        else if(percentage>=80 && percentage<=89)
//        {
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: B");
//        }
//        else if(percentage>=70 && percentage<=79){
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: C");
//        }
//        else if(percentage>=60 && percentage<=69){
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: D");
//        }
//        else if(percentage>=50 && percentage<=59){
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: E");
//        }
//        else{
//            System.out.println("Marks: "+" "+total_marks+" "+"Percentage: "+percentage+" "+"Grade: F");
//        }
//
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create a program where we will take a number as input from the user and
// check that number is even or odd.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a = 56;
//        if(a%2==0){
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// Write a program to check whether a number is divisible with another number or not.
// Print appropriate message.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_1 = 89;
//        int b_1 = 9;
//        if(a_1%b_1==0){
//            System.out.println(a_1+" "+"is divisible by"+" "+b_1);
//        }
//        else{
//            System.out.println(a_1+" "+"is not divisible by"+" "+b_1);
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------//
// Create a java program to input a number and check whether it is a Buzz number or not.
// A number is said to be a buzz number when it ends with 7 or is divisible by 7.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_2 = 397;
//        if(a_2%7==0 || a_2%10==7)
//        {
//            System.out.println("Buzz Number");
//        }
//        else{
//            System.out.println("Not Buzz Number ");
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// Create program where we will take the age of user as input and find whether he is a child, adult,
// or senior on the basis of age. Using Java if-else-if ladder statements.

//public class FlowControl {
//    public static void main(String[] args) {
//        int age = 30;
//        if(age<18){
//            System.out.println("Child");
//        }
//        else if(age>=18 && age<=50){
//            System.out.println("Adult");
//        }
//        else{
//            System.out.println("Senior");
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// Create program that uses a pair of nested for loops.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_3 = 5;
//        for (int i = 1; i <= a_3; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.println("#");
//            }
//            System.out.println();
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create program where we will add the number from 1 to 10 using while loop
// and display the sum on the console.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_4 = 1,s=0;
//        while(a_4<=10){
//            s = s + a_4;
//            a_4++;
//        }
//        System.out.println("Sum = "+s);
//    }
//}

// --------------------------------------------------------------------------------------------------- //
// Create program where we will display numbers from 1 to 6.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_5=1;
//        while(a_5<=6){
//            System.out.println(a_5);
//            a_5++;
//        }
//    }
//}

// ---------------------------------------------------------------------------------------------------- //
// Create program based on do while statement where we will display the multiplication table.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_6 = 28,i=1,mul;
//        do{
//
//            System.out.println(a_6+" "+"*"+" "+i+" "+"="+" "+(a_6*i));
//            i++;
//        }
//        while(i<=10);
//    }
//}

// ----------------------------------------------------------------------------------------------------- //
// Create program where we will display numbers from 1 to 5 and from 5 to 1.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_7 = 1,b_2 = 5;
//        System.out.println("Numbers from 1 to 5: ");
//        while(a_7<=5){
//            System.out.println(a_7);
//            a_7++;
//        }
//        System.out.println("Numbers from 5 to 1: ");
//        while(b_2>=1){
//            System.out.println(b_2);
//            b_2--;
//        }
//    }
//}

// ---------------------------------------------------------------------------------------------------- //
// Create program where we will calculate the sum of squares of integer numbers
// from 1 to 5 using for loop statement.

//public class FlowControl {
//    public static void main(String[] args) {
//        int s_1=0;
//        for(int i=1;i<=5;i++){
//            s_1 = s_1 + (i*i);
//        }
//        System.out.println("Sum of sqaures : "+s_1);
//    }
//}

// ----------------------------------------------------------------------------------------------------- //
// Create program where we will initialize two variables in for statement and
// will display numbers from 1 to 5 and 5 to 1 simultaneously.

//public class FlowControl {
//    public static void main(String[] args) {
//        int p,q;
//        for(p=1,q=5;p<=5 && q>=1;p++,q--)
//        {
//            System.out.println(p+" "+q);
//        }
//    }
//}

// --------------------------------------------------------------------------------------------------- //
// Create program where we retrieve elements of an array one by one using
// for-each loop and display it on the console.

//public class FlowControl {
//    public static void main(String[] args) {
//        int ar_1[] = {78,23,45,66,12,99};
//        for(int k:ar_1){
//            System.out.println(k);
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create a program where we will calculate the sum of the first 10 numbers
// using enhanced for loop and display it on the console.

//public class FlowControl {
//    public static void main(String[] args) {
//        int s_2 = 0;
//        int ar_2[] = {34,67,1,4,89,23};
//        for(int f:ar_2){
//            s_2 = s_2 + f;
//        }
//        System.out.println("Sum of first 10 numbers : "+s_2);
//    }
//}

// --------------------------------------------------------------------------------------------------- //
// Create a program where we will search an element from an array.
// If the element is found, it will stop.

//public class FlowControl {
//    public static void main(String[] args) {
//        int[] ar_3 = {45,78,22,1,9,44,33};
//        int k=9;
//       for(int i=0;i<ar_3.length;i++){
//           if(ar_3[i]==k)
//           {
//               System.out.println("Element found at"+" "+i+" "+"position in the array");
//           }
//       }
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Program based on switch statement where we will execute a particular task depending on city value.
// We will take a variable city, that is initialized to d.

//public class FlowControl {
//    public static void main(String[] args) {
//        char city = 'd';
//        switch (city){
//            case 'a':
//                System.out.println("City is a");
//                break;
//            case 'b':
//                System.out.println("City is b");
//                break;
//            case 'c':
//                System.out.println("City is c");
//                break;
//            case 'd':
//                System.out.println("City is d");
//                break;
//            default:
//                System.out.println("None of the city !!");
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------ //
// Program based on if and switch statements where we will take total marks of
// five subjects from students as input.Then, we will calculate the percentage of total marks,
// and display Grade based on the percentage.

//public class FlowControl {
//    public static void main(String[] args) {
//        int marks_1[] = {89,95,99,88,78};
//        int total_marks_1=0;
//        char g;
//        for(int a:marks_1){
//            total_marks_1 = total_marks_1+ a;
//        }
//        float percentage_1 = total_marks_1/5;
//        if(percentage_1<=100 && percentage_1>=90){
//            g = 'A';
//        }
//        else if(percentage_1>=80 && percentage_1<=89)
//        {
//            g = 'B';
//        }
//        else if(percentage_1>=70 && percentage_1<=79){
//            g = 'C';
//        }
//        else if(percentage_1>=60 && percentage_1<=69){
//            g = 'D';
//        }
//        else if(percentage_1>=50 && percentage_1<=59){
//           g = 'E';
//        }
//        else{
//            g = 'F';
//        }
//
//        switch (g){
//            case 'A':
//                System.out.println("Grade A");
//                break;
//            case 'B':
//                System.out.println("Grade B");
//                break;
//            case 'C':
//                System.out.println("Grade C");
//                break;
//            case 'D':
//                System.out.println("Grede D");
//                break;
//            case 'E':
//                System.out.println("Grade E");
//                break;
//            case 'F':
//                System.out.println("Grade F");
//                break;
//            default:
//                System.out.println("No greades !!");
//        }
//
//
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// create a program where we will not use break statements.
// It means that it will execute all statements after the first match.

//public class FlowControl {
//    public static void main(String[] args) {
//        for(int i=1;i<=20;i++){
//            if(i==16){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// Create program where we will use a break statement inside the for loop for breaking the loop.
// Look at the program source code.

//public class FlowControl {
//    public static void main(String[] args) {
//        for(int x=1;x<=10;x++){
//            if(x==6){
//                break;
//            }
//            System.out.println(x);
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create program where we will use break statement with labeled for loop.
// We can use break with the label.

//public class FlowControl {
//    public static void main(String[] args) {
//        outer: for(int x=0;x<=10;x++){
//            System.out.println(x);
//            inner: for(int y=0;y<=x;y++){
//                if(x>y){
//                    break outer;
//                }
//            }
//        }
//
//    }
//}

// -------------------------------------------------------------------------------------------------- //
// Create a program where we will use break statement inside while loop.

//public class FlowControl {
//    public static void main(String[] args) {
//        int a_9 = 1;
//        while(a_9<=10){
//            if(a_9==7){
//                break;
//            }
//            System.out.println(a_9);
//            a_9++;
//        }
//    }
//}

// ------------------------------------------------------------------------------------------------- //
// Create a program and use continue statement in inner loop

//public class FlowControl {
//    public static void main(String[] args) {
//        for(int p=1;p<=10;p++){
//            for(int q=1;q<=p;q++){
//                if(q==6){
//                    continue;
//                }
//                System.out.println(q);
//            }
//        }
//    }
//}
