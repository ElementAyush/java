class ThreadExample implements Runnable{

  public void run(){
      System.out.println("Hello World!!!!") ;
      throw new RuntimeException("This is in the thread") ;
  }
}

class SimpleThreadExample{
  public static void main(String[] args){
   Thread thread = new Thread(new ThreadExample(), "Thread-1") ;
   try{
      thread.start() ;
   }
   catch(Exception e){
     System.out.println("Hello") ;
   }
  }
}
