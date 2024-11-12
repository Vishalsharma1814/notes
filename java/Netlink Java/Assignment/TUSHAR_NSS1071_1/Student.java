public class Student {
    int id;
    String name;
    int age;
    static String institute;

    public static void main(String[] args){
        Student.institute = "Babu Banarasi Das Northen India Institute Of Tehnology";
        System.out.println("-------------------Institute Name-------------------");
        System.out.println(Student.institute);
        // First Student
        Student st_1 = new Student();
        st_1.id = 101;
        st_1.name = "Tushar";
        st_1.age = 21;
        System.out.println("First Student: ");
        System.out.println("Id: "+st_1.id+" "+"Name: "+st_1.name+" "+"Age: "+st_1.age);
        // Second Student
        Student st_2 = new Student();
        st_2.id = 102;
        st_2.name = "Satyam";
        st_2.age = 21;
        System.out.println("Second Student: ");
        System.out.println("Id: "+st_2.id+" "+"Name: "+st_2.name+" "+"Age: "+" "+st_2.age);
        // Third Student
        Student st_3 = new Student();
        st_3.id = 103;
        st_3.name = "Rahul";
        st_3.age = 22;
        System.out.println("Third Student: ");
        System.out.println("Id: "+st_3.id+" "+"Name: "+st_3.name+" "+"Age: "+st_3.age);
        // Fourth Student
        Student st_4 = new Student();
        st_4.id = 104;
        st_4.name = "Pulkit";
        st_4.age = 20;
        System.out.println("Fourth Student: ");
        System.out.println("Id: "+st_4.id+" "+"Name: "+st_4.name+" "+"Age: "+st_4.age);
        // Fifth Student
        Student st_5 = new Student();
        st_5.id = 105;
        st_5.name = "Sneha";
        st_5.age = 22;
        System.out.println("Fifth Student: ");
        System.out.println("Id: "+st_5.id+" "+"Name: "+st_5.name+" "+"Age: "+st_5.age);
        // Sixth Student
        Student st_6 = new Student();
        st_6.id = 106;
        st_6.name = "Vaibhav";
        st_6.age = 20;
        System.out.println("Sixth Student: ");
        System.out.println("Id: "+st_6.id+" "+"Name: "+st_6.name+" "+"Age: "+st_6.age);
        // Seventh Student
        Student st_7 = new Student();
        st_7.id = 107;
        st_7.name = "Ritika";
        st_7.age = 23;
        System.out.println("Seventh Student: ");
        System.out.println("Id: "+st_7.id+" "+"Name: "+st_7.name+" "+"Age: "+st_7.age);
        // Eight Student
        Student st_8 = new Student();
        st_8.id = 108;
        st_8.name = "Ansh";
        st_8.age = 20;
        System.out.println("Eight Student: ");
        System.out.println("Id: "+st_8.id+" "+"Name: "+st_8.name+" "+"Age: "+st_8.age);
        // Ninth Student
        Student st_9 = new Student();
        st_9.id = 109;
        st_9.name = "Yogendra";
        st_9.age = 22;
        System.out.println("Ninth Student: ");
        System.out.println("Id: "+st_9.id+" "+"Name: "+st_9.name+" "+"Age: "+st_9.age);
        // Tenth Student
        Student st_10 = new Student();
        st_10.id = 110;
        st_10.name = "Pratibha";
        st_10.age = 21;
        System.out.println("Tenth Student: ");
        System.out.println("Id: "+st_10.id+" "+"Name: "+st_10.name+" "+"Age: "+st_10.age);


    }
}
