class Box{
  double width;
  double height;
  double depth;
  Box(double w , double h , double d){
   // System.out.println("Constructing box");
    width=d;
    height=h;
    depth = d;
  }

  double volume () {
    return width* depth * height ;
  }
  
}
class Parameterizedconstructor{
  public static void main(String[] args){
    Box mybox1 = new Box(1,2,3);
    Box mybox2 = new Box(4,5,6);
    double vol;
    //vol = mybox1.volume();
    System.out.println("volume is "+ mybox1.volume());
   // vol = mybox2.volume();
    System.out.println("volume is "+ mybox2.volume());
 }
}