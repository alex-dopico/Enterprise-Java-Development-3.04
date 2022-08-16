package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="aircraft")
public class Aircraft {
    @Id
    private String model;
    private int seats;

    public Aircraft(){}

    public Aircraft(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(model, aircraft.model) &&
                Objects.equals(seats, aircraft.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, seats);
    }
}
