package main.java.Prototype;

public class Album implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Album) super.clone();
    }
}

