import java.util.Arrays;

public class HW17PartB {

    public static void print(int[][] values){

    System.out.print(Arrays.toString(values));
    System.out.println("");
    for (int i = 0; i < values.length; i++) {
        for (int j = 0; j < values[0].length; j++) {
            
            System.out.print(values[i][j]);
            if (j < values[i].length - 1) { 
                System.out.print(", ");
            }
            
        }
        System.out.println("");
    }
}


    public static void main(String[] args) throws Exception {



    /* int[][] chart = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    }; */

    int[][] chart2 = {
    {8, 6, 7},
    {5, 3, 0}
    };

    print(chart2);

    int[][] chart3 = {
    {0,  7,  6,  5},
    {2,  2,  0,  1},
    {8,  4,  5,  7},

    };

    print(chart3);





    //295 java concepts book shows info u want this above is wrong
 

/*Declare and initialize an array of integers that has 4 rows and 3 columns.  All of the elements in the array should be initialized to zero.
Declare and initialize an array of integers that has 2 rows and 5 columns.  All of the elements in the array should be initialized to zero.
Declare and initialize an array of integers that represents the following matrix,
 */





    }
    
}





