import java.util.Scanner;
public class HW08partA {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double Cesium = 100.00;
        int Years = 0;
        

        while (Cesium >= 1.0) {
            System.out.println(Cesium + "% at " + Years + " years");
            Cesium = (Cesium / 2.0);
            Years = (Years + 30);
        }

        System.out.println("It took " + Years + " years to get " + Cesium + " Cesium.");
        

        


    }
}