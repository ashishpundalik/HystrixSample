package hystrixmavensample.models;

import java.io.Serializable;
import java.util.List;

public class Avenger implements Serializable {
    private String name;
    private long id;
    private String email;
    private List<String> weapons;

    public Avenger() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getWeapons() { return weapons; }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWeapons(List<String> weapons) { this.weapons = weapons; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"").append(name).append('"');
        sb.append(", \"id\":").append(id);
        sb.append(", \"email\":\"").append(email).append('"');
        sb.append(", \"weapons\":").append(weapons);
        sb.append('}');
        return sb.toString();
    }
}
