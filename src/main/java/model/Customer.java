package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    private int id;
    private String name;
    private int status_id;
    private int customer_mileage;

    public Customer(){};

    public Customer(int id, String name, int status_id, int customer_mileage) {
        this.id = id;
        this.name = name;
        this.status_id = status_id;
        this.customer_mileage = customer_mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getCustomer_mileage() {
        return customer_mileage;
    }

    public void setCustomer_mileage(int customer_mileage) {
        this.customer_mileage = customer_mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer cust = (Customer) o;
        return Objects.equals(id, cust.id) &&
                Objects.equals(name, cust.name) &&
                Objects.equals(status_id, cust.status_id) &&
                Objects.equals(customer_mileage, cust.customer_mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
