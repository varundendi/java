class Box{
  double width;
  double height;
  double depth;
  Box(){
    System.out.println("Constructing box");
    width=20;
    height=15;
    depth = 12;
  }

  double volume () {
    return width* depth * height ;
  }
  
}
class Constructor{
  public static void main(String[] args){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;
    //vol = mybox1.volume();
    System.out.println("volume is "+ mybox1.volume());
   // vol = mybox2.volume();
    System.out.println("volume is "+ mybox2.volume());
 }
}