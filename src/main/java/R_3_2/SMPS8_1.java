package R_3_2;
class employee{
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
       employee sujit = new employee();
       sujit.name = "SUJIT";
       sujit.salary = 12000;
        System.out.println(sujit.getName());
        System.out.println(sujit.getSalary());
    }
}
