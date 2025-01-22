package R_1_22_Eve;
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
        Employee sujit = new Employee();
        sujit.name = "Sujit";
        sujit.salary = 56;
        System.out.println(sujit.getSalary());
        System.out.println(sujit.getName());
    }

}
