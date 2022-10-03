import java.util.* ;

class LargestEmployee{

  public static void main(String args[]){
    String a[] = new String[] { "E", "B", "C", "D" , "A"};
    Arrays.asList(a).stream()
    .sorted(Comparator.reverseOrder())
    .limit(2)
    .skip(1)
    .forEach(System.out :: println) ;
  }
}
