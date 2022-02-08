Feature: Game 421

  Scenario: determine which player will start the game
    Given "Player 1" roll the dice and has score 6
    And "Player 2" roll the dice and has score 5
    When "Player 1" has a higher score than "Player 2"
    Then "Player 1" should start the game