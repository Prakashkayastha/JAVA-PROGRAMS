class Animal{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Barking");
    }
}
class cat extends Animal{
    void meow()
    {
        System.out.println("Meowing");
    }
}

public class Heirarchicalinh {
    public static void main(String args[])
    {
        cat obj=new cat();
        obj.meow();
        obj.eat();
     
    }
    
}
