package unitConverter;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConversionCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        return scanner.nextLine().trim();
    }

    public static void main(String[] args) {

        String userChoice;

        System.out.println();
        System.out.println("What do you want to convert?");
        System.out.println("[1] Length");
        System.out.println("[2] Weight");
        System.out.println("[3] Area");
        System.out.println("[4] Memory units");
        System.out.println("[5] Gross-Net");
        System.out.println("[6] Exchange rates");
        System.out.println("[7] Fantasy units");
        System.out.println("[x] Exit");

        userChoice = getUserInput();
        switch(userChoice) {
            case "1":
                lengthConverterCalculator();
                break;
            case "2":
                weightConverterCalculator();
                break;
            case "3":
                areaConverterCalculator();
                break;
            case "4":
                memoryConverterCalculator();
                break;
            case "5":
                grossNetConverterCalculator();
                break;
            case "6":
                exchangeRatesConverterCalculator();
                break;
            case "7":
                fantasyConverterCalculator();
                break;
        }

    }

        //calculator for length converter
        private static void lengthConverterCalculator(){
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######               LENGTH CONVERTER              ######");
            System.out.println("#########################################################");

            Pattern patternLength = Pattern.compile("mm{1}||cm{1}||in{1}||dm{1}||ft{1}||yd{1}||m{1}||km{1}||mi{1}");
            String fromUnit = null;
            do {
                System.out.println("Convert from: ");
                System.out.println("[mm] [cm] [in] [dm] [ft] [yd] [m] [km] [mi]");
                String fromUnitInput = getUserInput();
                if (patternLength.matcher(fromUnitInput).matches()) {
                    fromUnit = fromUnitInput;
                } else{
                    System.out.println("Incorrect format. Try again.");
                }
            } while(fromUnit == null);

            String toUnit = null;
            do {
                System.out.println("Convert to: ");
                System.out.println("[mm] [cm] [in] [dm] [ft] [yd] [m] [km] [mi]");
                String toUnitInput = getUserInput();
                if (patternLength.matcher(toUnitInput).matches()) {
                    toUnit = toUnitInput;
                } else{
                    System.out.println("Incorrect format. Try again.");
                }
            } while(toUnit == null);

            LengthConverter from = new LengthConverter(fromUnit);
            LengthConverter to = new LengthConverter(toUnit);

            System.out.println("Value: ");
            double value = scanner.nextDouble();

            double meters = from.toMeters(value);
            double converted = to.fromMeters(meters);
            System.out.println("The result: " + value + " " + fromUnit + " = " + converted + " " + toUnit);

        }

        //calculator for weight converter
        private static void weightConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######               WEIGHT CONVERTER              ######");
            System.out.println("#########################################################");

        }

        //calculator for area converter
        private static void areaConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######                AREA CONVERTER               ######");
            System.out.println("#########################################################");

        }

        //calculator for memory units converter
        private static void memoryConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######            MEMORY UNITS CONVERTER           ######");
            System.out.println("#########################################################");

        }

        //calculator for gross-net converter
        private static void grossNetConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######             GROSS-NET CONVERTER             ######");
            System.out.println("#########################################################");

        }

        //calculator for exchange rates converter
        private static void exchangeRatesConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######           EXCHANGE RATES CONVERTER          ######");
            System.out.println("#########################################################");

        }

        //calculator for fantasy units converter
        private static void fantasyConverterCalculator() {
            System.out.println();
            System.out.println("#########################################################");
            System.out.println("######           FANTASY UNITS CONVERTER           ######");
            System.out.println("#########################################################");

        }


}
