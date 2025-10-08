import fruitNinjaHelper.cs3331Fruit;

public class Fruit extends cs3331Fruit implements IChoppable{
    
    public Fruit(String imgUrl) {
        this.setImage(imgUrl);
    }

    /*
     * Slices the fruit when it is chopped
     * @param none
     * @return void
     */
    public void chop() {
        this.splash();
        this.chopGraphically();
    }

    /*
     * Moves the fruit onto the screen
     * @param none
     * @return void
     */
    public void move() {
        this.moveFruit();
    }

    /*
     * Identifies the fruit object as scorable
     * @param none
     * @return void
     */
    public boolean isScorable() {
        return true;
    }
}
