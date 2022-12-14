import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    /**
     *1.  positive testing happy path
     *    if (start <= end)
     *    return array;
     */

    @Test

    public void testStartLessThanEnd_HappyPath() {
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
//        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
        @Test

        public void testStartEqualsEnd_HappyPath(){
            /**
             * 1.2
             * if (start == end)
             */
            int start = 1;
            int end = 1;
            String[] expectedResult = {"1"};
//        FizzBuzz fizzBuzz = new FizzBuzz();
            String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
            Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testStartLessThanEndStartAndEndAreNegative() {
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};
//        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
    /**
     *  2. Negative testing
     *  if (start > end)
     *   return new String[0];
     */
    @Test

    public void testStartGreateThanEnd_Negative() {
        //Arrange
        int start = 20;
        int end = 1;
        //Act
        String[] expectedResult = {"1"};
//        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
