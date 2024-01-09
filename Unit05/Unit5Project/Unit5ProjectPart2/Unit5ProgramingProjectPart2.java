public class Unit5ProgramingProjectPart2 {

public static String getEncodedDigit(char d) {
    String result;
    if (d == '1') {
        result = ":::||";
    } else if (d == '2') {
        result = "::|:|";
    }else if (d == '3') {
        result = "::||:";
    }else if (d == '4') {
        result = ":|::|";
    }else if (d == '5') {
        result = ":|:|:";
    }else if (d == '6') {
        result = ":||::";
    }else if (d == '7') {
        result = "|:::|";
    }else if (d == '8') {
        result = "|::|:";
    }else if (d == '9') {
        result = "|:|::";
    }else if (d == '0') {
        result = "||:::";
    }else {
        //invalid diget
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

    return result;

}



    public static void main(String[] args) {

        String zipCode = "95014";
        String barCode = getBarcode(zipCode);
        System.out.println("The zipcode " + zipCode + " has the folowing barcode, ");
        System.out.println(barCode);
    }
}