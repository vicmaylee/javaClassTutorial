package tutorial1;

public class Account {
    // declare a varible

    String name;
    int number ;
    int date;
    String address;

    public Account(){

    }

    //Method or Functions of a class
    // to access a class method use classname.method()
    public void OpenAccount(){
        // Sytem.out.println("");
        System.out.println(name + "Can open an account");
    }

    public void SaveAccount(){
        System.out.println(name + "Can save money");
    }

    public void Withdraw() {

        System.out.println(name + "Can widraw money");
    }

    public void Close() {

        System.out.println(name + "Can Close Account");
    }
}
/*
        Object or Class of An Account
        Attribute             Function
        Name                 Open An Account
        Number               Close , Save, wihtdraw
        Date
                       Limit
        */

