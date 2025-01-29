import java.util.Scanner;
class lab2task4{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
String names[] = new String[6];
boolean isTrue = false;

	
	for(int i = 0;i<names.length;i++)
	{
	System.out.println("Enter name No. " + i + " : ");
	names[i] = input.nextLine();
	
	
	}
		for(int j = 0;j<names.length;j++)
		{
			if(names[j].equals("ali"))
			{
			isTrue = true;
			}
		
		}

if(isTrue){
System.out.println("Available");
}
else
{
System.out.println("Not Available");
}

}

}