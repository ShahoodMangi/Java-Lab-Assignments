import java.util.Scanner;
class lab7task3{
	public static void main(String[]args){

Scanner input= new Scanner(System.in);


String words[]=new String[5];

for(int i=0;i<5;i++){

System.out.println("Enter the word of "+i+"th index : ");
words[i]=input.nextLine();



}
for(int i=0;i<5;i++){
System.out.println(words[i].toUpperCase());
}












	}
}