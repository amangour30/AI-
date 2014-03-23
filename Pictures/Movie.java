import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class Movie {
  //constructor method
  String movieFilename;
  
  Movie(String path) {
    //~ this picks the last element of the path
    int index = path.lastIndexOf("/");
    movieFilename = path.substring(index + 1); 
  }
  
  
  public String getMovieName()
  {
      return movieFilename;
  }
  
  public static String getMovieTitle()
  {
    String s = readTextFile("text.txt");
    List<String> myList = new ArrayList<String>(Arrays.asList(s.split("\n")));
    System.out.println("list array" + myList);
    return "aman";
  }
  
  public static String readTextFile(String fileName) {
  
  String returnValue = "";
  FileReader file = null;
  
  try {
    file = new FileReader(fileName);
    BufferedReader reader = new BufferedReader(file);
    String line = "";
    while ((line = reader.readLine()) != null) {
      returnValue += line + "\n";
    }
  } catch (Exception e) {
      throw new RuntimeException(e);
  } finally {
    if (file != null) {
      try {
        file.close();
      } catch (IOException e) {
        // Ignore issues during closing 
      }
    }
  }
  return returnValue;
} 
  
  public static void main(String args[]) {
      
    Movie obj = new Movie(args[0]); //creating object
    System.out.println(obj.getMovieName()); //print the movie file name
    
    //~ File file = new File("text.txt");
    //~ list = file.readLines();
    //~ BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
    //~ String line = null;
    //~ while((line = reader.readLine()) != null)
    //~ {
        //~ System.out.println(line);
    //~ }
    //~ String s = readTextFile("text.txt");
        //~ System.out.println(s);
        getMovieTitle();
        
    //~ FileReader fileReader = new FileReader(movieFilename);
    //~ BufferedReader bufferedReader = new BufferedReader(fileReader);
//~ 
    //~ while((line = bufferedReader.readLine()) != null) {
        //~ System.out.println(line);
    //~ }   
    //~ bufferedReader.close();
  }
  
  
  

}
