package tutorial1;

public class Restaurant {
    String address;
    String restaurantName;
    int seatNumber;
    int orderID;
    String menu;
    String drink;

public void RestaurantAddress(){
    System.out.println(restaurantName + "\n ADDRESS: " + address);
}

public void customerOrder(){
    System.out.println(" SEAT NUMBER: " + seatNumber + "\n ORDER ID: " + orderID +
            "\n MENU : " + menu + "\n DRINK: " + drink);
}

}
