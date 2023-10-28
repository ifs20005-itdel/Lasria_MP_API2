Feature: product category

  Scenario Outline: Send POST http request to create a new category product with data correctly on the body request
    Given I set the POST api endpoints in category
    When I send HTTP api POST request
    Then I receive valid HTTP response code <ignoredArg0> in product category
    And I receive valid data for new product category
    Examples:
      | ignoredArg0 |
      | 200         |

  Scenario Outline: Send GET http request to get all category
    Given I set the GET api endpoints
    When I send HTTP api GET request
    Then I receive valid HTTP response code <ignoredArg0> for GET All product category
    And I received valid data for all product category
    Examples:
      | ignoredArg0 |
      | 200         |



  Scenario Outline: Send DELETE http request to delete category
    Given I set the DELETE api endpoints
    When I send HTTP api DELETE request for category
    Then I receive valid HTTP response code <ignoredArg0> for category DELETE
    Examples:
      | ignoredArg0 |
      | 200         |
