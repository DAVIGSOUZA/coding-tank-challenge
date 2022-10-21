public class Converter {
    public static double[] convertTemperature(String convertFrom, String convertTo, double[] temperatures) {
        if (convertTo == "fahrenheit" && convertFrom == "celsius") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = (temperatures[i] * 1.8) + 32;
            }

            return convertedTemperatures;
        }

        if (convertTo == "kelvin" && convertFrom == "celsius") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = temperatures[i] + 273.15;
            }

            return convertedTemperatures;
        }

        if (convertTo == "celsius" && convertFrom == "fahrenheit") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = (temperatures[i] - 32 ) * 0.55;
            }

            return convertedTemperatures;
        }

        if (convertTo == "kelvin" && convertFrom == "fahrenheit") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = (temperatures[i] - 32 ) * 0.55 + 273.15;
            }

            return convertedTemperatures;
        }

        if (convertTo == "celsius" && convertFrom == "kelvin") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = temperatures[i] - 273.15;
            }

            return convertedTemperatures;
        }

        if (convertTo == "fahrenheit" && convertFrom == "kelvin") {
            double[] convertedTemperatures = new double[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                convertedTemperatures[i] = (temperatures[i] - 273.15 ) * 1.8 + 32;
            }

            return convertedTemperatures;
        }

        return temperatures;
    }

    public static double average(double[] temperatures) {
        double accumulator = 0;

        for (int i = 0; i < temperatures.length ; i++) {
            accumulator += temperatures[i];
        }

        return accumulator/temperatures.length;
    }
}
