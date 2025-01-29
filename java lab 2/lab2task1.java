import java.util.Scanner;
class lab2task1{
public static void main(String[]args){
Scanner letter = new Scanner(System.in);
char consonant[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
System.out.println("Enter any character : ");
char userinput = letter.next().charAt(0);
boolean isConsonant = false; 
for(int i = 0;i<21;i++){
if(userinput==consonant[i]){
isConsonant = true;
break;
}

}
if(isConsonant){
System.out.println("Consonant");
}
else{
System.out.println("Not Consonant");
}
}



}
