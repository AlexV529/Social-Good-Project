public class DataEntry {

  private String genre;             
  private String band;     
  private String guitar;

  // paramaterized constructor that initializes the variables
  public DataEntry(String genre, String band, String guitar) {
    this.genre = genre;
    this.band = band;
    this.guitar = guitar;
  }

   /*
  accessor method 
  returns the amount of genres in the Genre array
  */
  public String getGenre() {
    return genre;
  }

  /*
  accessor method that gets amount of bands
  returns the amount of bands in the band array
  */
  public String getBand() {
    return band;
  }

  /*
  accessor method 
  counts the amount of guitars in the Guitar array
  returns the amount
  */
  public String getGuitar(){
    return guitar;
  }

  /*
  used in the toString method for UserStory
  used to pair up genres, bands, and guitars in a string
  */
  public String toString() {
    return "Genre: " + genre + " - Band: " + band + " - Guitar: " + guitar + "\n";
 }
}