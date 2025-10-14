package cz.hotel.hotelhw2;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Guest guest;
    private Room room;
    private List otherGuests;
    private LocalDate arrival;
    private LocalDate depature;
    private TypeOfVacation typeOfVacation;

    final int oneWeekAcommodation = 7;

    //region constructors
    public Booking(Guest guest, Room room, List otherGuests, LocalDate arrival, LocalDate depature, TypeOfVacation typeOfVacation){
        this.guest = guest;
        this.room= room;
        this.otherGuests = otherGuests;
        this.arrival = arrival;
        this.depature= depature;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(Guest guest, Room room, LocalDate arrival, LocalDate depature, TypeOfVacation typeOfVacation){
        this.guest = guest;
        this.room= room;
        this.arrival = arrival;
        this.depature= depature;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(Guest guest, Room room, List otherGuests, LocalDate arrival, TypeOfVacation typeOfVacation){
        this.guest = guest;
        this.room= room;
        this.otherGuests = otherGuests;
        this.arrival = arrival;
        depature = this.arrival.plusDays(oneWeekAcommodation);
        this.typeOfVacation = typeOfVacation;
    }
    //end region constructors

    //region gettery a settery

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDepature() {
        return depature;
    }

    public void setDepature(LocalDate depature) {
        this.depature = depature;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    //end region gettery a settery

    //regin enum
    enum TypeOfVacation{
        WORK, HOLIDAY
    }
    //end region enum

}
