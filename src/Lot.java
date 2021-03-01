/* abstract class, parent of LotType1 and LotType2
This file provided for project with instruction to make no changes
 */

public abstract class Lot {
    
    public abstract double calculateArea();
    public abstract String getID();
    
    @Override // Implement the toString method in GeometricObject
    public String toString() {
      return "Lot ID "+ getID() +" has area: "+ calculateArea();
  }
}
