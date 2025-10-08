public interface IChoppable {
    void chop();        //invokes chopping behavior of implementing object
    void move();        //invokes movement behavior of implementing object
    boolean isScorable();       //identifies whether implementing object should add to score
}
