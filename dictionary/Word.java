import java.util.ArrayList;

/**
 * This class represents one word in a dictionary.
 * 
 * @author Prof. White
 * @version Spring 2021
 */    
public class Word
{    
    private String word;
    private PartOfSpeech partOfSpeech;
    private ArrayList<String> definitions;

    /**
     * Construct a new word.
     * 
     * @param word The word.
     * @param pOfSp The part of speech for the word.  (E.g., noun, verb, etc.)
     * @param firstDefinition The first definition for the word.
     */
    public Word(String word1, PartOfSpeech pOfSp, String firstDefinition)
    {
      word = word1;
      partOfSpeech = pOfSp;
      definitions = new ArrayList<String>();
      definitions.add(firstDefinition);
    }

    /**
     * Returns the word.
     * 
     * @return The word.
     */
    public String getWord()
    {
        return word;
    }

    /**
     * Returns the definitions of the words numbered starting from 1.
     * 
     * @return The definitions of the words numbered starting from 1.
     */
    public String getDefinitions()
  {
        String defs = " ";
        
        for (int i = 0; i < definitions.size(); i++) {
          defs += ((i + 1) + ". " + definitions.get(i) + "\n");
        }
      return defs;
    }

    /**
     * Returns the word's part of speech.
     * 
     * @return The word's part of speech.
     */
    public PartOfSpeech getPartOfSpeech()
    {
        return partOfSpeech;
    }

    /**
     * Adds a definition for the word.  (In this implementation,
     * the same definition can be added more than once!)
     * 
     * @param definition The definition to be added to the word.
     */
    public void addDefinition(String definition)
    {
      definitions.add(definition);
    }

    /**
     * Removes and returns the specified definition.  Definitions are numbered
     * from one.  
     * -If no such definition exists, returns an error message.
     * -If this word has only one definition, it may not be removed; 
     *  returns an error message.
     * 
     * @param defNumber The number of the definition to be removed.
     * @return The definition that is removed or an error message if none
     * exists.
     */
    public String removeDefinition(int defNumber)
    {
        String strToReturn = "";

        if (definitions.size() > 1) {
          if (defNumber > -1 && defNumber <= definitions.size()) {
            strToReturn = definitions.remove(defNumber - 1);
          }
          else {
            strToReturn = "Error: There are only " + definitions.size() + " definitions for " + word + ".";
          }
        }
        else {
          strToReturn = "Error: You cannot remove the last definition of " + ".";
        }
        return strToReturn;
    }

    /**
     * Returns a formatted string with the word, its part of speech,
     * and its definitions numbered starting from 1.
     * 
     * @returns A formatted string with the word, its part of speech,
     * and its definitions numbered starting from 1.
     */
    public String toString()
    {
        return word + "(" + partOfSpeech + ")" + "\n" + getDefinitions();
    }
}
