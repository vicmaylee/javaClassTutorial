package Pages;

import java.sql.SQLOutput;

public class Flights {

    //Attributes of flight
    public String from;
    public String to;
    public String departionDate;
    public String ReturnDate;
    public boolean oneWay = true;
    public int passenger;
    public String ticketCategory;
    public boolean directFlight = false;
    public String searchFlight;

    /// create constructor o l

    public Flights(String from, String to, String departionDate, String ReturnDate) {
                        this.from = from;
                        this.to = to;
                        this.departionDate = departionDate;
                       this.ReturnDate = ReturnDate;
    }

// Method

    public void FlightBooking(){
        System.out.println("Flight from" + from ) ;
        System.out.println("Flight Destination" + to);
        System.out.println("Departing: " +  departionDate);
        System.out.println("Returning" + ReturnDate);
        System.out.println("One way" + oneWay);
        System.out.println("Passengers Name: " + "  "+ passenger);
        System.out.println("Ticket: " + ticketCategory);
        System.out.println("Flight Type" + directFlight);

    }

    public void SearchFlight(){
        System.out.println("Click the Search Button" + searchFlight);
    }


}
