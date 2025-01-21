package R_12_18;

class Employee {
    int salary;
    String name;

    public int getSalary(){
      return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
public class SMPS8_1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee sujit = new Employee();
        sujit.setName("Sujit Manmode");
        sujit.salary = 30;
        System.out.println(sujit.getName());
        System.out.println(sujit.getSalary());
    }
}
