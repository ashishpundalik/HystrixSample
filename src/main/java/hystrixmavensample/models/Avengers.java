package hystrixmavensample.models;

import java.io.Serializable;
import java.util.List;

public class Avengers implements Serializable {
    private List<Avenger> avengers;

    public Avengers() {}

    public void setAvengers(List<Avenger> avengers) { this.avengers = avengers; }

    public List<Avenger> getAvengers() {
        return avengers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{ avengers: ");
        sb.append(avengers);
        sb.append('}');
        return sb.toString();
    }
}
