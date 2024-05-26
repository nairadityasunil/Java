public class p2 {
    static void checkAge(int age) throws ArithmeticException {

            if (age < 18) {
              throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }
            else {
              System.out.println("Access granted - You are old enough!");
            }
        
    }
  
    public static void main(String[] args) {
      try
      {
        checkAge(15); // Set age to 15 (which is below 18...)
      }
      catch(ArithmeticException ex)
      {
        System.out.println(ex.getMessage());
      }
    }
  }