
#@RUN
  Feature: This feature books the flight tickets
    @RUN
    Scenario: This test is to book tickets for two way
      When user open united home page
      And user selects book tab
      And user selects flight tab
      And user selects Roundtrip radio button
      And user clicks book with miles button
      And user selects from
      And user selects to
      And user selects from date and return date
      And user selects number of Adults
      And user selects the class
      And user clicks on find flights
#@RUN
    Scenario: This test is to book tickets for one way
      When user open united home page
      And  user selects book tab
      And  user selects flight tab
      And user selects one-way Radio button
      And user selects from
      And user selects to
      And user selects from date
      And user selects number of Adults
      And user selects the class
      And user clicks on find flights
#@RUN
    Scenario: This test is to book a hotel
      When user open united home page
      And  user selects book tab
      And user clicks on Hotel
      And user selects going to place
      And user selects checkIn date
      And user selects CheckOut date
      And user selects number of rooms
      And user selects number of adults
      And user clicks on find hotels

