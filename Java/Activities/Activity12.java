package activities;

public class Activity12 {

    public static void main(String[] args) {

        Addable ad1 = (num1, num2) -> (num1 + num2);
        System.out.println("The sum of Num1 and Num2 is "+ad1.add(50, 70));

        Addable ad2 = (int num1, int num2) -> {
            return (num1 + num2);
        };

        System.out.println("The sum of Num1 and Num2 with return expression is " +ad2.add(80, 100));
    }
}
