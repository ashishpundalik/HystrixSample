package hystrixmavensample.services;

import hystrixmavensample.feigninterfaces.AvengersClient;
import hystrixmavensample.models.Avengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvengersService {

    @Autowired
    AvengersClient avengersClient;

    public Avengers getAllAvengers() {
        return avengersClient.getAllAvengers();
    }
}
