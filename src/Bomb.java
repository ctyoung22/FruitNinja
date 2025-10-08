import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements IChoppable{
    
    public Bomb() {
        this.setImage();
    }

    /*
     * Explodes the bomb when it is chopped
     * @param none
     * @return void
     */
    public void chop() {
        this.explode();
    }

    /*
     * Moves the bomb onto the screen
     * @param none
     * @return void
     */
    public void move() {
        this.moveBomb();
    }

    /*
     * Identifies the bomb object as non-scorable
     * @param none
     * @return void
     */
    public boolean isScorable() {
        return false;
    }    
}
