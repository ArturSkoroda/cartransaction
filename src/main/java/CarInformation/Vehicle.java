package CarInformation;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity

public class Vehicle implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column (nullable = false,updatable = false)
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


 @Override
 public String toString() {
  return "Vehicle{" +
          "id=" + id +
          ", mark='" + mark + '\'' +
          ", model='" + model + '\'' +
          ", color='" + color + '\'' +
          ", fuelType=" + fuelType +
          ", transmissionType=" + transmissionType +
          ", carCondition=" + carCondition +
          ", carStatus=" + carStatus +
          ", mileage=" + mileage +
          ", engineCapacity=" + engineCapacity +
          ", price=" + price +
          ", isAvailableStill=" + isAvailableStill +
          ", whenPublished=" + whenPublished +
          '}';
 }

 public Vehicle(Long id, String mark, String model, String color, FuelType fuelType, TransmissionType transmissionType, CarCondition carCondition, CarStatus carStatus, double mileage, double engineCapacity, double price, boolean isAvailableStill, LocalDateTime whenPublished) {
  this.id = id;
  this.mark = mark;
  this.model = model;
  this.color = color;
  this.fuelType = fuelType;
  this.transmissionType = transmissionType;
  this.carCondition = carCondition;
  this.carStatus = carStatus;
  this.mileage = mileage;
  this.engineCapacity = engineCapacity;
  this.price = price;
  this.isAvailableStill = isAvailableStill;
  this.whenPublished = whenPublished;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getMark() {
  return mark;
 }

 public void setMark(String mark) {
  this.mark = mark;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public FuelType getFuelType() {
  return fuelType;
 }

 public void setFuelType(FuelType fuelType) {
  this.fuelType = fuelType;
 }

 public TransmissionType getTransmissionType() {
  return transmissionType;
 }

 public void setTransmissionType(TransmissionType transmissionType) {
  this.transmissionType = transmissionType;
 }

 public CarCondition getCarCondition() {
  return carCondition;
 }

 public void setCarCondition(CarCondition carCondition) {
  this.carCondition = carCondition;
 }

 public CarStatus getCarStatus() {
  return carStatus;
 }

 public void setCarStatus(CarStatus carStatus) {
  this.carStatus = carStatus;
 }

 public double getMileage() {
  return mileage;
 }

 public void setMileage(double mileage) {
  this.mileage = mileage;
 }

 public double getEngineCapacity() {
  return engineCapacity;
 }

 public void setEngineCapacity(double engineCapacity) {
  this.engineCapacity = engineCapacity;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public boolean isAvailableStill() {
  return isAvailableStill;
 }

 public void setAvailableStill(boolean availableStill) {
  isAvailableStill = availableStill;
 }

 public LocalDateTime getWhenPublished() {
  return whenPublished;
 }

 public void setWhenPublished(LocalDateTime whenPublished) {
  this.whenPublished = whenPublished;
 }
}
