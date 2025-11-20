import java.util.Scanner;

public class UserStory {

private String[] genre;
private String[] guitar;
private String[] band;

// no-argument constructor to read text files into arrays
  public UserStory() {
     this.genre = FileReader.toStringArray("Genre.txt");
  this.guitar = FileReader.toStringArray("Guitar.txt");
    this.band = FileReader.toStringArray("Band.txt");
  }
  // paramaterized constructor to read text files into arrays
public UserStory(String GenreFile, String GuitarFile, String BandFile) {
  this.genre = FileReader.toStringArray(GenreFile);
  this.guitar = FileReader.toStringArray(GuitarFile);
  this.band = FileReader.toStringArray(BandFile);
}
  

  /*
  accessor method 
  counts the amount of guitars in the Guitar array
  returns the amount
  */
  public int getGuitars(){
  return guitar.length;
}
  /*
  accessor method 
  returns the amount of genres in the Genre array
  */
  public int getGenres(){
    return genre.length;
  }
/*
  accessor method that gets amount of bands
  returns the amount of bands in the band array
  */
   public int getBands(){
  return band.length;
}
  
  /*
  returns a string of all the data
  shows all the guitars and genres in the list paired togethor
  */
public String toString(){
  String result = "----Genres and Guitars---- \n";
  result += "Total Genres: " + genre.length + "\n";
  result += "Total Guitars: " + guitar.length + "\n";
  result += "Total Bands: " + band.length + "\n";
  for (int i = 0; i < genre.length; i++) {
    result += "Genre: " + genre[i] + " - Bands: " + band[i] + " - Guitar: " + guitar[i];
    result += "\n";
  }
  return result;
}


  
}