package oops;

interface A{
    void show();
}
interface B{
    void display();
}

class C implements A,B{
    //overridden
    public void show(){ 
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    }
    //overloading
    public void show(String x){
        System.out.println("Show "+x);
    }
    public void display(int x){
        System.out.println("Display "+x);
    }
}

public class Interface {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
        obj.show("Circle");
        obj.display();
        obj.display(69);
    }
}
