#language:en

Feature: login
  Scenario Outline: user login with username and password
    Given that user has opened website
    When he want login
      |Username   |Password  |Validation |
      |<username> |<password>|<validation> |

    Examples:
    |username|password    |validation |
    |student |Password123 |correct    |
    |studen  |Password123 |badname    |
    |student |Password12  |badpass    |

  # Scenario: user click on practrice then click on Test login page
  #  Given that user has opened website
  #  When he go to practice
  #  And he go to Test Loging Page
  # Then he should see login form

