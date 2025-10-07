import fruitNinjaHelper.cs3331FruitNinjaFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        cs3331FruitNinjaFrame frame = new cs3331FruitNinjaFrame(primaryStage);
        Game game = new Game();
        frame.addGame(game);
        frame.setTop(game.getController());
        game.startGame();
        game.updateChoppable(game.launchItem());
        /* INSERT YOUR CODE HERE */
        
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
