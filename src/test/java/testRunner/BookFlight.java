package testRunner;

import Pages.Flights;

public class BookFlight {
    //BriishAirways;

    public static void main (String[] args){

        Flights BritishAirways = new Flights("London", "France","20th Aug 2020",
                "30th Aug 2020");

        BritishAirways.searchFlight = "British Airways";
        BritishAirways.oneWay = true;
        BritishAirways.passenger = 1;
        BritishAirways.directFlight = true;
        BritishAirways.ticketCategory = "First Class";
        BritishAirways.FlightBooking();
        BritishAirways.SearchFlight();


    }

}
