import java.util.Scanner;
class lab7task8{
	public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.println("Enter the word : ");
String word=input.nextLine();

String words[]=word.split(" ");
int count=0;
for(String val: words){

	if(val==""){
		continue;
	}
	System.out.println(val);
	count++;
}



System.out.println("The number of letters are : "+count);



	
	}
}