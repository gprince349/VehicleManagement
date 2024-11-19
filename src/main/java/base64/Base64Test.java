package base64;

import java.util.Base64;

public class Base64Test {

    public static void main(String[] args) {
        String originalInput = "$precheck($boolean(data.VerticalMeasurements[$contains(VerticalMeasurementTypeID, '\\''reference-data--VerticalMeasurementType:Seafloor:'\\'') and $number(VerticalMeasurement)>0]),$contains(data.OperatingEnvironmentID, '\\''reference-data--OperatingEnvironment:Offshore'\\''))";
        System.out.println(originalInput);
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        String doubleEncodedString = Base64.getEncoder().encodeToString(encodedString.getBytes());

        System.out.println(encodedString);
        System.out.println(doubleEncodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println(originalInput.equals(decodedString));
        System.out.println(decodedString);

        String originalString = "Hello, World!";
        String encodedString1 = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println(encodedString1); // Output: "SGVsbG8sIFdvcmxkIQ=="

    }

}
