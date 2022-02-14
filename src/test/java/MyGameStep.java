import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyGameStep {

        @Given("{string} roll the dice and has score {string}" )
        public void thePlayerRollTheDiceAndHasScore(String playerName,String score) {
        }
        @When( "{string} has a higher score than {string}")
        public void  theFirstPlayersHasHigherScoreThanSecondPlayer(String player1Name,String player2Name){

        }
        @Then("{string} should start the game")
        public void thePlayerShouldStartTheGame(String playerName){

        }

        @Given("{string} roll the dice and has a score {string}" )
        public void thePlayerRollTheDiceAndHasAScore(String playerName , String score ) {
        }
        @When( "{string} has a higher score than in {string}")
        public void  theFirstPlayersHasHigherScoreThanInSecondPlayer(String player1Name,String player2Name){

        }

        @Then("{string} should Win the {string}")
        public void shouldWinThe(String player1Name, String  player2Name ) {
        }


        @Given("{string} roll dice and has score {string}")
        public void thePlayerRollDiceAndHasScore(String playerName, String score) {
        }

        @When("{string} has a equal score than {string}")
        public void theFirstPlayersHasAEqualScoreThanSecondPlayer(String player1Name, String player2Name) {
        }



        @Then("{string} should continue to date with {string}")
        public void heFirstPlayersShouldContinueToDateWithSecondPlayer(String player1Name, String arplayer2Nameg) {
        }
}
