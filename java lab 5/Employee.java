 class Employee{


String name;
String employeeID;
int salary;
Employee(String name, String employeeID, int salary){

this.name=name;
this.employeeID=employeeID;
this.salary=salary;

}

void increaseSalary(int amount){

System.out.println(name+" your salary is increased by amount : "+amount);
salary=salary+amount;

}
void CalculateAnnualSalary(){
System.out.println(name+" your Annual salary is : "+(salary*12));

}


void displayDetails(){

System.out.println("Employee's name : "+name);
System.out.println("Employee's ID: "+employeeID);
System.out.println("Employee's Salary: "+salary);




}

public static void main(String[]args){

Employee e1= new Employee("Shahood Mangi", "ARI-F24-0077", 175000);


e1.displayDetails();
e1.CalculateAnnualSalary();
e1.increaseSalary(25000);
e1.displayDetails();
e1.CalculateAnnualSalary();




}

}