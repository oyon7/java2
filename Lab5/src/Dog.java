
public class Dog {

    private String color = "Black";
     public Dog(String name){
         color=name;
     }
     public void bark(){
         System.out.println(color+" dog is barking");
     }
     public void changeColor(String color){
         this.color=color;
     }

}
