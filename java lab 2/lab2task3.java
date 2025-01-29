import java.util.Scanner;
class lab2task3{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

int rows , col;

System.out.println("Enter number of rows : ");
rows = input.nextInt();

System.out.println("Enter number of columns : ");
col = input.nextInt();

int array1 [][] = new int[rows][col];

for(int i = 0;i<rows;i++){
	for(int j = 0;j<col;j++)
	{
	System.out.println("Enter value of First matrix Row " + i + " Column " + j);
	array1[i][j] = input.nextInt();
	
	}

}


int array2 [][] = new int[rows][col];

for(int k = 0;k<rows;k++){
	for(int l = 0;l<col;l++)
	{
	System.out.println("Enter value of Second matrix Row "+ k + " Column " + l + " : ");
	array2[k][l] = input.nextInt();
	
	}

}
for(int m = 0;m<rows;m++){
	for(int n = 0;n<col;n++)
	{
	System.out.print(array1[m][n]+array2[m][n] + "\t");
	
	}

System.out.println(" ");

}



}
}