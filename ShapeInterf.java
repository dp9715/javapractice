interface Shape{
    void draw();
    default void print(){
        System.out.println("XSDC");
    }
    static void show(){
        System.out.println("STATIC");
    }
}
class Circle implements Shape{
    public void draw
}