#Author: your.email@your.domain.com

@contact
Feature: Title of your feature
  I want to use this template for my feature file

  @contact
  Scenario Outline: Success contact
    Given open the contact us form
    When i fill up all fields "<subject>""<email>" "<order>" "<message>" 
    And i click at Send button
    Then i should see succes message "Your message has been successfully sent to our team."
   Examples: 
      |subject| email | order | message  |
      |Customer service| a@a.com |  order1  | success |
     

  