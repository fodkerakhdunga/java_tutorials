class DemoShipment {
  public static void main(String[] args) {

  Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
  Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

  double vol;

  vol = shipment1.volume();
  System.out.println("Volume of Shipment1 is " + vol);
  System.out.println("Weight of shipment1 is " + shipment1.weight);
  System.out.println("Shipping Cost: $" + shipment1.cost);
  System.out.println();

  vol = shipment2.volume();
  System.out.println("Volume of Shipment2 is " + vol);
  System.out.println("Weight of shipment2 is " + shipment2.weight);
  System.out.println("Shipping Cost: $" + shipment2.cost);
  System.out.println();

  }
}

// Start with Box

class Box {
  private double width;
  private double height;
  private double depth;

// Construct clone of an object
  Box(Box ob) {  // pass object to Constructor
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

// Constructor used when all dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

// Constructor used whrn no dimensions specified
  Box() {
    width = -1;
    height = -1;
    depth = -1;
  }

// Constructor used when cube is created
  Box(double len){
  width = height = depth = len;
}

// compute andreturn volume
  double volume() {
    return width * height * depth;
  }
}

// Add Weight
class BoxWeight extends Box {
  double weight;  // Weight of the box

  // Construct clone of an object.
  BoxWeight(BoxWeight ob) { // Pass an object to constructor
    super(ob);
    weight = ob.weight;
  }

//Constructor when all paraqmeters are specified
BoxWeight(double w, double h, double d, double m) {
  super(w, h, d);  // call superclass Constructor
  weight = m;
}

// Default cosntructor
BoxWeight(){
  super();
  weight = -1;
}

// Constructor when cube is created
BoxWeight(double len, double m) {
  super(len); // create cube
  weight = m;
}
}

// Add shipping costs
class Shipment extends BoxWeight {
  double cost;

  // construct clone of an object
  Shipment(Shipment ob) { // pass object to Constructor
  super(ob);
  cost = ob.cost;
  }

  // Constructor when all parameters are specified
  Shipment(double w, double h, double d, double m, double c) {
    super(w, h, d, m); // call superclass Constructor
    cost = c;
  }

  // default Constructor
  Shipment(){
    super();
    cost = -1;
  }

  // Constructor used when cube is created
  Shipment(double len, double m, double c){
    super(len, m);
    cost = c;
  }
}
