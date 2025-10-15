package cz.hotel.hotelhw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import cz.hotel.hotelhw2.Guest;
import cz.hotel.hotelhw2.Room       ;

public class Booking {
    private Guest guest;
    private Room room;
    private List otherGuests= new ArrayList<>();
    private LocalDate arrival;
    private LocalDate departure;
    private TypeOfVacation typeOfVacation;

    private static final int ONE_WEEK_ACCOMMODATION = 7;

    //region constructors
    //variata pro jednoho hosta
    public Booking(Guest guest, Room room, LocalDate arrival, LocalDate departure, TypeOfVacation typeOfVacation){
        this.guest = guest;
        this.room= room;
        this.arrival = arrival;
        this.departure= departure;
        this.typeOfVacation = typeOfVacation;
    }

    //end region constructors

    //region gettery a settery



    //end region gettery a settery

    //regin enum
    public enum TypeOfVacation{
        WORK, HOLIDAY
    }
    //end region enum

}
