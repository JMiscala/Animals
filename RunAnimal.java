import java.util.Scanner;
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}
class Bird extends Animal{
    public void eat(){
        System.out.print("Birds loves to eat seeds ");
    }
    public void sleep(){
        System.out.print("and sleep for 10-12 hours a day.");
    }
    public void makeSound(){
        System.out.print("Tweet, tweet");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.print("Cats loves to eat tuna ");
    }
    public void sleep(){
        System.out.print("and sleep all day.");
    }
    public void makeSound(){
        System.out.print("Meow. meow");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.print("Dogs loves to eat meat ");
    }
    public void sleep(){
        System.out.print("and sleep all day.");
    }
    public void makeSound(){
        System.out.print("Woof, woof");
    }
}
public class RunAnimal {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in); 
      System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
      String choose = in.nextLine();
      if (choose.equalsIgnoreCase("B")){
          Bird b = new Bird();
          b.eat();
          b.sleep();
          b.makeSound();
      }
      if (choose.equalsIgnoreCase("C")){
          Cat c = new Cat();
          c.eat();
          c.sleep();
          c.makeSound();
      }
      if (choose.equalsIgnoreCase("D")){
          Dog d = new Dog();
          d.eat();
          d.sleep();
          d.makeSound();
      }
    }
   
}