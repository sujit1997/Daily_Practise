package R_5_29;
class employee{
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
        employee e1 = new employee();
        e1.name = "SUJIT";
        e1.salary = 63000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
