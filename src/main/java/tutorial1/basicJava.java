package tutorial1;

public class basicJava {

    public static void main(String args[]){


        //run the class created instatantiate the class here

        Account saving = new Account();
        saving.name =" victor";
        saving.address =  "12345gj datu eqtuttat";
        saving.OpenAccount();
        saving.SaveAccount();
        saving.Close();

        Vechicle Car = new Vechicle();
        Car.make = "Mercedes";
        Car.EngineType = " Diesel";
        Car.transmission = " Automatic";
        Car.color = " Grey";
        Car.wheel = 4 ;
        Car.Owner =" Daniel";

        Car.Move();
        Car.Reverse();
        Car.Stop();
        Car.VechilcleDetails();





        Restaurant Adam = new Restaurant();
        Adam.restaurantName = "Nandos";
        Adam.address = "141 Crompton Road \n Leeds \n LS12 2SD";
        Adam.menu = " English Breakfast";
        Adam.orderID = 001;
        Adam.seatNumber = 2;
        Adam.drink = " Coke";

        Adam.RestaurantAddress();
        Adam.customerOrder();




       // data types / variable / operator

       /* // delare a datatype ,delare   varible = assign value to variable
        int number = 90; // they help to define the type of data that needs to be stored in the variable
        String name = " lorem   ";
        boolean options = true;
        double money = 34.0000;
        float  counter = 100;
        short cout = 0;
        char b = 'G' ;
        */

        // OBJECT HAS A STATE , ATTRIBUTE / METHOD  FUCNTION THATTHE OBJECT CAN PERFOME
        // E.G EMPLOYEE/ Human , car , restuarent.
        /*
        Obeject or Class of An Account
        Attribute             Function
        Name                 Open An Account
        Number               Close , Save, wihtdraw
        Date                 Limit


         */

        // Human/ Talk, Speak, See, / Name, colour, race, genetics, hair, head,
        /*
        Atribute               Function/Method
        Name                     Walk
        Color                   Talk
        Legs                     Run
        Colour                  Dance
        hair                    Eat
        Mouth                   Think
        Nose                     Cry
         */
        //W


        // commmnt  //  objects cas / houses, Employee, Wood, Animal, Shops


    }




}
