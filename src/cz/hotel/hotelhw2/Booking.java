package cz.hotel.hotelhw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import cz.hotel.hotelhw2.Guest;
import cz.hotel.hotelhw2.Room;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking {
    private Guest guest;
    private Room room;
    private List <Guest>guestsInRoom = new ArrayList<>();
    private LocalDate arrival;
    private LocalDate departure;
    private TypeOfVacation typeOfVacation;
    private String stringListOfGuestInRoom ="";
    private DateTimeFormatter formatCzDateBooking = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //nastavení formatu datumu

    private static final int ONE_WEEK_ACCOMMODATION = 7;

    //region constructors
    public Booking(Room room, Guest guest, LocalDate arrival, LocalDate departure, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.guestsInRoom.add(guest);
        this.arrival = arrival;
        this.departure = departure;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(Room room,Guest guest, LocalDate arrival, TypeOfVacation typeOfVacation) {
        this(room, guest,arrival,arrival.plusDays(ONE_WEEK_ACCOMMODATION),typeOfVacation);
    }
    //endregion constructors

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

    public List<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public int getNumberOfGuestsInRoom() {
        return guestsInRoom.size();
    }

    public void addGuest(Guest guest) {
        this.guestsInRoom.add(guest);
    }

    public void setGuestsInRoom(List<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }
    public String createListOfGuestInRoom(){
        for (Guest guest:guestsInRoom){
            stringListOfGuestInRoom=stringListOfGuestInRoom+guest.getName()+" " + guest.getSurname()+", ";
        }
        return stringListOfGuestInRoom;
    }

    public String getDescription(){
        return "---------"+"\n"+
                "Rezervace pokoje č."+this.room.getRoomNumber()+"\n"
                +"Od: "+this.getArrival().format(formatCzDateBooking)+"\n"
                +"Do: "+this.getDeparture().format(formatCzDateBooking)+"\n"
                +"Ubytován/i: "+this.createListOfGuestInRoom()+"\n"
                +"Typ pobytu: "+ this.getTypeOfVacation()+"\n";
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }


    //endregion gettery a settery

    //regin enum
    public enum TypeOfVacation {
        WORK, HOLIDAY
    }
    //end region enum
}
