package R_2_26;
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
        Employee sujit = new Employee();
        sujit.name = "Sujit";
        sujit.salary = 56;
        System.out.println(sujit.getName());
        System.out.println(sujit.getSalary());
    }
}
