package testData;

import org.testng.annotations.Test;

public class GenerateTestData {

    @Test
    public void testData(){
        // to generate random Email with 5 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(5));
        // to generate random Email with 10 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(10));
        //To generate Random Email with 15 letters.
        System.out.println(TestDataGenerator.generateRandomEmail(15));
        // To generate  Future Date.
        System.out.println(TestDataGenerator.getFutureDate(6));
        // To generate Past Date
        System.out.println(TestDataGenerator.getPastDate(10));
        // To generate Current Date : yyyy-MM-dd
        System.out.println(TestDataGenerator.getcurrentDate());
        // To generate Current Date UTC Format : yyyy-MM-dd HH:mm:ss
        System.out.println(TestDataGenerator.getcurrentDateUTC());
        // To generate Current Date EST Format : yyyy-MM-dd HH:mm:ss
        System.out.println(TestDataGenerator.getcurrentDateEST());
        // To generate Current Date EmailDate Format :
        System.out.println(TestDataGenerator.getcurrentDateEmailDateFormat());

        System.out.println(TestDataGenerator.getUniqueDate());

        System.out.println(TestDataGenerator.getRandomNumber(100000));
        //To generate random password.
        System.out.println(TestDataGenerator.getRandomPassword());
        System.out.println(TestDataGenerator.getUniqueNumber());
        System.out.println(TestDataGenerator.getGroupId());

        System.out.println(TestDataGenerator.getRandomAlphabeticString(2));

    }
}

