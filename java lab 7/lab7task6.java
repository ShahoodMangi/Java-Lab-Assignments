import java.util.Scanner;
class lab7task6{
	public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.println("Enter the sentence : ");
String sentence=input.nextLine();



if(sentence.contains("Java")){
	System.out.println("Sentence contains with Java.");

}
else{
	System.out.println("Sentence does not contains with Java");
}


	}
}