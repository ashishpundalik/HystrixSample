package hystrixmavensample.builders;

import com.github.javafaker.Faker;
import hystrixmavensample.models.Avenger;

import java.util.List;

public class AvengerBuilder {
    private String name;
    private long id;
    private String email;
    private List<String> weapons;

    public AvengerBuilder() {
        Faker faker = new Faker();
        id = faker.random().nextLong();
        name = faker.name().fullName();
        email = faker.internet().emailAddress();
    }

    public AvengerBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public AvengerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AvengerBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public AvengerBuilder withWeapons(List<String> weapons) {
        this.weapons = weapons;
        return this;
    }

    public Avenger build() {
        Avenger avenger = new Avenger();
        avenger.setId(this.id);
        avenger.setName(this.name);
        avenger.setEmail(this.email);
        avenger.setWeapons(this.weapons);
        return avenger;
    }
}
