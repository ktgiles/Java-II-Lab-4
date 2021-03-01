// Kaitlin Giles, Lab 4 File 1, 03/01/2021
// Extend Lot for triangular object

public class LotType1 extends Lot implements Comparable<Lot> {

    //establish variables
    String ID;
    int height;
    int length;

    //initiate constructor for lot type 1
    protected LotType1(String ID, int height, int length) {
        this.ID = ID;
        this.height = height;
        this.length = length;
    }

    //utilize methods to return variables
    public double calculateArea() {
        return height * length / 2;
    }
    public String getID() {
        return this.ID;
    }

    //use compareTo to enable sorting
    @Override
    public int compareTo(Lot o) {
        if (this.calculateArea() > o.calculateArea())
            return 1;
        else if (this.calculateArea() < o.calculateArea())
            return -1;
        else
            return 0;
    }
}

