package R_6_10;

class Employee{
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class SMPS8_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Sujit";
        e1.salary = 600;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
