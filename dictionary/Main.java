/**
 * This program may be used to test the Dictionary.
 * 
 * @author Prof. White
 * @version Spring 2021
 */
public class Main
{
    public static void main(String args[])
    {
        Dictionary dict = new Dictionary();

        Word word = new Word("yummy", PartOfSpeech.ADJECTIVE, 
                "highly attractive or pleasing:  especially delicious, delectable");
        dict.addWord(word);

        word = new Word("banana", PartOfSpeech.NOUN, 
            "an elongated usually tapering tropical fruit with soft pulpy flesh enclosed in " +
            "a soft usually yellow rind");
        word.addDefinition("botany :  any of several widely cultivated perennial herbs " +
            "(genus Musa of the family Musaceae, the banana family) bearing bananas in compact " + 
            "pendent bunches");
        dict.addWord(word);

        word = new Word("apple", PartOfSpeech.NOUN, "the fleshy, usually rounded red, yellow, or " +
            "green edible pome fruit of a usually cultivated tree (genus Malus) of the rose family");
        word.addDefinition("a fruit (such as a star apple) or other vegetative growth " +
            "(such as an oak apple) suggestive of an apple");
        dict.addWord(word);

        word = new Word("eat", PartOfSpeech.VERB, "to take in through the mouth as food :  " +
            "ingest, chew, and swallow in turn");
        word.addDefinition("to destroy, consume, or waste by or as if by eating : gadgets that " +
            "eat up too much space");
        word.addDefinition("to bear the expense of : the team was forced to eat the rest of his " +
            "contract");
        word.addDefinition("to consume gradually : cars eaten away by rust");
        word.addDefinition("to consume with vexation : what's eating you now");

        System.out.println(word); //word.toString()
        dict.addWord(word);

        //print the list of words in the dictionary
        System.out.println("Words in the dictionary are:" );
        for(String w : dict.getWordList())
        {
            System.out.println(w);
        }
        System.out.println();

        System.out.println("The definitions for apple:");
        System.out.println(dict.getDefinitions("apple"));
        System.out.println();

        //pear was not added to the dictionary
        System.out.println("The definitions for pear:");
        System.out.println(dict.getDefinitions("pear"));
        System.out.println();

        //print the dictionary
        System.out.println(dict);
        System.out.println();

        //remove the 5th definition from eat
        String removed = dict.removeDefinition("eat", 5);
        System.out.println("Removed the 5th definition from eat.");
        System.out.println("The definition removed:");
        System.out.println(removed);
        System.out.println();
        System.out.println("The definitions for eat:");
        System.out.println(dict.getDefinitions("eat"));
        System.out.println();

        //attempt to remove the 5th definition from eat again
        System.out.println("Attempting to remove the 5th definition from eat again.");
        System.out.println(dict.removeDefinition("eat", 5));
        System.out.println();

        //remove apple from the dictionary
        removed = dict.removeWord("apple");
        System.out.println("Removed apple from the dictionary.");
        System.out.println("The word removed from the dictionary:");
        System.out.println(removed);
        System.out.println();

        //attempt to remove apple from the dictionary again
        System.out.println("Attempting to remove apple from the dictionary again.");
        System.out.println(dict.removeWord("apple"));
        System.out.println();

        //attempt to remove the only definition from the word yummy
        System.out.println("Attempting to remove the only definition for the word yummy.");
        System.out.println(dict.removeDefinition("yummy", 1));
        System.out.println();

        //print the dictionary
        System.out.println(dict);
        System.out.println();
    }
}
