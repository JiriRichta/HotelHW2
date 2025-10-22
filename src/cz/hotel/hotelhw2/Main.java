package cz.hotel.hotelhw2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    private static BookingManager fillBookings(){
        BookingManager bookingManager = new BookingManager();
        Room room1 = new Room(1,1,true,true,new BigDecimal("1000"));
        Room room2 = new Room(2,1,true,true,new BigDecimal("1000"));
        Room room3 = new Room(3,3,false,true,new BigDecimal("2400"));

        Guest guest1 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest2 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest3 = new Guest("Karolína", "Tmavá", LocalDate.of(1999, 1, 2));

        bookingManager.addBooking(new Booking(room3, guest1, LocalDate.of(2023,6,1),LocalDate.of(2023,6,7), Booking.TypeOfVacation.WORK));
        bookingManager.addBooking(new Booking(room2, guest2, LocalDate.of(2023,7,18),LocalDate.of(2023,7,21), Booking.TypeOfVacation.HOLIDAY));
        bookingManager.getBooking(bookingManager.getSizeOfListOfBooking()-1).addGuest(guest2);    //přidává k poslednímu přidanému
        bookingManager.addBooking(new Booking(room3, guest3, LocalDate.of(2023,8,1), LocalDate.of(2023,8,31), Booking.TypeOfVacation.WORK));

        for (int i=0;i<20;i=i+2)
            bookingManager.addBooking(new Booking(room2,guest3,LocalDate.of(2023,8,1).plusDays(i),LocalDate.of(2023,8,1).plusDays(1+i), Booking.TypeOfVacation.HOLIDAY));

        return bookingManager;
    }

    public static void main (String[] args) {
        BookingManager bookingManagerHotelHvezda = fillBookings();

        System.out.println("Celkový počet vytvořených rezervací je "+bookingManagerHotelHvezda.getSizeOfListOfBooking()+" rezervací"+"\n");

        System.out.println("Průměrný počet hostů an rezervaci je "+bookingManagerHotelHvezda.getAverageGuests()+"\n");

        System.out.println("Prvních osum rekreačních rekreací");
            for(Booking booking: bookingManagerHotelHvezda.getTopNHolidayBookings(8)){
                System.out.println(booking.toString());
            };

        System.out.println(" ");

        System.out.println(bookingManagerHotelHvezda.printGuestStatistics());

        System.out.println("počet pracovních pobytů: "+bookingManagerHotelHvezda.getNumberOfWorkingBookings()+"\n");

        System.out.println("Formátovaný výstup všech rezercacív systému:");

        for(Booking booking:bookingManagerHotelHvezda.getBooking()){
            System.out.println(booking.getFormattedSummary());
        };

        System.out.println("---------------");
        bookingManagerHotelHvezda.clearBooking();
        System.out.println("Rezervace ze systému byli úspěšně smazány - v seznamu zbylo "+bookingManagerHotelHvezda.getSizeOfListOfBooking()+" rezervací");

    }
}