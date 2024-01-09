public class Unit5ProgramingProjectPart2 {

    public static char getCheckDigit(String zip) {
        // this method takes in a zipcode as a string and spits out the check digitvalue
        // as a character
        int total = 0;
        for (int i = 0; i < zip.length(); i++) {
            int value = Integer.valueOf(zip.charAt(i));// converts symbol into value
            total = total + value;
        }
        System.out.println("total =" + total);

        int remainder = total % 10;
        int digit = 10 - remainder;
        if (digit == 1) {
            return '1';
        } else if (digit == 2) {
            return '2';
        } else if (digit == 3) {
            return '2';
        } else if (digit == 4) {
            return '2';
        } else if (digit == 5) {
            return '2';
        } else if (digit == 6) {
            return '2';
        } else if (digit == 7) {
            return '2';
        } else if (digit == 8) {
            return '2';
        } else if (digit == 9) {
            return '2';
        } else {
            return '0';
        }

    }

    public static String getEncodedDigit(char d) {
        String result;
        if (d == '1') {
            result = ":::||";
        } else if (d == '2') {
            result = "::|:|";
        } else if (d == '3') {
            result = "::||:";
        } else if (d == '4') {
            result = ":|::|";
        } else if (d == '5') {
            result = ":|:|:";
        } else if (d == '6') {
            result = ":||::";
        } else if (d == '7') {
            result = "|:::|";
        } else if (d == '8') {
            result = "|::|:";
        } else if (d == '9') {
            result = "|:|::";
        } else if (d == '0') {
            result = "||:::";
        } else {
            // invalid diget
            result = "";
        }
        return result;
    }

public static String getBarcode(String zip) {
    String result = "|"; //barcode begins with a 1 always
    for (int i = 0; i < zip.length(); i++){ //loop thru the digets of the zipcode
        char d = zip.charAt(i);
        result = result + getEncodedDigit(d);
    }
    //get check digit
    char checkDigit = getCheckDigit(zip);
    result = result + getEncodedDigit(checkDigit);

    //add a trailing bar to the code
    result = result + "|";

    return result;

}

    public static void main(String[] args) {

        String zipCode = "95014";
        String barCode = getBarcode(zipCode);
        System.out.println("The zipcode " + zipCode + " has the folowing barcode, ");
        System.out.println(barCode);
    }
}