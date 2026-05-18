package mypack;

class Animal
{
    public void sound(){
        System.out.println("Aminal Sound..");
    }
}

public class Dog extends Animal
{
    public void sound(){
        System.out.println("Dog Barking..");
    }
}