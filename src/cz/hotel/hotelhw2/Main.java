package cz.hotel.hotelhw2;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Franta","vocas", LocalDate.of(1988,5,6));

        System.out.println(guest1.getName()+" "+guest1.getSurname());
    }
}