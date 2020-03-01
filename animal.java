import java.util.*;
class Animal{
    String name;
    int legs;
    public int getLegs(){
        return legs;    
    }
}

class Dog extends Animal implements Comparable<Dog>{
    public Dog(String Name, int Legs){
        name = Name;
        legs = Legs;
    }
    public int compareTo(Dog a1){
        if(this.name.compareTo(a1.name)==(0))
            return (this.legs-a1.legs);
        else{
            return this.name.compareTo(a1.name);
        }
    }
    public String toString(){
        return (this.name + this.legs);
    }
}
