import org.springframework.stereotype.Component;

import java.util.Objects;


public class Cat {
    private final String name;
    private final String type;

    public Cat() {
        this.name = "Kot";
        this.type = "Scottish";
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(type, cat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
