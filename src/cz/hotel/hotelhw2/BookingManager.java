package cz.hotel.hotelhw2;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> listOfBooking = new ArrayList<>();
    private Booking booking;
    private int indexOfBooking;

    //region konstruktor
    public BookingManager(){

    }

    //end region konstruktor

    // methody region

    public void addBooking(Booking booking){
        listOfBooking.add(booking);
    }

    public Booking getBooking(int indexOfBooking) {
        // přidej IF kdyby prvek neexistoval .. přes metod SIZE  !!!!!!!!!!!!!!!!!!!!!
        return listOfBooking.get(indexOfBooking);
    }

    public List<Booking> getBooking (){
        return this.listOfBooking;
    }

    public void clearBooking(){
        this.listOfBooking.clear();
    }

    public int getSizeOfListOfBooking(){
        return listOfBooking.size();
    }
//methody endregion

}
