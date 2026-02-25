package oops;

//abstract class
abstract class Shape{
    private String color;

    // Setter
    public void setColor(String color){
        this.color = color;
    }
    // Getter
    public String getColor(){
        return color;
    }

    
    abstract void area(); //abstraction - Shape is an abstract class, area() has no implementation, Child classes define it, ✔Hiding implementation details
    
    void display(){
        System.out.println("The color of this Shape is: " + color);
    }
    
    protected boolean is2D; //encapsulation
    void isShape2D(){
        if(is2D){
            System.out.println("This is a 2D shape.");
        } else {
            System.out.println("This is not a 2D shape.");
        }
    }
}
//child class
class Circle extends Shape{ //Inheritance
    int radius;
    void area(){
        System.out.print("Area of the circle is ");
    }
    void area(int r){
        System.out.println(3.14 * radius * radius + " sq.cm");
    }
}
//chiild class
class Square extends Shape{
    float side;
    void area(){
        System.out.print("Area of the square is ");
    }
    void area(float s){
        System.out.println(side * side + " sq.cm");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Circle c = new Circle();
        c.setColor("Red");
        c.radius = 5;
        c.display();
        c.is2D = true;
        c.isShape2D();
        c.area();
        c.area(c.radius); //same area() function, first override then it can take manny forms in child class, different datatype,different no. of parameters 

        System.out.println();
        
        Square s = new Square();
        s.setColor("Blue");
        s.side = 4.0f;
        s.display();
        s.is2D = true;
        s.isShape2D();
        s.area();
        s.area(s.side); //polymorphism, One method → many forms
    }
}


/*
This program demonstrates all four OOP principles:

Encapsulation → private variable color with getters and setters, protected variable(can be accessed by child class)

Abstraction → abstract class Shape and abstract method area()

Inheritance → Circle and Square extend Shape

Polymorphism → area() method is overridden in child classes.
*/