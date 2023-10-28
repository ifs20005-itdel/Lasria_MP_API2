Feature: authentication



  Scenario Outline: Send post http requests to login by filling valid data on the body
    Given I have valid credentials
    When I submit a POST request to <ignoredArg0> with email <ignoredArg1> and password <ignoredArg2>
    Then I receive valid HTTP response code Login <ignoredArg01>
    Examples:
      | ignoredArg0   | ignoredArg1                    | ignoredArg2   | ignoredArg01 |
      | "/auth/login" | "lasriarajagukguk08@gmail.com" | "lasriargg08" | 200          |

  Scenario Outline: Send post http requests to register by filling valid data on the body
    Given I register using the correct data
    When I submit a POST request to <ignoredArg0> with fullname <ignoredArg1>, email <ignoredArg2> and password <ignoredArg3>
    Then I receive valid HTTP response code register <ignoredArg01>
    And register successfully
    Examples:
      | ignoredArg0      | ignoredArg1 | ignoredArg2           | ignoredArg3 | ignoredArg01 |
      | "/auth/register" | "lasriaaa"  | "lasriargg@gmail.com" | "lasdf123"  | 200          |