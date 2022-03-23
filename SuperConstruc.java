class Animal{
    String color;
    Animal(String color){
        this.color=color;
        System.out.println("Animal Constructor");
        System.out.println(color);
    }
    void display(){
        System.out.println("PARENT class Animal");
    }
}
class Dog extends Animal{
    String color;
    Dog(){
        super("BALCK");
        System.out.println("Dog Constructor");
    }
    void display(){
        System.out.println("Child class Dog");
        super.display();
    }
}
class SuperConstruc{
    public static void main(String args[]){
        Dog d = new Dog();
    }
}