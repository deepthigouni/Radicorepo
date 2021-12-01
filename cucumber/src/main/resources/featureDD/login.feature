Feature: Login Feature

  Scenario Outline: Verify FaceBook Valid Login
    Given User Open Browser
    And enters facebook url
    When user enter <username>
    And user enters <password>
    And user clicks on Login Button
    Then Home Page should be Displayed

    Examples: 
      | username                | password         |
      | deepthigouni9@gmail.com | deepthikunnu0924 |
