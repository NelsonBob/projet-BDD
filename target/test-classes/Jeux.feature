Feature: Game 421

  Scenario: determine which player will start the game
    Given "Player 1" roll the dice and has score "Score"
    And "Player 2" roll the dice and has score "Score"
    When "Player 1" has a higher score than "Player 2"
    Then "Player 1" should start the game

  Scenario: determine which player will Higher  score of the game
    Given "Player 1" roll the dice and has a score "421"
    And "Player 2" roll the dice and has score "3AS"
    When "Player 1" has a higher score than in "Player 2"
    Then "Player 1" should Win the "Player 2"

  Scenario: perfect equality
    Given "Player 1" roll dice and has score "Score"
    And "Player 2" roll dice and has score "Score"
    When "Player 1" has a equal score than "Player 2"
    Then "Player 1" should continue to date with "Player 2"

    

