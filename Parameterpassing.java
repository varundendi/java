class Box{
  double width;
  double height;
  double depth;

  double volume () {
    return width * height * depth ;
  }
  void setDim(double w, double h, double d){
    width =w;
    height= h;
    depth =d;
  }
  
}
class Parameterpassing{
  public static void main(String[] args){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    mybox1.setDim(10,20,30);
    mybox2.setDim(2,3,5);
    //vol = mybox1.volume();
    System.out.println("volume is "+ mybox1.volume());
   // vol = mybox2.volume();
    System.out.println("volume is "+ mybox2.volume());
 }
}