public class Main{
  public static void main (String[] args){
  
     Movie movie1 = new Movie();
     movie1.title = "Barbie in the Nutcracker";
     movie1.genre = "family Fantasy and Musical";
     movie1.duration =  77;
     
     movie1.displayInfo();
     
     Movie movie2 = new Movie();
     movie2.title = "Despicable Me 2";
    movie2.genre = "Sci-fi Comedy";
     movie2.duration =  95;
     
     movie2.displayInfo();
     
     Movie movie3= new Movie();
     movie3.title = "Barbie:Fairytopia";
     movie3.genre = "Fantasy and Adventure";
    movie3.duration =  70;
    
     movie3.displayInfo();

   }
 
}