
public class Address {

    int house, street, postalCode, n;
    String apartment, city, state;

    public Address(int a, int b, String c, String d, String e, int f) {
        house = a;
        street = b;
        apartment = c;
        city = d;
        state = e;
        postalCode = f;
        ++n;
    }
    public Address(int a, int b, String d, String e, int f) {
        house = a;
        street = b;
        city = d;
        state = e;
        postalCode = f;
        ++n;
    }
    
    public void print(){
        System.out.println("House: "+house+", Street: "+street);
        System.out.println("City: "+city+", State: "+state
                +", Postal Code: "+postalCode);
    }
    public void compare(){
        
    }

}
