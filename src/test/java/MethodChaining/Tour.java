package MethodChaining;

import org.testng.annotations.Test;

public class Tour {

    String place;
    String modeOfTravel;

    public Tour setModeOfTravel(String modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
        return this;
    }
// method chaining by returing this Class Tour
    public Tour setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }

    public String getPlace() {
        return place;
    }
    public void printThePlace() {
        System.out.println(place);
        System.out.println(modeOfTravel);
    }

    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.setModeOfTravel("Sports1");
        tour.setPlace("Sports2");
        System.out.println(tour.getModeOfTravel());
        System.out.println(tour.getPlace());
        //Method Chaining
        tour.setModeOfTravel("Sports3").setPlace("Sports4").printThePlace();


    }
}
