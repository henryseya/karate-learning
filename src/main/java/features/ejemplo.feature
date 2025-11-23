
Feature: Prueba básica con Karate
  Scenario: Validar respuesta GET
    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200
    And match response.data.id == 2