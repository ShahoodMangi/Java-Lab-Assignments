import java.util.Scanner;
class lab8task1{
int add(int a,int b){
	return a+b;
}	
double add(double a,double b){
	return a+b;
}
String add(String a,String b){
	return a+b;
}

public static void main(String[]args){

lab8task1 cal= new lab8task1();




System.out.println(cal.add(5,3));
System.out.println(cal.add(2.5,3.7));
System.out.println(cal.add("Hello","World"));







}

}