package OOPS;
import java.util.Arrays;
// this will cover
// Classes, Objects Constructors and Keywords etc
public class AclassesAndObjectsIntro {
    public static void main(String[] args) {

//        // create a data type that stores 5 roll no;
//        int[] numbers = new int[5];
//
//        // store 5 names of students
//        String[] names = new String[5];
//
//        // store data of 5 students
//        // rollno, name, marks
//
//        int[] rno = new int[3];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        // but this is different different
        //THIS IS WHERE CLASSES AND OBJECTS COMES

        // A CLASS IS A NAMED GROUP OF PROPERTIES AND FUNCTIONS COMBINED IN SINGLE ENTITY
        // YOU CAN MAKE A NEW DATA TYPE IN CLSSES AND OBJECTS

        // A car can be a class, and using that template different companies create classes or cars
        // Once car can be petrol engine, diesel engine or electric engine and can hail
        // from different companies maybe suzuki, ferrari, and tesla
        // these 3 cars have same property engine but the values of that property are different

        // Humans - Same property but different things

        // Class - A class is an template of an object
        // Object - an object is an instance ot the class

        //instance means a physical stuff. when babies are born they are human instance of a class 0r human

        //Class - is a logical construct
        //Object is a physical reality // occupies space in memory

        // Properties of objects

        //state - it's value from it;s data type
        //identity - whether one object is different from others. Two reference variable pointing to the same object
        //behaviour - effect of the data type operations


        //dot operator - links the reference with instance variable

        //new Keyword - new operator dynamically allocates the memory at runtime and returns a reference to it.
        // student1 = new student() - it will be created in a heap memory
        // This is how it works
        // In java this is how it works hence all class and objects may work dynamically.

        //Student student1 = new Student();

        //left hand side of equal - happens at compile time(checks error byte code and all)
        // right hand side of equal = happens at runtime
        //DMA - memories will be allocated when the program is running.

        // the class Student is just in the stack memory.






        //just declaring
//        Student sumit = new Student();
//        sumit.rno = 12;
//        sumit.name = "Sumit Mukharjee";
        //now it's in constructor

//        sumit.marks = 56.4f;
// it is becoming repetitive that's where constructor comes in which is a special function
        // Student() is a constructor or be default constructor or no properties that runs when you
        // create an object and it allocates some variables
        // A constructor defines what happens when your object will be created.

        // what - Student sumit = new Student(13, "Sumit Mukharjee", 13.4);
        // we want to bind these arguments with the object
        // Special type of function in the class
        Student[] students = new Student[5];

        Student sumit = new Student(45,"Sumit Mukharjee",45.6f);

        sumit.changeName("Shoe Lover");
        sumit.message();
        System.out.println(sumit.rno);
        System.out.println(sumit.name);
        System.out.println(sumit.marks);
    }

    // creating a class
    // for every single student
    static class Student{
        int rno;
        String name;
        float marks;


        //functions inside class

        void message(){
            System.out.println("Hello My name is "+this.name);
        }
        void changeName(String nameName){
            name = nameName;
        }
        Student(){
            //we need a way to add the values of the above properties object by object.
            //we need one word to access every object

            //this is a keyword used to refer to the current instance of a class.
            this.rno = 13;
            this.name = "Sumit Mukharjee";
            this.marks = 22.4f;
        }
        Student(int rno, String name, float marks){
         this.rno = rno;
         this.name = name;
         this.marks = marks;
        }
    }
}
