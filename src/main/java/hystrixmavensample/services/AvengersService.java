package hystrixmavensample.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import hystrixmavensample.feigninterfaces.AvengersClient;
import hystrixmavensample.models.Avengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvengersService {

    @Autowired
    AvengersClient avengersClient;

    @HystrixCommand(
            fallbackMethod = "getAllAvengersFallback",
            groupKey = "Avengers",
            commandKey = "getAllAvengers"
    )
    public Avengers getAllAvengers() {
        return avengersClient.getAllAvengers();
    }

    public Avengers getAllAvengersFallback() {
        return null;
    }
}
