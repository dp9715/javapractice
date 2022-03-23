class Dogdetails
{
    String name;
    String color;
    String bread;
    String eyecolor;
    
    void brak(){
        System.out.println(name+" Braking");
    }
    void eat(){
        System.out.println(name+" Eating");
    }
}
class Dog
{
    public static void main( String args[])
    {
        Dogdetails d1=new Dogdetails();
        d1.name="muddy";
        d1.color="black";
        d1.bread="Pug";
        d1.eyecolor="blue";
        System.out.println("dog1 information");
        System.out.println(d1.name+d1.color+d1.bread+d1.eyecolor);
        d1.brak();
        d1.eat();
        Dogdetails d2=new Dogdetails();
        d2.name="milk";
        d2.color="wight";
        d2.bread="Doberman";
        d2.eyecolor="black";
        System.out.println("dog2 information");
        System.out.println(d2.name+d2.color+d2.bread+d2.eyecolor);
        d2.brak();
        d2.eat();
    }
}