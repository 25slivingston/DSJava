public class HW11PartA {

    

public static void main(String[] args)
{
   double len = 2;
   double result = cubeVolume(len);
   System.out.println(result);
   len = 10;
   result = cubeVolume(len);
   System.out.println(result);
}

public static double cubeVolume(double sideLength)
{   
   double volume = sideLength * sideLength * sideLength;
   return volume;
}

}










