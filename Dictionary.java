import java.util.ArrayList;



/**
 * This class represents a dictionary.
 * 
 * @author Prof. White
 * @version Spring 2021
 */
public class Dictionary {
  private ArrayList<Word> words;
  private ArrayList<String> wordList;
  /**
   * Constructs a new dictionary with no entries.
   */
  public Dictionary() {
    words = new ArrayList<Word>();
  }

  /**
   * Adds a word to the dictionary, maintaining alphabetical order.
   * 
   * Note: This method implementation does not prevent the same word from being
   * added to the dictionary twice!
   */
  public void addWord(Word newWord) {
    int index = 0;

    while(index < words.size() && words.get(index).getWord().compareTo(newWord.getWord()) < 0){
      index++;
    }

    words.add(index, newWord);
  }

  /**
   * Returns a list of words that are found in the dictionary.
   * 
   * @return A list of words that are found in the dictionary.
   */
  public ArrayList<String> getWordList() {
    wordList = new ArrayList<String>();
    
    //for(class: array list)
    for(Word i: words){
      wordList.add(i.getWord());
    }
    return wordList;
  }

  /**
   * Returns a string containing the numbered definitions for the input word. If
   * the word cannot be found in the dictionary, returns an error message.
   * 
   * @param myWord The word whose definitions should be returned.
   * @return A string containing the numbered definitions for the input word or an
   *         error message if the word cannot be found in the dictionary.
   */
  public String getDefinitions(String myWord) {
    String myWordDef = " ";
    
    if (wordList.contains(myWord) != true) {
      myWordDef = "ERROR: This word cannot be found in the dictionary";
    }
    else {     
      for(Word i : words) {
        myWordDef = i.getDefinitions();
      }
    }
    return myWordDef;
  }
    


  /**
   * Removes and returns the input word entry from the dictionary as a formatted
   * string. If the input word cannot be found in the dictionary, returns an error
   * message.
   * 
   * @param myWord The word to be removed from the dictionary.
   * @return A formatted string representing the word entry in the dictionary or
   *         an error message if the word cannot be found in the dictionary.
   */
  public String removeWord(String myWord) {
    String wordEntry = " ";
    int i = 0;
    
    if (wordList.contains(myWord) != true) {
      wordEntry = "ERROR: This word cannot be found in the dictionary";
    }
    else {
       while (myWord != wordEntry) {
         wordEntry = wordList.get(i);
         i++;
       }
        words.remove(i); 
    }
    return myWord;
  }

  /**
   * Removed the specified numbered definition of the input word and returns the
   * removed definition. If word cannot be found in the dictionary or the word has
   * only one definition, an error message is returned.
   * 
   * Note: If the word exists in the dictionary, but the definition does not exist
   * or it is the only definition for the word, then the Word class will return an
   * error message, which this method will return to its caller.
   * 
   * @param myWord    The word whose definition should be removed.
   * @param defNumber The number of the definition to be removed.
   * @return The definition that was removed or an error message.
   */
  public String removeDefinition(String myWord, int defNumber) {
    String defRemove = " ";
    
    if (wordList.contains(myWord) != true) {
      defRemove = "ERROR: This word cannot be found in the dictionary";
    }
    else {
      for(Word i: words) {
        if(i.getWord().equals(myWord)){
          defRemove =  i.removeDefinition(defNumber);
          i.removeDefinition(defNumber);
        }
      }
    }
    return defRemove;
  }

  /**
   * Returns a string representation of the entire dictionary.
   * 
   * @return A string representation of the entire dictionary.
   */
  public String toString() {
    return words.toString();
  }

  /**
   * Returns the index of the input word in the dictionary or -1 if the word does
   * not exist in the dictionary.
   * 
   * @param myWord The word whose index should be returned.
   * @return The index of the word in the dictionary or -1 if the word does not
   *         exist in the dictionary.
   */
  private int getIndexOfWord(String myWord) {
    return words.indexOf(myWord);
  }
}
