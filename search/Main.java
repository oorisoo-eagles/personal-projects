import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * A simplified search engine that takes in keywords from standard input and finds the 
 * corresponding url(s). The search results are then printed to the console.
 */

public final class Main {
    private static ArrayList<String> urls = new ArrayList();
    private static ArrayList<String> keywords = new ArrayList();
    private static ArrayList<String> values = new ArrayList();
    private static HashMap<String,ArrayList<String>> h= new HashMap();
 
 /**
  * Main method for search 
  */
  public static void main(String[] args) {
    //TODO
    System.out.println("Welcome to the Juni Search Engine!");
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a file name:");
    String input = s.next();
    System.out.println("loading...");
    // System.out.println("Search:");
    // String keyword = s.next();
    try{
      File f = new File(input);
      Scanner t = new Scanner(f);
      returnList(t, keywords, urls);
      System.out.println("keywords len :" + keywords.size());
      System.out.println("urls len :" + urls.size());
     // h = createMap(keywords, urls);
      System.out.println("h len :" + createMap(keywords, urls));
    }
    catch(FileNotFoundException e) {
      System.out.println("File was not found");
      return;
    }
    
/**
 * Method takes a scanner and arrange it into arraylist of urls
 */ 
public static void returnList(Scanner r, 
  ArrayList<String> keywords, ArrayList<String> urls) {
   while(r.hasNextLine()){
      String line = r.nextLine();
      if(line.contains(" ")){
        keywords.add(line);
      }
      else{
        urls.add(line);
      }
    }
}

/**
 * Create hash hamp of keywords and urls. 
 */
public static int createMap(ArrayList<String> keywords, ArrayList<String> urls) {
    HashMap<String,ArrayList<String>> h = new HashMap();
    for(int i = 0; i<keywords.size(); i++){
      String keywordLine = keywords.get(i);
      System.out.println(i);
      System.out.println(keywordLine);
      String[] keywordArray = keywordLine.split(" ");
      for(int j=0; j<keywordArray.length; j++){
        System.out.println("word" + i + keywordArray[j]);
      }
      for (String key: keywordArray) {
        if(h.has(key)) {
          ArrayList<String> vString = h.get(key);
          System.out.println("getting key " + key);
          System.out.println("putting url " + urls.get(i));
          vString.add(urls.get(i));
          h.put(key,vString);
        } 
        else {
          ArrayList<String> vS = new ArrayList();
          vS.add(urls.get(i));
          System.out.println("inserting key " + key);
          System.out.println("inserting url " + urls.get(i));
          h.insert(key,vS);
        }
      }
    }
    return h.size(); 
  }
}
