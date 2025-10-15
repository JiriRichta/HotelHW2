package cz.hotel.hotelhw2;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate birthDate;

    //region construktors
    public Guest (String name,String surname, LocalDate birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    //end region construktors

    //region gettry a settry

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDesciption(){
        return "Jméno hosta: "+ this.name+" (nar. "+this.birthDate+")";    // nevim jestli použití this je dobře .. možná rešit přes metody???
    }

    //end region gettry a settry
}
