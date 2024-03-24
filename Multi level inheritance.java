class circle{
    public void radius(){
        System.out.println("Inside radius");
    }
}
class Rectangle extends circle{
    public void area(){
        System.out.println("Inside area");
    }    
}
class cube extends Rectangle{
    public void volume(){
        System.out.println("Inside volume");
    }    
}
public class Main{
    public static void main(String[] arguments){
    cube cube=new cube();
    cube.radius();
    cube.area();
    cube.volume();
}
}   




