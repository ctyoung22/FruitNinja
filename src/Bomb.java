import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements IChoppable{
    
    public Bomb() {
        this.setImage();
    }

    public void chop() {
        this.explode();
    }

    public void move() {
        this.moveBomb();
    }

    public boolean isScorable() {
        return false;
    }    
}
