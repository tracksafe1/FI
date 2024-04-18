Feature: user scenarios

  @Regression
  Scenario:end user
    Given user is on Homepage
    When user clicks on AcceptCookies
    And User clicks on ManufacturingIndustries
    And user clicks on industrialManufacturing
    And user verify text message "Industrial manufacturing made smarter"
    Then print names of links on tha page

  @Regression1
  Scenario Outline:user fills contact us form
    Given user is on Homepage
    When user clicks on AcceptCookies
    And user clicks on contact us
   And User enter "<BusinessEmailAddress>","<FirstName>","<LastName>","<PhoneNumber>","<CompanyName>","<Country>","<Industry>"
    Then user clicks on submit button
    Examples:
      | BusinessEmailAddress | FirstName | LastName | PhoneNumber | CompanyName | Country   | Industry  |
      | xyz@gmail.com        | james     | Smith    | 07789564789 | Abc.ltd     | Australia | Energy    |
      | sse@gmail.com        | oliver    | paul     | 098789      | sde         | Brazil    | Education |
