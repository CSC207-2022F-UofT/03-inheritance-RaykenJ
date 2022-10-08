/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class CrossbodyBag extends Bag{
    int straps;

    public CrossbodyBag(String color, int capacity, int straps){
        super(color, capacity);
        this.straps = straps;
    }

    public int getNumberOfStraps(){
        return straps;
    }

    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }


    @Override
    public String toString() {
        return getColor() + " Crossbody Bag with " + straps + " straps (" + getNumberOfContents() + " / " +
                getCapacity() + ")";
    }
}
/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *

 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
