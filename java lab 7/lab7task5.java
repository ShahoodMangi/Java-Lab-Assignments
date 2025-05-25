import java.util.Scanner;
class lab7task5{
	public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.println("Enter the sentence : ");
String sentence=input.nextLine();



if(sentence.endsWith("world")){
	System.out.println("Sentence ends with world.");

}
else{
	System.out.println("Sentence does not ends with world");
}


	}
}