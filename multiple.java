import java.util.*;
class Animal
{
    void eat()
{
    System.out.println("eating");
}
}
class dog extends Animal
{
    void bark()
{
    System.out.println("bow bow bow");
}
}
class puppydog extends dog{
    void weep()
    {
        System.out.println("weeping");
    }
}
class multiple
{
public static void main(String args[])
{
    dog puppy=new dog();
    puppy.eat();
    puppy.bark();
}
}

    
