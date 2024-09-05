package OOPS;

public class APractise {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        Employee e1 = new Employee();
        System.out.println(e1.salary);
        System.out.println(e1.name);
        System.out.println(e1.holidays);
    }
    static class Employee{
        int salary;
        String name;
        float holidays;
        Employee(){
            this.salary = 125000;
            this.name = "Sumit Mukharjee";
            this.holidays = 45.5f;
        }
    }
}
