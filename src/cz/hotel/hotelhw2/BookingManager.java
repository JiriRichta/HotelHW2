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
        return listOfBooking;
    }

    public void clearBooking(){
        this.listOfBooking.clear();
    }

    public int getSizeOfListOfBooking(){
        return listOfBooking.size();
    }

    public int getNumberOfWorkingBookings(){
        int NumberOfWorkingBookings = 0;
        for (Booking booking:listOfBooking){
            if (booking.getTypeOfVacation()== Booking.TypeOfVacation.WORK){
                NumberOfWorkingBookings++;
            }
        }
        return NumberOfWorkingBookings;
    }

    public double getAverageGuests(){
        double sumOfguest=0;

        for (Booking booking:listOfBooking){
            sumOfguest = booking.getGuestsCount()+sumOfguest;
        }
        return sumOfguest/getSizeOfListOfBooking();
    }

    public List<Booking > getTopNHolidayBookings(int numOfTopNHolidayBookings) {
        List<Booking> listOfTopNHolidayBookings = new ArrayList<>();

        for (Booking booking : listOfBooking) {
            if (numOfTopNHolidayBookings == listOfTopNHolidayBookings.size()) break;
            if (booking.getTypeOfVacation() == Booking.TypeOfVacation.HOLIDAY) {
                listOfTopNHolidayBookings.add(booking);
            }
        }
        return listOfTopNHolidayBookings;
    }

    public String printGuestStatistics(){
        int onePersonBooking=0;
            for(Booking booking:listOfBooking) {
                if (booking.getGuestsCount() == 1) {
                    onePersonBooking++;
                }
            }
        int twoPersonBooking=0;
             for(Booking booking:listOfBooking) {
                 if (booking.getGuestsCount() == 2) {
                     twoPersonBooking++;
                }
            }
        int morePersonBooking=0;
            for(Booking booking:listOfBooking) {
                if (booking.getGuestsCount() > 2) {
                    morePersonBooking++;
                }
            }

        return "rezervace s jedním hostem ("+onePersonBooking+"x)"+"\n"
                +" se dvěmi hostem ("+twoPersonBooking+"x)"+"\n"
                +" s více jak dvěmi ("+morePersonBooking+"x)"+"\n";
    }
//methody endregion

}
