class Book{

String title;
String author;
boolean isAvailable=false;


Book(String title, String author){

this.title=title;
this.author=author;


}


void borrowBook(){

if(isAvailable){
isAvailable=false;
System.out.println("Book is successfully borrowed.");
}
else
{
System.out.println("Book is already borrowed.");
}



}

void returnBook(){

if(isAvailable){

}
else{

isAvailable=true;
}

}

void displayBookdetails(){

System.out.println("Book title : "+title);
System.out.println("Book Author: "+author);
System.out.println("Availability Status : "+isAvailable);

}



public static void main(String[]args){

Book b1= new Book("Applied Physics", "Newton");


b1.displayBookdetails();
b1.borrowBook();
b1.displayBookdetails();
b1.borrowBook();
b1.returnBook();
b1.displayBookdetails();
}


}