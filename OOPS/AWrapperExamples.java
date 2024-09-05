package OOPS;

import java.net.Inet4Address;

public class AWrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        you can also do this
//        Integer num = new Integer(10);  deprecated
        Integer num = 45;
//        num is now object so it has many properties

        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a+" "+b);

        A sumit = new A("Sumit Mukharjee");
        sumit.name = "other nane";

        //when a non primitive is final you can not reassign it.
        sumit = new A("new object");

        final int bonus = 2;
//        bonus = 3; can't be changed

        A obj;
        for (int i=0;i<100000000;i++){
            obj = new A("Random Object");
        }
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    //Integer is a final class where it is implemented.

    //Final keyword = Final keyword prevent our content to be modified

    static class A{
//        final int num; // final variable has to be initialised because it can't be modified or changed.
        //final value only finals primitives not the instance as instance will never change it will refer to same object
        final int num = 16;
        String name;

        public A(String name){
            System.out.println("Object Created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            //deprecated
            System.out.println("Object is destroyed");
        }
    }
}
