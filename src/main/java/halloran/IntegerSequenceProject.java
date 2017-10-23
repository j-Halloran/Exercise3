package halloran;

public class IntegerSequenceProject{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println("Tri(n) = "+triangleSequence(n));
    System.out.println("LC(n) = "+lazyNumber(n));
  }
  public static int triangleSequence(int n){
/*    int temp = 0;
    for(int i=n;i>0;i--){
      temp+=n;
    }*/
    return (n*(n+1))/2;
  }
  public static int lazyNumber(int n){
    return ((int)(Math.pow(n,2)+n+2)/2);
  }

}