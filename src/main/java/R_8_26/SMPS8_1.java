package R_8_26;
class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }
    String name;
    public String getName() {
        return name;
    }


}
public class SMPS8_1 {
    public static void main(String[] args) {
        Employee sujit = new Employee();
        sujit.name = "sujit";
        sujit.salary = 6300;
        System.out.println(sujit.getName());
        System.out.println(sujit.getSalary());
    }
}
