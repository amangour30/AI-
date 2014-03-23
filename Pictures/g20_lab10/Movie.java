import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;
class Movie {
  //constructor method
  static String movieFilename;
  
  Movie(String path) {
    //~ this picks the last element of the path
    int index = path.lastIndexOf("/");
    movieFilename = path.substring(index + 1); 
  }
  
  public static void printMovieTitle()
  {
      System.out.println(getMovieTitle());
  }
  
  public static void printMovieAuthor()
  {
      
  }
  
  public String getMovieName()
  {
      return movieFilename;
  }
  
  static String getMovieTitle()
  {
    String s = readTextFile(movieFilename);
    List<String> myList = new ArrayList<String>(Arrays.asList(s.split("\n")));
    
    for (int i=0; i< myList.size(); i++)
    {
        String line = myList.get(i);
        String pattern = "\\s*([\\w ]+)\n";
        //~ String pattern = '\s*([\\w ]+)\\n';

      // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find()){
         System.out.println("Found value in 0: " + m.group(0) );
         //~ System.out.println("Found value: " + m.group(1) );
         break;
         //~ System.out.println("Found value in this    : " + m.group(2) );
      } else {
         System.out.println("NO MATCH");
      }

        
    }
    //~ for(int i=0; i<)
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
