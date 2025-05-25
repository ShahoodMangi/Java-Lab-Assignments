import java.util.Scanner;
class lab7task7{
	public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.println("Enter the sentence : ");
String sentence=input.nextLine();

System.out.println(sentence);

String replace=sentence.replace(" ","");
System.out.println("Replaced.");

System.out.println(replace);
	}
}