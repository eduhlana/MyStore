#Author: mesquitalana@ygmail.com

#@register @login
Feature: Validate register form
  I want to validate the register form  to access the aplication and order some itens


 @register1
  Scenario Outline: Open register form
    Given I click at Sign in button
    When I insert my email with "<email>"
    And Click at Create an account
    Then The register form should be displayed

    Examples: 
      | email |
      | mesquita@gmail.com |
      
      
@register
Scenario Outline: Validate register form with empty fields
    Given I opened the register form
    When I click at register with the following values "<firstName>" "<lastName>" "<passw>" "<address>" "<city>" "<postalCode>" "<country>" "<mobilePhone>"
    Then I should see a validation message
    

    Examples: 
      |firstName|lastName|passw|address|city|postalCode|country|mobilePhone  |
      |   |    |          |        |        |      |             |           |
      |   |Lana|Teste@2020|Teste um|Michigan|85001 |United States|31994967888|
      |Edu|    |Teste@2020|Teste um|Michigan|85001 |United States|31994967888|
      |Edu|Lana|          |Teste um|Michigan|85001 |United States|31994967888|
      |Edu|Lana|Teste@2020|        |Michigan|85001 |United States|31994967888|
      |Edu|Lana|Teste@2020|Teste um|        |85001 |United States|31994967888|
      |Edu|Lana|Teste@2020|Teste um|Michigan|      |United States|31994967888|
      |Edu|Lana|Teste@2020|Teste um|Michigan|85001 |             |31994967888|
      |Edu|Lana|Teste@2020|Teste um|Michigan|85001 |United States|           |
      
      