import java.util.Scanner;
class lab7task4{
	public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.println("Enter the sentence : ");
String sentence=input.nextLine();

if(sentence.startsWith("Hello")){
	System.out.println("String starts with Hello.");

}
else{
	System.out.println("String does not starts with Hello.");
}



	}
}