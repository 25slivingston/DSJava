public abstract class Sensor {
    private String name;
    private int modelNumber;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;

    }

    public int getModelNumber() {
        return modelNumber;

    }

    public abstract void returnMesurement();

}
