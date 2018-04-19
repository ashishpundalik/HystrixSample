package hystrixmavensample.controllers;

import hystrixmavensample.models.Avengers;
import hystrixmavensample.services.AvengersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvengersController {

    @Autowired
    private AvengersService avengersService;

    @GetMapping("/avengers/all")
    public Avengers allAvengers() {
        return avengersService.getAllAvengers();
    }
}
