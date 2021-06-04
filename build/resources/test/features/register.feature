Feature: Register
  The user has to stay in the Web
  Select "Register Option"
  Fill all fields

  Scenario Outline: Register
    Given Select Register Here
    When Fill in the fields
      | userName   | lastName   | phone   | email   | address1   | city   | state   | postalCode   | password   | confirmPassword   |
      | <userName> | <lastName> | <phone> | <email> | <address1> | <city> | <state> | <postalCode> | <password> | <confirmPassword> |

    Then See message REGISTER
    Examples:
      | userName | lastName | phone | email            | address1   | city   | state  | postalCode | password | confirmPassword |
      | julian   | velasco  | 12345 | julian@gmail.com | abcde12345 | bogota | bogota | 1111       | julian   | julian          |
      | camilo   | torres   | 9876  | camilo@gmail.com | xcv12345   | tunja  | bogota | 2222       | camilo   | camilo          |


