import java.util.Scanner;

public class UserStory {

private DataEntry[] data;
  
// no-argument constructor to read text files into arrays
  public UserStory() {
    this.data = createData("Genre.txt", "Band.txt", "Guitar.txt");
  }

  // paramaterized constructor to read text files into arrays
  public UserStory(String GenreFile, String BandFile, String GuitarFile) {
    this.data = createData(GenreFile, BandFile, GuitarFile);
  }

  /*
  counts the number of times a guitar pops up
  returns the count
  */
  public int countOccurence(String guitar) {
    int count = 0;
    for (DataEntry a : data) {
      if (a.getGuitar().equalsIgnoreCase(guitar)) {
        count++;
      }
    }
    return count;
  }

  /*
  prompts user to input a guitar
  returns the input
  */
  public String promptUser() {
    String result = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Guitar: ");
    return scanner.nextLine();
  }

  /*
  creates arrays using the text files
  returns the DataEntry array
  */
public DataEntry[] createData(String GenreFile, String BandFile, String GuitarFile) {
  String[] genre = FileReader.toStringArray(GenreFile);
  String[] band = FileReader.toStringArray(BandFile);
  String[] guitar = FileReader.toStringArray(GuitarFile);
  DataEntry[] dataArray = new DataEntry[genre.length];
  for (int i = 0; i < genre.length; i++){
    dataArray[i] = new DataEntry(genre[i], band[i], guitar[i]);
  }
  return dataArray;
    }

  //returns the total amount of genres, bands, and guitars, as a string
  public String toString(){
    String result = "----Genres and Guitars---- \n";
    result += "Total Genres: " + data.length + "\n";
    result += "Total Guitars: " + data.length + "\n";
    result += "Total Bands: " + data.length + "\n";
    for (DataEntry d : data) {
      result += d.toString();
    }
    return result;
     }
}