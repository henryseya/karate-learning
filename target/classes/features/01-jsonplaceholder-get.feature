Feature: Prueba básica con API REST (JSONPlaceholder)

  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Validar un GET simple
    Given path 'posts/1'
    When method GET
    Then status 200
    And match response.id == 1
    And match response.title == '#string'
