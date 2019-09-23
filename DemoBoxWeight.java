// This program uses  inheritance to extend Box


class DemoBoxWeight{
  public static void main(String[] args) {
    BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
    double vol;

    vol = myBox1.volume();
    System.out.println("Volume of myBox1 is: " + vol);
    System.out.println("Weight of myBox1 is: " + myBox1.weight);
    System.out.println();

    vol = myBox2.volume();
    System.out.println("Volume of myBox2 is: " + vol);
    System.out.println("Weight of myBox2 is: " + myBox2.weight);
    System.out.println();
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
class BoxWeight extends Box {
double weight;

//constructor for BoxWeight
BoxWeight(double w, double h, double d, double m){
  width = w;
  height = h;
  depth = d;
  weight = m;
}
}

// Here, Box is extended to include color.
class ColorBox extends Box{
  int color; // color of the box

  ColorBox(double w, double h, double d, int c){
    width = w;
    height = h;
    depth = d;
    color = c;
  }
}
