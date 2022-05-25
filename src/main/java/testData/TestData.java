package testData;
// This is to generate the test data

import org.testng.annotations.Test;

public class TestData {
    @Test
    public void getTestData(){
        // TO generate Random Email with 7 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(7));
        // To generate random email with 20 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(20));

        //To generate Random Email with 14 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(14));
        // To generate  Future Date.
        System.out.println(TestDataGenerator.getFutureDate(30));
        // To generate Past Date
        System.out.println(TestDataGenerator.getPastDate(20));
        // To generate Current Date : yyyy-MM-dd
        System.out.println(TestDataGenerator.getcurrentDate());
        // To generate Current Date UTC Format : yyyy-MM-dd HH:mm:ss
        System.out.println(TestDataGenerator.getcurrentDateUTC());
        // To generate Current Date EST Format : yyyy-MM-dd HH:mm:ss
        System.out.println(TestDataGenerator.getcurrentDateEST());
        // To generate Current Date EmailDate Format :
        System.out.println(TestDataGenerator.getcurrentDateEmailDateFormat());

        System.out.println(TestDataGenerator.getUniqueDate());

        System.out.println(TestDataGenerator.getRandomNumber(20));
        //To generate random password.
        System.out.println(TestDataGenerator.getRandomPassword());
        System.out.println(TestDataGenerator.getUniqueNumber());
        System.out.println(TestDataGenerator.getGroupId());

        System.out.println(TestDataGenerator.getRandomAlphabeticString(4));


    }

}
