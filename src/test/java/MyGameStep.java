import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyGameStep {

        @Given("{string} roll the dice and has score {int}" )
        public void thePlayerRollTheDice(String playerName , int score ) {
        }
        @When( "{string} has a higher score than {string}")
        public void  theFirstPlayersHasHigherScoreThanSecondPlayer(String player1Name,String player2Name){

        }
        @Then("{string} should start the game")
        public void thePlayerShouldStartTheGame(String playerName){

        }

}
