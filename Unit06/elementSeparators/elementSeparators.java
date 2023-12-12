public class elementSeparators {
public static void main(String[] args){

double[] values = { 100.0,98.0,87.5,99.5,90.0};
for (int i = 0; i < values.length; i++) {
    if (i > 0) {
        System.out.print(" | ");
    }
    System.out.print(values[i]);
}



    }
}
