
class RefDemo{
  public static void main(String[] args) {
    BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
    Box plainbox = new Box();
    double vol;

    vol = weightBox.volume();
    System.out.println("Volume of weightbox is " + vol);
    System.out.println("Weight of weightbox is " + weightBox.weight);
    System.out.println();

    // assign BoxWeight reference to Box reference
    plainbox = weightBox;

    vol = plainbox.volume();  // This is OK, volume() is defined in Box
    System.out.println("Volume of plainbox is " + vol);

    /* The following statement is invalid because plainbox
      does not define a weight member. */

      // System.out.println("Weight of plainbox is " + plainbox.weight);

  }

}

class Box {
  double width;
  double height;
  double depth;

  // construct clone of an object
  Box(Box ob){ // pass aobject to constructor
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // constructor used when all dimensions specified
  Box (double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }

  //constructor used when no dimensions specified
  Box(){
    width = -1;  // use -1 to indicate
    height = -1; // uninitialized
    depth = -1;  // Box
  }

  //constructor when a cube is created
  Box (double len){
    width = height = depth = len;
  }

  // compute and return volume
  double volume(){
    return width * height * depth;
  }
}

// Here, Box is extended to include weight
// BoxWeight now uses super to initialize its Box attributes.
class BoxWeight extends Box {
double weight; // weight of box

//constructor for BoxWeight
//Old Code
/* BoxWeight(double w, double h, double d, double m){
  width = w;
  height = h;
  depth = d;
  */

  //New Code
  //initialize width, height and depth using super()
  BoxWeight(double w, double h, double d, double m){
    super(w, h, d); // call superclass constructor
    weight = m;
}
}
