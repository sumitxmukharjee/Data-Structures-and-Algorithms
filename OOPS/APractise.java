package OOPS;

public class APractise {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        Employee e1 = new Employee(345000,"Sebestian Stan",45.4f);
//        Employee e1 = new Employee();

        e1.greetingFunction();
        System.out.println(e1.salary);
        System.out.println(e1.name);
        System.out.println(e1.holidays);
    }
    static class Employee{
        int salary;
        String name;
        float holidays;

        void greetingFunction(){
            System.out.println("Hey this is employee details of "+name);
        }
        Employee(){
            this.salary = 125000;
            this.name = "Sumit Mukharjee";
            this.holidays = 45.5f;
        }

        Employee(int salary, String name, float holidays){
            this.salary = salary;
            this.name = name;
            this.holidays = holidays;
        }
    }
}
