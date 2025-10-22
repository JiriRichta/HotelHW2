package cz.hotel.hotelhw2;

import java.time.format.DateTimeFormatter;

public class Settings {

    public static final int ONE_WEEK_ACCOMMODATION = 7;     //nastavuje defaultní délku bookingu při nezadání datumu ukončení pobytu

    public static final DateTimeFormatter FORMAT_CZ_DATE = DateTimeFormatter.ofPattern("d.M.yyyy"); //nastavení formatu datumu

}
