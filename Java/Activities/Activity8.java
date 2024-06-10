package activities;

public class Activity8 {

    public static void main(String[] a) {

        try {
            Activity8.exceptionTest("This is to be printed in console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("This line will not be executed");
        } catch (CustomException name2) {
            System.out.println("Inside catch block - "+ name2.getMessage());
        }

    }

    static void exceptionTest(String str) throws CustomException {
            
        if (str == null) 
        {
             throw new CustomException("String value is null");   
        
        }
        else {
            System.out.println(str);
        }

    }











}



