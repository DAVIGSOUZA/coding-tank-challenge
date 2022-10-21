public class TemperatureScale {
    private String scale;

    public TemperatureScale(int choice) {
        switch (choice) {
            case 1 -> this.scale = "celsius";
            case 2 -> this.scale = "fahrenheit";
            case 3 -> this.scale = "kelvin";
        }
    }

    public String getScale() {
        return scale;
    }
}
