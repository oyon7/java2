
public class Student {
    String name="Ei name e kono student nai"; 
    String address="Naam nai .. thikana ashbe koi theke?";
    String id="Student ei nai, abar id :P";
    double cgpa=-4.0;
    
    public Student(String a, String b, String c, double d){
        name=a;
        id=b;
        address=c;
        cgpa=d;
    }
     public Student(){
        
    }
    public String nameDao(){
        return name;
    }
    public String boloToAmiKe(){
        return id;
    }
    public String addressDao(){
        return address;
    }
    public double cgpaDao(){
        return cgpa;
    }
    public String nameBoshao(String a){
        name=a;
        return name;
    }
    public String addressBoshao(String b){
        address=b;
        return address;
    }
    public String idBoshao(String c){
        id=c;
        return id;
    }
    public double cgpaBoshao(double d){
        cgpa=d;
        return cgpa;
    }
    public void standUp(){
        System.out.println(name+" is now standing up!!");
    }
    public String tellMeYourName(){
        return "Sir, my name is "+name;
    }
    public void call(String s){
        System.out.println(name+": Hey "+s+" , Sir is calling you!!");
    }
    
    public int add2Numbers(int a, int b){
        return a+b;
    }
}
