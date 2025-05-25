class Main{
	public static void main(String[]args){

Dog d= new Dog();
Cat ca= new Cat();
d.Eat();
ca.MakeSound();
d.MakeSound();






System.out.println("Task 2");
Car c=new Car();
Bike b=new Bike();
c.Start();
b.Start();
c.Stop();
b.Stop();


System.out.println("Task 3");

Rectangle r=new Rectangle();
System.out.println("Area of rectangle is : "+r.area(2.7,5.4));
r.Print();



System.out.println("Task 4");
Duck d1=new Duck();
d1.Fly();
d1.Swim();
	}
}