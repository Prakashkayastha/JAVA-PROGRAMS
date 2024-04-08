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
class Babydog extends Dog{
    void weep()
    {
        System.out.println("Weeping");
    }
}

class Multilevelinh {
    public static void main(String args[])
    {
        Babydog obj=new Babydog();
        obj.weep();
        obj.bark();
        obj.eat();
    }
    
}
