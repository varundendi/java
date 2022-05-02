class Box{
  double width;
  double height;
  double depth;

  double volume () {
    return width* depth * height ;
  }
  
}
class Methodreturn{
  public static void main(String[] args){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;
    mybox1.width=20;
    mybox1.height=15;
    mybox1.depth = 12;

    mybox2.width=200;
    mybox2.height=150;
    mybox2.depth = 120;
    //vol = mybox1.volume();
    System.out.println("volume is "+ mybox1.volume());
   // vol = mybox2.volume();
    System.out.print("volume is "+ mybox2.volume());
 }
}