package com.example.cartransaction;

import CarInformation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;


@SpringBootApplication
public class CartransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartransactionApplication.class, args);

		Vehicle vehicle= new Vehicle(1L,"Fiat", "126p","jasno-niebieski",
				FuelType.BENZYNA, TransmissionType.MANUALNA, CarCondition.SPRAWNY, CarStatus.KRAJOWY,
				100000.07,126,12000,true, LocalDateTime.now(),"foto1","foto2","foto3",
				"foto","foot5","foto6");

		System.out.println(vehicle);
	}

}
