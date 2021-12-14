package CarInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(nullable = false, updatable = false)
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
 private boolean isAvailableStill;
 private LocalDateTime whenPublished;
 private String fotoURL1;
 private String fotoURL2;
 private String fotoURL3;
 private String fotoURL4;
 private String fotoURL5;
 private String fotoURL6;


}