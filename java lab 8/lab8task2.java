import java.util.Scanner;
class lab8task2{
int CalculateBonus(int salary){

return (10*salary)/100;

}	
int CalculateBonus(int salary,int ExtraHours){


return ((10*salary)/100)+(500*ExtraHours);




}
public static void main(String[]args){
	
lab8task2 emp= new lab8task2();


System.out.println(emp.CalculateBonus(50000));
System.out.println(emp.CalculateBonus(50000,3));







}

}