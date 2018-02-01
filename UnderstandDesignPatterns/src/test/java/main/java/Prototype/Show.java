package main.java.Prototype;

public class Show implements PrototypeCapable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Show) super.clone();
    }
}
