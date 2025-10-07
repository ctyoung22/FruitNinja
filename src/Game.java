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
        addBlade(chopper);
    }
    
    public void updateChoppable(IChoppable item) {
        item.move();

        if(chopper.checkIntersection(item)) {
            item.chop();
            if(item.isScorable()) {
                con.addToScore(1);
            }
        }
    }

    @Override
    public IChoppable launchItem() {
        String itemType = "";
        int rand = (int)(Math.random() * 5);
        switch(rand) {
            case 0 -> itemType = Constants.APPLE_PATH;
            case 1 -> itemType = Constants.LEMON_PATH;
            case 2 -> itemType = Constants.PEACH_PATH;
            case 3 -> itemType = Constants.PEAR_PATH;
            case 4 -> itemType = "bomb";
        }

        if(itemType == "bomb") {
            Bomb bom = new Bomb();
            return bom;
        }
        else {
            Fruit fru = new Fruit(itemType);
            fru.wash();
            fru.ripen();
            return fru;
        }
    }

    public cs3331ScoreController getController() {
        return con;
    }

    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
