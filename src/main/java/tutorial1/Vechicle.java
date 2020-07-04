package tutorial1;

public class Vechicle {
    // Attributes / properties data type and variables

    String make;
    int wheel;
    String color;
    String transmission;
    String EngineType;
    String Owner;

    //Method / Function

    public void Move(){
        System.out.println(make + color +" Moving");
    }
    public void Reverse(){
        System.out.println(make + color + " Reversing");
    }
    public void Stop(){
        System.out.println(make + " Stop");
    }
public void VechilcleDetails(){
        System.out.println(Owner + " Is the Register Keeper Of this " + make + " Color" + color );
    }

}
