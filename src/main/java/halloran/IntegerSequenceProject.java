package halloran;

public class IntegerSequenceProject{
  public static void main(String[] args){
    if(args.length!=1){
      System.err.println("Error must have exactly 1 integer argument");
      System.exit(1);
    }
    
    int n = 0;
    try{
       n = Integer.parseInt(args[0]);     
    }
    catch(Exception e){
      System.out.println("Input must be an integer");
    }
    
    System.out.println("Tri("+n+") = "+triangleSequence(n));
    System.out.println("Lazy("+n+") = "+lazyNumber(n));
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