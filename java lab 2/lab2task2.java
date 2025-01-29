import java.util.Scanner;
class lab2task2{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
int array[] = new int[10];
int total = 0;
for(int i = 0;i<10;i++){

System.out.println("Enter Value Number "+i+" : ");
array[i] = input.nextInt();
}
for(int i = 0;i<array.length;i++){
if(array[i]%4==0){
total=total+array[i];
}

}
System.out.println("Total sum of multiple of 4 is : "+ total);

}
}