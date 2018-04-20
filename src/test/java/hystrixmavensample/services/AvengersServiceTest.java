package hystrixmavensample.services;

import hystrixmavensample.builders.AvengerBuilder;
import hystrixmavensample.feigninterfaces.AvengersClient;
import hystrixmavensample.models.Avenger;
import hystrixmavensample.models.Avengers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class AvengersServiceTest {
    @InjectMocks
    private AvengersService avengersService;

    @Mock
    private AvengersClient avengersClientMock;

    @Test
    public void shouldGetAllAvengersFromAvengersClient() {
        Avenger avenger = new AvengerBuilder().build();
        Avengers testAvengers = new Avengers();
        testAvengers.setAvengers(asList(avenger));

        when(avengersClientMock.getAllAvengers()).thenReturn(testAvengers);

        Avengers expectedAvengers = avengersService.getAllAvengers();

        assertThat(expectedAvengers).isEqualTo(testAvengers);
    }

}