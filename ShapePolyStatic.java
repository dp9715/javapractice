class Shape{
    static void draw(int l,int b){
        System.out.println("The area of rectangle is : "+(l+b));   
    }
    static void draw(int s){
        System.out.println("Square: "+(4*s));
    }
    static void draw(int s1,int s2,int s3){
        System.out.println("Triange"+(0.5*s2*s3));
    }
}
class ShapePolyStatic{
    public static void main(String args[]){
        Shape.draw(2);
        Shape.draw(3,4);
        Shape.draw(2,3,4);
    }
}