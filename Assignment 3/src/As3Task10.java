
public class As3Task10 {
    public static void main(String[] args){
        
        
    }
    
}

class circle{
    private double radius=1.0;
    private String color= "red";
    public circle(){
        
    }
    public circle(double rad){
        radius= rad;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI*2*radius;
    }
}