package cz.hotel.hotelhw2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {
        DateTimeFormatter formatCzDate = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //nastavení formatu datumu

        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan", "Dvořáček",LocalDate.of(1995,5,5));


        guest2.setBirthDate(LocalDate.of(1995,4,5));

        System.out.println(guest2.getName()+" "+guest2.getSurname()+" ("+ guest2.getBirthDate().format(formatCzDate)+")");

        Room room1 = new Room(1,1,true,true,new BigDecimal("1000"));
        Room room2 = new Room(2,1,true,true,new BigDecimal("1000"));
        Room room3 = new Room(3,3,false,true,new BigDecimal("2400"));

        Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,7,19), Booking.TypeOfVacation.WORK);
        Booking booking2 = new Booking(room3,guest1,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14), Booking.TypeOfVacation.HOLIDAY);
        booking2.addGuest(guest2);

        // vypsat všechny rezervace
        List<Booking>listOfBooking = new ArrayList<>();
        listOfBooking.add(booking1);
        listOfBooking.add(booking2);

        for (Booking booking:listOfBooking){
            System.out.println(booking.getDescription());
        }
    }
}