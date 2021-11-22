package VehicleService;

import CarInformation.Vehicle;
import Repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarService {

    private final VehicleRepository vehicleRepository;

    @GetMapping("/")
    public String welcomePage () {return  "Witaj na stronie głównej SKWARKA:-) \n Za kilka chwil będą tu wszystkie auta jakie posiada";}

    @GetMapping("/allVehicleList")
    public List<Vehicle> getAllVehicleList()
    {return vehicleRepository.findAll();}

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @GetMapping("/vehicle/{id}")
    public Vehicle getVehicleById (@PathVariable(name = "id") Long id) {
        return vehicleRepository.getById(id);
    }
    @DeleteMapping("/vehicle/{id}")
    public void deleteVehicleById (@PathVariable(name = "id")Long id ){
        vehicleRepository.deleteById(id);
    }

}
