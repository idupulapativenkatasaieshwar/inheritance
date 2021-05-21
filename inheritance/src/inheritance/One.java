package inheritance;
class Animal
{
	public void eat()
	{
	  System.out.println("Animal is eating");
	  
	}
	public void sleep()
	{
	  System.out.println("Animal is sleeping");
	  
	}
}
class Bird extends Animal
{
	public void eat()
	{
	  System.out.println("bird is eating");
	  
	}
	public void sleep()
	{
	  System.out.println("bird is sleeping");
	  
	}
	public void fly()
	{
	  System.out.println("bird is flying");
	  
	}
	
}
public class One {

	public static void main(String[]args)
	{
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}