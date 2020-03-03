package org.Sherwin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal a = new Animal();
        Animal cow = new Cow();
        Animal chicken = new Chicken();
        Animal snake = new Snake();

        System.out.println("Default Animal:\nType: " + a.getType() + "\nHas legs: " + a.hasLegs() + "\nSays: '" + a.speak() + "'\n" );
        System.out.println("Cow:\nType: " + cow.getType() + "\nHas legs: " + cow.hasLegs() + "\nSays: '" + cow.speak() + "'\n" );
        System.out.println("Chicken:\nType: " + chicken.getType() + "\nHas legs: " + chicken.hasLegs() + "\nSays: '" + chicken.speak() + "'\n" );
        System.out.println("Snake:\nType: " + snake.getType() + "\nHas legs: " + snake.hasLegs() + "\nSays: '" + snake.speak() + "'\n" );

        BMW bmw = new BMW();
        Audi audi = new Audi();

        System.out.println("BMW model: " + bmw.getModel() + "\nBMW color: " + bmw.getColor());
        System.out.println("Audi model: " + audi.getModel() + "\nAudi color: " + audi.getColor());
    }
}
