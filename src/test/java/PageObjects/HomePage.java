package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepDefinations.TestBase;

import java.util.List;
import java.util.Locale;

public class HomePage extends TestBase {
    private By menuLink;
    public By subMenuLink;
    private By travelTab;
    private By travelTabSelectedStatus;
    private By fightTypeRadio;
    private By flightTicketOriginCity;
    private By flightTicketDestinationCity;
    private By findFlightsButton;
    private By originFlightsList;
    private By destinationFlightsList;
    private By TravellerMenuOpen;
    private By TravellerMenuClose;
    private By adultInput;
    private By adultAdd;
    private By fromDateEdit;
    private By economyPrices;
    private By economyRefundablePrices;
    private By businessPrices;
    private By economyPremiumEconomyPrices;
    private By flightInfoDuration;
    private By flightInfoStartTime;
    private By flightInfoEndTime;
    private By bestPricesList;
    private By bestDatesToTravel;
    private By toDateEdit;
    private By cabinType;
    private By classType;// whether economy or premium economy or business first
    private By oneway;
    private By bookWithMilesRadioButton;
    private By hotel_Booking;
    private By goingToCity;
    private By checkInDAte;
    private By checkOutDate;
    private By numberOfRooms;
    private By numberOfTravelers;
    private By adultsAdd;
    private By adultsSubtract;
    private By findHotels;





    public HomePage() {
        InitElements();
    }

    private void InitElements() {
        travelTab = By.xpath("//li[@id='travelTab']");
        travelTabSelectedStatus = By.xpath("//li[@id='travelTab'][@aria-selected='true']");
        flightTicketOriginCity = By.xpath("//input[@id='bookFlightOriginInput']");
        flightTicketDestinationCity = By.xpath("//input[@id='bookFlightDestinationInput']");
        findFlightsButton = By.xpath("//button[@type='submit']//span[text()='Find flights']");
        originFlightsList = By.xpath("//*[@id='bookFlightOriginInput-menu']//button//span");
        destinationFlightsList = By.xpath("//*[@id='bookFlightDestinationInput-menu']//button//span");
        TravellerMenuOpen = By.xpath("//p[@id='stuff']//following-sibling::button");
        TravellerMenuClose = By.xpath("//button[@class='atm-c-btn atm-c-btn--bare']");
        adultInput = By.xpath("//button[@aria-label='Add one more Adult']//following-sibling::input[1]");
        adultAdd = By.xpath("//button[@aria-label='Substract one Adult']");
        fromDateEdit = By.xpath("//input[@id='DepartDate']");
        toDateEdit = By.xpath("//input[@id='ReturnDate']");
        economyPrices = By.xpath("");
        economyRefundablePrices = By.xpath("");
        economyPremiumEconomyPrices = By.xpath("");
        businessPrices = By.xpath("");
        flightInfoDuration = By.xpath("");
        flightInfoStartTime = By.xpath("");
        flightInfoEndTime = By.xpath("");
        bestPricesList = By.xpath("//div[@class='app-components-Shopping-FareWheelCard-styles__amountValue--3IF2-']//span");
        bestDatesToTravel = By.xpath("//div[@class='app-components-Shopping-FareWheelCard-styles__dateLabel--MAATI']");
        cabinType= By.xpath("//button[@id='cabinType']");
//        classType=By.xpath("//div[text()='Economy']");
        oneway=By.xpath("//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]/span[1]");
        bookWithMilesRadioButton=By.xpath("//*[@id=\"bookFlightForm\"]/div[1]/div[1]/label/span");
        hotel_Booking=By.xpath("//*[@id=\"bookHotelTab\"]/h3/span");
        goingToCity=By.xpath("//input[@id=\"bookHotelInput\"]");
        checkInDAte=By.xpath("//input[@id='bookHotelCheckinDate']");
        checkOutDate=By.xpath("//input[@id='bookHotelCheckoutDate']");
        numberOfRooms=By.xpath("//*[@id=\"roomsDropdown\"]");
        numberOfTravelers=By.xpath("//*[@id=\"bookHotelModel.passengers\"]");
        adultsAdd=By.xpath("//button[@aria-label='plus']");
        adultsSubtract=By.xpath("//button[@aria-label='minus']");
        findHotels=By.xpath("//button[@aria-label=\"Find hotels button.\"]");


    }
    public void selectBookmenu() throws Exception {
        click(travelTab);
        waitForElementToDisplay(travelTabSelectedStatus, 10);
        if(isElementCurrentlyDisplayed(travelTabSelectedStatus)){
            test.pass("Selected Book tab");
        } else {
            test.fail("Selected Book tab");
            Assert.fail("Selected Book tab");
        }
    }

    public void  selectFlightTab() throws Exception{
        click(travelTab);
        waitForElementToDisplay(travelTabSelectedStatus, 10);
        if(isElementCurrentlyDisplayed(travelTabSelectedStatus)){
            test.pass("Selected Book tab");
        } else {
            test.fail("Selected Book tab");
            Assert.fail("Selected Book tab");
        }
    }

    public void selectFlightType(String flightType) throws Exception {
        fightTypeRadio = By.xpath("//input[@id='"+flightType.toLowerCase()+"']//following-sibling::span");
        click(fightTypeRadio);
        test.info("Flight type selected as: "+flightType);
    }

    public void selectFromCity(String city) {
        if(sendKeys(flightTicketOriginCity, city)){
            pause(3000);
            List<WebElement> originFlights = driver.findElements(originFlightsList);
            for(int i=0;i<originFlights.size();i++){
                System.out.println(originFlights.get(i).getText().trim());
            }
            if (originFlights.size() > 0) {
                click(originFlights.get(0));
                test.pass("Origin city selected");;
            }
        } else {
            test.fail("Origin city not selected as: "+city);
            Assert.fail("Origin city not selected as: "+city);
        }
    }

    public void selectToCity(String city) {
        if(sendKeys(flightTicketDestinationCity, city)) {
            pause(3000);
            List<WebElement> destinationFlights = driver.findElements(destinationFlightsList);
            for(int i=0;i<destinationFlights.size();i++){
                System.out.println(destinationFlights.get(i).getText().trim());
            }
            if (destinationFlights.size() > 0) {
                click(destinationFlights.get(0));
                test.pass("Destination city selected ");
            }
        }else {
            test.fail("Destination city not selected as: "+city);
            Assert.fail("Destination city not selected as: "+city);
        }
    }

    public void clickOnFindFlightsButton() throws Exception {
        if(click(findFlightsButton)){
            test.pass("Find flights button is selected");
        } else {
            test.fail("Find flights button is selected");
            Assert.fail("Find flights button is selected");
        }
    }

    public void selectTravellersMenu() throws Exception {
        click(TravellerMenuOpen);
    }

    public void closeTravellersMenu() throws Exception {
        click(TravellerMenuClose);
    }


    public void selectAdults(String travellers) throws Exception {
        click(TravellerMenuOpen);
        pause(2000);
        click(adultInput);
//        sendKeys(adultInput, travellers);
        for (int i = 1; i < Integer.parseInt(travellers); i++) {
            pause(1000);
            click(adultAdd);
        }
    }

    public void verifyListOfAvailableFlights() {
        pause(10000);
        List<WebElement> pricesList = driver.findElements(bestPricesList);
        List<WebElement> datesList = driver.findElements(bestDatesToTravel);
        for(int i=0;i<pricesList.size();i++){
            test.info("Date: "+datesList.get(i).getText());
            test.info("Price: "+pricesList.get(i).getText());
        }
    }

    public void selectFromDate(String fromDate) {
        if(sendKeys(fromDateEdit,fromDate )){
            test.pass("From Date is selected as: "+fromDate);
        }
    }

    public void selectToDate(String toDate) {
        if (sendKeys(fromDateEdit, toDate)) {
            test.pass("From Date is selected as: " + toDate);
        }
    }
    public void cabinButton () throws Exception {
        click(cabinType);
    }
    //    public void  classType1 () throws Exception{
//        click(classType);
//    }
    public void oneWayRadioButton() throws  Exception{
        click(oneway);
    }
    public void setBookWithMilesRadioButton() throws Exception {
        click(bookWithMilesRadioButton);
    }
    public void hotelBooking() throws Exception {
        click(hotel_Booking);
    }
    public void goingTo_city(String city) throws Exception {
        click(goingToCity);
        if(sendKeys(goingToCity, city)){
            pause(3000);
            List<WebElement> goingCity = driver.findElements(goingToCity);
            for(int i=0;i<goingCity.size();i++){
                System.out.println(goingCity.get(i).getText().trim());
            }
            if (goingCity.size() > 0) {
                click(goingCity.get(0));
                test.pass("Going To city selected");;
            }
        } else {
            test.fail("Going to city not selected as: "+city);
            Assert.fail("Going to  city not selected as: "+city);
        }
    }
    public void checkIn_DateDate(String fromDate) {
        if(sendKeys(checkInDAte,fromDate )){
            test.pass("checkIn Date is selected as: "+fromDate);
        }
    }
    public void checkOut_Date(String toDate) {
        if(sendKeys(checkOutDate,toDate )){
            test.pass("checkOut Date is selected as: "+toDate);
        }
    }
    public void numberOfRooms() throws Exception {
        click(numberOfRooms);
    }
    public void numberOfAdults(String travellers) throws Exception {
        click(numberOfTravelers);
        pause(2000);
        click(adultsAdd);
    }
    public void findHotelsButton() throws Exception {
        click(findHotels);
    }

}