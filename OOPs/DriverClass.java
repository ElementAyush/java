class Singleton{
  private static Singleton singletonObject = null ;
  private Singleton(){};

  public static Singleton giveMeSingletonObject(){

    if(singletonObject == null){
      singletonObject = new Singleton() ;
      return singletonObject ;
    }
    return singletonObject ;
  }
}

class DriverClass{

  public static void main(String[] args){

    Singleton obj1 = Singleton.giveMeSingletonObject() ;
    Singleton obj2 = Singleton.giveMeSingletonObject() ;

    System.out.println(obj1.hashCode() + "   " + obj2.hashCode()) ;

  }
}
