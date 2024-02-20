  public class PartB {
  
    
  
  
  public static int getInt() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }
}


/*this program prints a 3 because finally is always executed. it sould return 1, 
but "finally" overrides this and it prints a 3. */
