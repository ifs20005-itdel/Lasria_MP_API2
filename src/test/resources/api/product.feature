Feature: product

  Scenario Outline: Send GET http request to get all product data
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code <ignoredArg0>
    And I received valid data for all products
    Examples:
      | ignoredArg0 |
      | 200         |



  Scenario Outline: Send DELETE http request to delete product data
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive a valid HTTP response code <ignoredArg0> in products DELETE
    Examples:
      | ignoredArg0 |
      | 200         |

  Scenario Outline: Send POST http request to create a new product  by filling in request body data correctly
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive a valid HTTP response code <ignoredArg0> in products POST
    And I receive valid data for new product
    Examples:
      | ignoredArg0 |
      | 200         |

  Scenario Outline: GET As an admin I have be able to get products rating
    Given I set GET endpoints by rating
    When I send GET HTTP request by rating
    Then I receive valid HTTP response code <ignoredArg0> for Get rating data products
    And I receive valid data for rating products
    Examples:
      | ignoredArg0 |
      | 200         |

  Scenario Outline: GET As an admin I have be able to get products comment
    Given I set GET endpoints by comment
    When I send GET HTTP request by comment
    Then I receive valid HTTP response code <ignoredArg0> for Get comment data products
    And I receive valid data for comment products
    Examples:
      | ignoredArg0 |
      | 200         |





