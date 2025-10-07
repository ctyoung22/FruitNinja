import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs3331FruitNinjaGame;
import fruitNinjaHelper.cs3331ScoreController;

public class Game extends cs3331FruitNinjaGame{

    cs3331ScoreController con;

    // You may need to add constructor
    public Game() {
        this.con = new cs3331ScoreController();
    }
    
    public void updateChoppable(IChoppable item) {
        
        // Your code goes here
        item.move();
    }

    @Override
    public IChoppable launchItem() {

        // YOUR code goes here
        Fruit fru = new Fruit(Constants.APPLE_PATH); //hardcoded, make this generic
        fru.wash();
        fru.ripen();
        return fru; // Change the return statement
    }

    public cs3331ScoreController getController() {
        return this.con;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
