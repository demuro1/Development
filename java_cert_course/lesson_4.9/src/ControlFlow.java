public class ControlFlow {
    public static void main(String args[]){
//        this lesson deals with an intro to if...else and switch statements
        boolean hungary = true;

        if (hungary) {
            System.out.println("I am starving....");
        }  else {
            System.out.println("I am not hungary.");
        }

        int hungerRating = 5;

        if (hungerRating < 6) {
            System.out.println("I am not hungary.");
        }  else {
            System.out.println("I am starving....");
        }

        int month = 6;
        String monthString;

        switch (month){
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            default: monthString = "Unknown Month";
                break;
        }
        System.out.println(monthString);

    }
}
