/*
 * Conner Young
 * 10/7/25
 * CSCI 3331-002
 * 
 * Files: README.md (pages referenced)
 * 
 * Fruit Ninja
 * Launches a playable version of the game Fruit Ninja, in which you
 * drag a blade across the window to chop fruit and avoid bombs to achieve
 * a high score.
 */

import fruitNinjaHelper.cs3331FruitNinjaFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    /*
     * Starts a new Fruit Ninja game
     * @param primaryStage The stage in which the game is played
     * @return void
     */
    public void start(Stage primaryStage) {
        cs3331FruitNinjaFrame frame = new cs3331FruitNinjaFrame(primaryStage);
        Game game = new Game();
        frame.addGame(game);        //add game to frame
        frame.setTop(game.getController());     //add score controller to frame
        game.startGame();
        game.updateChoppable(game.launchItem());        //launch items onto screen
    }

    /*
     * Main method launches the application
     * @param args Arguments passed to the compiler
     * @return void
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
