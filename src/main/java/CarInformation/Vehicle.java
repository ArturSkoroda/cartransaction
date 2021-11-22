package CarInformation;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Vehicle {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private String color;
    private FuelType fuelType;
    private TransmissionType transmissionType;
    private CarCondition carCondition;
    private CarStatus carStatus;
    private double mileage; // przebieg
    private double engineCapacity;// pojemność
    private double price;
    private  boolean isAvailableStill;
    private LocalDateTime whenPublished;






}
