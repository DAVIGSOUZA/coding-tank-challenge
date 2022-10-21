import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void start() {
        boolean inputOk = false;

        while (!inputOk) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Informe quantas temperaturas deseja converter:");
                System.out.println("------------------------");
                int tempAmount = 0;
                tempAmount = input.nextInt();
                System.out.printf("Informe %s temperatura(s): \n", tempAmount);
                double[] temperatures = new double[tempAmount];

                for (int i = 0; i < temperatures.length; i++) {
                    temperatures[i] = input.nextDouble();
                }

                System.out.println("------------------------");
                System.out.println("Informe em qual escala estão as temperaturas:");
                System.out.println("1 - Celsius");
                System.out.println("2 - Fahrenheit");
                System.out.println("3 - Kelvin");

                int userInputFrom = input.nextInt();

                if (userInputFrom < 1 || userInputFrom > 3) {
                    throw new InputMismatchException();
                }

                System.out.println("------------------------");
                System.out.println("Informe para qual escala deseja converter:");
                System.out.println("1 - Celsius");
                System.out.println("2 - Fahrenheit");
                System.out.println("3 - Kelvin");

                int userInputTo = input.nextInt();

                if (userInputTo < 1 || userInputTo > 3) {
                    throw new InputMismatchException();
                }

                TemperatureScale convertFrom = new TemperatureScale(userInputFrom);
                TemperatureScale convertTo = new TemperatureScale(userInputTo);

                double[] convertedTemperatures = Converter.convertTemperature(convertFrom.getScale(), convertTo.getScale(), temperatures);

                System.out.println("------------------------");

                for (int i = 0; i < temperatures.length ; i++) {
                    System.out.println(temperatures[i] + " graus " + convertFrom.getScale() + " equivale a " + convertedTemperatures[i] + " graus " + convertTo.getScale());
                }

                double temperaturesAverage = Converter.average(temperatures);
                double convertedTemperaturesAverage = Converter.average(convertedTemperatures);

                System.out.println("------------------------");
                System.out.println("a média das temperaturas escolhidas foi:");
                System.out.println(temperaturesAverage + " graus " + convertFrom.getScale());
                System.out.println("a média das temperaturas convertidas foi:");
                System.out.println(convertedTemperaturesAverage + " graus " + convertTo.getScale());

                inputOk = true;
            } catch (InputMismatchException exception) {
                System.err.println("Informe um valor válido");
                System.err.println("Reiniciando...");
                System.err.println("------------------------");

                input.reset();
            }
        }
    }
}

