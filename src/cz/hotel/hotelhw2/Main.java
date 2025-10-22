package cz.hotel.hotelhw2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {

        Booking booking1 = new Booking(new Room(1,2,true,true,BigDecimal.valueOf(1000)),new Guest("Jarda","Voca",LocalDate.of(1999,1,2)),LocalDate.now(),LocalDate.now().plusDays(5), Booking.TypeOfVacation.WORK );
        Booking booking2 = new Booking(new Room(1,2,true,true,BigDecimal.valueOf(1000)),new Guest("Jardhjikgka","Voca",LocalDate.of(1999,1,2)),LocalDate.now(),LocalDate.now().plusDays(5), Booking.TypeOfVacation.WORK );

        BookingManager bookingManagerHvezda = new BookingManager();

        bookingManagerHvezda.addBooking(booking1);
        bookingManagerHvezda.addBooking(booking2);

        System.out.println(bookingManagerHvezda.getBooking(1).toString());

        System.out.println(bookingManagerHvezda.getBooking().size());

        bookingManagerHvezda.clearBooking();
        System.out.println(bookingManagerHvezda.getSizeOfListOfBooking());
    }
}