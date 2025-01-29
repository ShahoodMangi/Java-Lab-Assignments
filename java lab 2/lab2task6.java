import java.util.Scanner;
class lab2task6{
public static void main(String[]args)
{
Scanner input= new Scanner(System.in);

System.out.println("Enter the age : ");
int age= input.nextInt();

String result=(age>18)? "You are Eligible. :)" : "Sorry! You are not Eligible. :(";
System.out.println(result);


}
}