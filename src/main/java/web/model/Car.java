package web.model;

public class Car {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String model;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'';
    }
}
