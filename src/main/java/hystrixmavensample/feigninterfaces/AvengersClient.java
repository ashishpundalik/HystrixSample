package hystrixmavensample.feigninterfaces;

import hystrixmavensample.models.Avengers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "avengers-data-dump")
public interface AvengersClient {
    @GetMapping(value = "/avengers/all")
    Avengers getAllAvengers();
}
