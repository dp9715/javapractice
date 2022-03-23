class Animal{
    String color="ANIMAL COLOR";
}
class Dog extends Animal{
    String color="DOG COLOR";
    void display(){
        System.out.println(super.color);
        System.out.println(color);
    }
}
class SuperKey{
    public static void main(String args[]){
        Dog d = new Dog();
        d.display();
    }
}