import java.util.Scanner;
 
public class Employee{ 
private String name;
private int id;
private double salary;

public Employee(String name, int id, double salary){ 
this.name = name;
this.id= id;
this.salary= salary;
}

public String getName(){
 return name;
}

public int getId(){
 return id;
}

public double getSalary(){ 
return salary;
}

public void setName(String name){ 
this.name =name;
}

public void setId(int id){
 this.id= id;
}

public void setSalary(double salary){ 
this.salary= salary;
}

public void raiseSalary(){
salary +=salary*0.10;
}

public void displayDetails(){
System.out.println("\nEmployee Details: ");
System.out.println("Name : "+name); 
System.out.println("ID: "+id); 
System.out.println("Salary: "+salary);
}

public static void main(String args[]){


Scanner scanner = new Scanner(System.in);
System.out.print("Enter employee name: "); 
String name = scanner.nextLine();

System.out.print("Enter employee id: "); 
int id = scanner.nextInt();

System.out.print("Enteremployee Salary:"); 
double salary= scanner.nextDouble();

Employee emp = new Employee(name, id ,salary);


System.out.println("\nBefore salary raise: ");
emp.displayDetails();
emp.raiseSalary();


System.out.println("\nAfter 10% Salary raise: ");
emp.displayDetails();

scanner.close();
}
}