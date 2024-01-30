@bookingSG

Feature: BookingSG website's services working flow

  @Service1
  Scenario: Service 1 booking process
    Given A user opens web browser navigate to Service 1 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 1
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
    Then  User clicks on View your booking button
      And User verifies booking status as Pending approval
      And User closes browser

  @Service2
  Scenario: Service 2 booking process
    Given A user opens web browser navigate to Service 2 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 2
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
    Then  User clicks on View your booking button
      And User verifies booking status as Pending acceptance
      And User closes browser

  @Service3
  Scenario: Service 3 booking process
    Given A user opens web browser navigate to Service 3 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 3
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
      And Your booking has been confirmed message is displayed
    Then  User clicks on View your booking on Menu
      And User verifies booking status as Accepted
      And Button reschedule is enabled
      And User closes browser

  @Service4
  Scenario: Service 4 booking process
    Given A user opens web browser navigate to Service 4 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 4
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
    Then  User clicks on View your booking button
      And User verifies booking status as Pending approval
      And User closes browser

  @Service5
  Scenario: Service 5 booking process
    Given A user opens web browser navigate to Service 5 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 5
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
      And Your booking has been confirmed message is displayed
    Then  User clicks on View your booking on Menu
      And User verifies booking status as Accepted
      And Button cancel is enabled
      And User closes browser

  @Service6
  Scenario: Service 6 booking process
    Given A user opens web browser navigate to Service 6 link
      And User clicks on login button
    When  User switches to Service Booking modal have title is Service 6
      And User chooses first available time slot and click on Confirm button
      And User switches to Personal details modal and click on Next button
      And User switches to Review modal and click on Submit button
    Then  User clicks on View your booking button
      And User verifies booking status as Pending acceptance
      And User closes browser
