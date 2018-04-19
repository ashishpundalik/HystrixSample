package hystrixmavensample.controllers;

import hystrixmavensample.models.Avenger;
import hystrixmavensample.models.Avengers;
import hystrixmavensample.services.AvengersService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AvengersControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private AvengersController avengersController;

    @Mock
    private AvengersService avengersServiceMock;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(avengersController).build();
    }


    private Avengers buildAvengers() {
        Avenger avenger1 = new Avenger();

        avenger1.setId(1);
        avenger1.setEmail("test@email.com");
        avenger1.setName("Test Avenger");

        Avengers avengers = new Avengers();
        avengers.setAvengers(asList(avenger1));

        return avengers;
    }

    @Test
    public void shouldReturnAllAvengers() throws Exception {
        Avengers expectedAvengers = buildAvengers();

        when(avengersServiceMock.getAllAvengers()).thenReturn(expectedAvengers);

        mockMvc.perform(get("/avengers/all"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedAvengers.toString()));
    }
}