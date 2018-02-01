package main.java.Prototype;

public class Movie implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
}
