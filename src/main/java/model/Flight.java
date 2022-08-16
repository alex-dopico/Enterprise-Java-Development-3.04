package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    private String flight_number;
    private String aircraft_model;
    private int flight_mileage;

    public Flight(){}

    public Flight(String flight_number, String aircraft_model, int flight_mileage) {
        this.flight_number = flight_number;
        this.aircraft_model = aircraft_model;
        this.flight_mileage = flight_mileage;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft_model() {
        return aircraft_model;
    }

    public void setAircraft_model(String aircraft_model) {
        this.aircraft_model = aircraft_model;
    }

    public int getFlight_mileage() {
        return flight_mileage;
    }

    public void setFlight_mileage(int flight_mileage) {
        this.flight_mileage = flight_mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flight_number, flight.flight_number) &&
                Objects.equals(aircraft_model, flight.aircraft_model) &&
                Objects.equals(flight_mileage, flight.flight_mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight_number, aircraft_model);
    }
}
