Feature: Prueba básica en Karate

  Scenario: Validar respuesta simple
    Given url 'https://jsonplaceholder.typicode.com/posts/1'
    When method GET
    Then status 200
    And match response.title == '#string'