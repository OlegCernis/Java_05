package project_utils;

public class Utils {

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "fail";
        }

    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void returnNumLine(int start, int end, int step) {
        if (step == 0) {
            System.out.println("Error! Enter correct step number");

        } else if (start == end && step != end ) {
            System.out.println("Error! Start and end number equals, and entered step don't work ");

        } else {
            int newStart = start - start % step;

            if (start <= end && step > 0) {

                if (newStart < start) {
                    newStart += step;
                }
                for (int i = newStart; i <= end; i += step) {

                    System.out.print(i + " ");
                }

            } else if (start >= end && step > 0) {

                if (newStart > start) {
                    newStart -= step;
                }
                for (int i = newStart; i >= end; i -= step) {

                    System.out.print(i + " ");
                }
            } else if (start <= end) {

                if (newStart < start) {
                    newStart -= step;

                }
                for (int i = newStart; i <= end; i -= step) {

                    System.out.print(i + " ");
                }

            } else {
                if (newStart > start) {
                    newStart += step;
                }
                for (int i = newStart; i >= end; i += step) {

                    System.out.print(i + " ");
                }
            }
        }
    }
}
