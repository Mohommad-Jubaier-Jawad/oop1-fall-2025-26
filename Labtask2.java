package Lab;
class Employee{
    private String name;
    private Info info;
    public Employee(String name , Info info){
        this.name = name;
        this.info = info;
    }
    public String getName(){
        return name;
    }
    public Info getInfo(){
        return info;
    }
}

class Info{
    private String title;
    private float salary;

    public Info (String title , float salary){
        this.title = title;
        this.salary = salary;
    }
    public String toString(){
        return  title +"  " + salary;
    }
}

class Company{
    private String companyname;
    private Employee[] employees;
    private int count = 0;
    public Company (String companyname , int capacity){
        this.companyname = companyname;
        employees = new Employee[capacity];
 }
 public void addEmployee(Employee s){
    if (count < employees.length){
        employees[count] = s;
        count++;
    }
 }

 public void showEmployees(){
    System.out.println("Company: " + companyname );
    System.out.println("Employees:");
    for(int i = 0;i<count;i++){
        System.out.println(employees[i].getName());
        System.out.println("Employee Information:" +employees[i].getInfo());
    }
 }
}

public class Labtask2 {
     public static void main(String [] args){
        Company company = new Company ("Samsung" , 3);
        company.addEmployee(new Employee("Sajid", new Info("Cheif engineer" ,50000f)));
        company.addEmployee(new Employee("Jawad", new Info("Data Scientist" ,48000f)));
        company.addEmployee(new Employee("Niha", new Info("Manager" ,100000f)));
        company.showEmployees();
     }
    
}
