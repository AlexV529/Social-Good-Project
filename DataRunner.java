import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
//instatiates a new UserStory object with parameters
    UserStory a = new UserStory("Genre.txt", "Band.txt", "Guitar.txt");
//prints out information with toString method
System.out.println(a);
    //prompts the user to input a guitar to see how many times it pops up
    String guitar = a.promptUser();
System.out.println(a.countOccurence(guitar));
    
    }
}