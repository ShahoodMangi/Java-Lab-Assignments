import java.util.Scanner;
class lab2task5{
public static void main(String[]args){
Scanner input= new Scanner(System.in);

int[][] values={{1,1,0,0,1},{1,0,1,0,1},{1,0,0,1,1},{1,0,0,0,1}};
int[][] check= new int[4][5];
boolean isTrue = false;
for(int row=0;row<4;row++){
	for(int col=0;col<5;col++){
	System.out.println("Enter the Value of Row : "+row+" Column : "+col);	
	check[row][col]= input.nextInt();	
	
	}
	}
	for(int row=0;row<4;row++){
		for(int col=0;col<5;col++){	
		System.out.print(check[row][col]);
		if (values[row][col]==check[row][col])
		{
			isTrue = true;
		}

		}
	System.out.println();
	}
if (isTrue)
{
	System.out.println("The matrix contain N letter:)");
}
else
{
	System.out.println("The matrix does not contain N letter:(");
}

 
}
}