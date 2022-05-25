package stepDefinations.unitedHomeSteps;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import testData.TestDataGenerator;

import java.io.IOException;

public class United_Home_StepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage =  new HomePage();



//    @When("^User open united home page$")
//    public void user_open_united_home_page() throws Throwable {
//        loginPage.openBrowser();
//        loginPage.navigateToApplicationPage();
//    }

    @When("user open united home page")
    public void userOpenUnitedHomePage() throws IOException {
        loginPage.openBrowser();
        loginPage.navigateToApplicationPage();
    }

    @And("user selects book tab")
    public void userSelectsBookTab() throws Exception {
        homePage.selectBookmenu();

    }

    @And("user selects flight tab")
    public void userSelectsFlightTab() throws Exception {
        homePage.selectFlightTab();
    }

    @And("user selects Roundtrip radio button")
    public void userSelectsRoundtripRadioButton() throws Exception {
        homePage.selectFlightType("Roundtrip");
    }

    @And("user selects from")
    public void userSelectsFrom() {
        homePage.selectFromCity("Singapore");
    }

    @And("user selects to")
    public void userSelectsTo() {
        homePage.selectToCity("dubai");
    }

    @And("user selects from date and return date")
    public void userSelectsFromDateAndReturnDate() {
        homePage.selectFromDate(TestDataGenerator.getcurrentDate());
        homePage.selectToDate(TestDataGenerator.getFutureDate(12));
    }

    @And("user selects number of Adults")
    public void userSelectsNumberOfAdults() throws Exception {
        homePage.selectAdults(String.valueOf(TestDataGenerator.getRandomNumber(12)));
    }

    @And("user selects the class")
    public void userSelectsTheClass() throws Exception {
        homePage.cabinButton();
//        homePage.classType1();
    }

    @And("user clicks on find flights")
    public void userClicksOnFindFlights() throws Exception {
        homePage.clickOnFindFlightsButton();
    }


    @And("user selects one-way Radio button")
    public void userSelectsOneWayRadioButton() throws Exception {
        homePage.oneWayRadioButton();
    }

    @And("user selects from date")
    public void userSelectsFromDate() {
        homePage.selectToDate(TestDataGenerator.getFutureDate(12));
    }

    @And("user clicks book with miles button")
    public void userClicksBookWithMilesButton() throws Exception {
        homePage.setBookWithMilesRadioButton();
    }

    @And("user clicks on Hotel")
    public void userClicksOnHotel() throws Exception {
        homePage.hotelBooking();
    }

    @And("user selects going to place")
    public void userSelectsGoingToPlace() throws Exception {
        homePage.goingTo_city("dubai");
    }

    @And("user selects checkIn date")
    public void userSelectsCheckInDate() {
        homePage.checkIn_DateDate(TestDataGenerator.getcurrentDate());
    }

    @And("user selects CheckOut date")
    public void userSelectsCheckOutDate() {
        homePage.checkOut_Date(TestDataGenerator.getFutureDate(13));
    }

    @And("user selects number of rooms")
    public void userSelectsNumberOfRooms() throws Exception {
        homePage.numberOfRooms();
    }

    @And("user selects number of adults")
    public void userSelectsNumberOfadults() throws Exception {
        homePage.numberOfAdults(String.valueOf(TestDataGenerator.getRandomNumber(12)));
    }


    @And("user clicks on find hotels")
    public void userClicksOnFindHotels() throws Exception {
        homePage.findHotelsButton();
    }
}
