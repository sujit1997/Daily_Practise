package R_5_8;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class SMPS8_1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Sujit";
        emp1.salary = 1000;
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
