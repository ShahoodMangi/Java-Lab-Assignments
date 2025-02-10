import java.util.Scanner;
class lab4task2{
public static void main(String[]args){
Scanner userinput= new Scanner(System.in);
int length= userinput.nextInt();

for(int i=1;i<=length;i++){
if(i%3==0){
System.out.println("Fizz");
if(i%3==0&&i%5==0)
{
System.out.println("FizzBuzz");
}
}
else if(i%5==0){
System.out.println("Buzz");
if(i%3==0&&i%5==0)
{
System.out.println("FizzBuzz");
}
}

else{
System.out.println(i);
}


}









}

}