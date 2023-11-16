public class CallMethod{
    public static double average(double a, double b){
        double answer = (a + b / 2);
        return answer;
    }

    public static void main(String[] args) {
        double f = 10.0;
        double g = 8.0;
        double avg = average(f, g);
        System.out.println("avg= "+ avg);
    }



    /* public static int max(int a, int b){
        if (a > b) {
            return a;
        }
        else {
            return b;
        } */






    }
}