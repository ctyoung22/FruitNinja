import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs3331Blade;
import fruitNinjaHelper.cs3331FruitNinjaGame;
import fruitNinjaHelper.cs3331ScoreController;

public class Game extends cs3331FruitNinjaGame{

    cs3331Blade chopper;
    cs3331ScoreController con;

    public Game() {
        chopper = new cs3331Blade("chopper");
        con = new cs3331ScoreController();
        addBlade(chopper);      //add blade object to game on instantiation
    }
    
    /*
     * Moves choppable objects onto the stage and updates their state based on intersection with Blade
     * @param item Choppable object being updated
     * @return void
     */
    public void updateChoppable(IChoppable item) {
        item.move();

        if(chopper.checkIntersection(item)) {
            item.chop();
            if(item.isScorable()) {
                con.addToScore(1);      //add 1 to score for each chopped fruit but none for a chopped bomb
            }
        }
    }

    /*
     * Randomized instantiation of Choppable items to be launched
     * @param none
     * @return bom or fru Choppable item instantiated
     */
    @Override
    public IChoppable launchItem() {
        String itemType = "";
        int rand = (int)(Math.random() * 5);
        switch(rand) {      //switch statement selects Choppable item to instantiate based on randomly generated integer
            case 0 -> itemType = Constants.APPLE_PATH;
            case 1 -> itemType = Constants.LEMON_PATH;
            case 2 -> itemType = Constants.PEACH_PATH;
            case 3 -> itemType = Constants.PEAR_PATH;
            case 4 -> itemType = "bomb";
        }

        if(itemType == "bomb") {        //instantiate Bomb object
            Bomb bom = new Bomb();
            return bom;
        }
        else {
            Fruit fru = new Fruit(itemType);    //instantiate Fruit object with appropriate fruit image
            fru.wash();
            fru.ripen();
            return fru;
        }
    }

    /*
     * Allows other classes to retrieve value game-specific score controller
     * @param none
     * @return con game-specific score controller object
     */
    public cs3331ScoreController getController() {
        return con;
    }

    /*
     * Helper method for updateChoppable()
     * @param none
     * @return void
     */
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
