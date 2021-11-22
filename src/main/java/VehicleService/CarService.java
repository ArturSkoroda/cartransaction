package VehicleService;

import Repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarService {

    private final VehicleRepository vehicleRepository;

    @GetMapping("/")
    public String welcomePage () {return  "Witaj na stronie głównej SKWARKA:-) \n Za kilka chwil będą tu wszystkie auta jakie posiada";}




}
