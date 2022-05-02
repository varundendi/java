class Box{
  double width;
  double height;
  double depth;

  void volume () {
    System.out.print ("vol is a " + width*depth*height );
  }
  
}
class Boxdemo3{
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
    mybox1.volume();
    mybox2.volume();
    
 }
}