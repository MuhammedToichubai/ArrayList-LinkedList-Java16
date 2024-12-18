package generic.model;

public class Phone {
    private Integer id;
    private String model;
    private double memory;

    public Phone() {
    }

    public Phone(Integer id, String model, double memory) {
        this.id = id;
        this.model = model;
        this.memory = memory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                '}';
    }
}
