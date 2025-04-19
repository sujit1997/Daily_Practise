package R_4_10;

public class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "SUJIT";
        emp.salary = 1000;
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

    }

}
