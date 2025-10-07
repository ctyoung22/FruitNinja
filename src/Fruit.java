import fruitNinjaHelper.cs3331Fruit;

public class Fruit extends cs3331Fruit implements IChoppable{
    
    public Fruit(String imgUrl) {
        this.setImage(imgUrl);
    }

    public void chop() {
        this.chopGraphically();
    }

    public void move() {
        this.moveFruit();
    }
}
