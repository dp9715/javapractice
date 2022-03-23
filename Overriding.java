class Animal{
    String color="NMJ";
    void display(){
        System.out.println("PARENT");
    }
}
class Dog extends Animal{
    String color;
    void display(){
        System.out.println("Child");
        super.display();
    }
}
class Overriding{
    public static void main(String args[]){
        Dog d = new Dog();
        d.display();
    }
}