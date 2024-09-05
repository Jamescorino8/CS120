import java.util.Scanner;

/**
 * Project 2 - Blink
 * @author JAMES CORINO
 *
 */
 class Main {
    /**
     *  Use this method for testing until you get the other 10 methods
     *  working correctly.  Then replace the test code with code that 
     *  plays the game.
     */
    public static void main(String[] args) {
      
      //TestBlink.testGetNumberName();
      //TestBlink.testGetColorName();
      //TestBlink.testGetShapeName();
      //TestBlink.testGetCardName();
      //TestBlink.testIsMatch();
      //TestBlink.testGetMatches();
      //TestBlink.testGetMatchDescription();
      //TestBlink.testGetIndividualPoints();
      //printPlayersCardsMatches(1,"3REMO 2YELB 1BLMO", "1YEMO 3BLST");
      printHandResults("3REMO 2YELB 1BLMO", "1YEMO 3BLST 4REMO", "3REMO 3BLST");
    }

    /**
     * This function returns the name of the input number for numbers in [1, 5].  
     * E.g., if 1 is input, One is returned.
     * 
     * @param num An integer in [1, 5].
     * @return The name of the number.
     */
    public static String getNumberName(int num)
    {
      String nameNum;

        if (num == 1) {
          nameNum = "One";
        }
        else if (num == 2) {
          nameNum = "Two";
        }
        else if (num == 3) {
          nameNum = "Three";
        }
        else if (num == 4) {
          nameNum = "Four";
        }
        else if (num == 5) {
          nameNum = "Five";
        }
        else {
          nameNum = num + " is not a valid number";
        }
          return nameNum;
    }

    /**
     * This function returns the name of the input color.  Colors include 
     * Yellow (YE), Red (RE), Green (GR), Blue (BL), Brown (BR), and Grey (GY).
     * E.g., if BR is input, Brown is output.
     * 
     * @param color The short form of the color.
     * @return The name of the color.
     */
    public static String getColorName(String color)
    {
        String nameColor;

          if (color.equals("RE")) {
            nameColor = "Red";
          }
          else if (color.equals("YE")) {
            nameColor = "Yellow";
          }
          else if (color.equals("GR")) {
            nameColor = "Green";
          }
          else if (color.equals("BL")) {
            nameColor = "Blue";
          }
          else if (color.equals("BR")) {
            nameColor = "Brown";
          }
          else if (color.equals("GY")) {
            nameColor = "Grey";
          }
          else {
            nameColor = color + " is not a valid color";
          }
            return nameColor;
    }
    
    /** 
     * This function returns the name of the input shape.  Shapes include 
     * Moon (MO), Sun (SU), Star (ST), Snowflake (SN), Lightning Bolt (LB), 
     * and Raindrop (RA).
     * E.g., if MO is input, Moon is output.
     * 
     * @param shape  The short form of the shape.
     * @return The name of the shape.
     */
    public static String getShapeName(String shape)
    {
      String nameShape;

        if (shape.equals("MO")) {
          nameShape = "Moon";
        }
        else if (shape.equals("SU")) {
          nameShape = "Sun";
        }
        else if (shape.equals("ST")) {
          nameShape = "Star";
        }
        else if (shape.equals("SN")) {
          nameShape = "Snowflake";
        }
        else if (shape.equals("LB")) {
          nameShape = "Lightning Bolt";
        }
        else if (shape.equals("RA")) {
          nameShape = "Raindrop";
        }
        else {
          nameShape = shape + " is not a valid shape";
        }
          return nameShape;
    }
    
    /**
     * This function returns the name of the card in long form.  E.g., 
     * if the input card is 3REMO, this function would return Three Red Moons.  
     * If the input card is 1BLSU, this function would return One Blue Sun.
     * 
     * @param shortName The short name of the card.
     * @return The long form name of the card using the correct plural noun.
     */
    public static String getCardName(String shortName)
    {
      int num;
      String color;
      String shape;
      String longName;
      
      num = Integer.parseInt(shortName.substring(0, 1));
      color = shortName.substring(1, 3);
      shape = shortName.substring(3, 5);
      
      
      
      longName = getNumberName(num) + " " + getColorName(color) + " " + getShapeName(shape);
          
        return longName;
    }

    /**
     * This function returns true if the input cards match in at least 
     * one way (number, color, or shape), and false otherwise.
     * E.g., if the first card is 3REMO and the second card is 3BLSU, 
     * this function returns true because both cards have the number 3.
     * 
     * @param card1 The first card.  
     * @param card2 The second card.  
     * @return True if the cards match and false otherwise.
     */
    public static boolean isMatch(String card1, String card2)
    {
      int num1;
      String color1;
      String shape1;
      
      int num2;
      String color2;
      String shape2;

      boolean notMatch;

      num1 = Integer.parseInt(card1.substring(0, 1));
      color1 = card1.substring(1, 3);
      shape1 = card1.substring(3, 5);

      num2 = Integer.parseInt(card2.substring(0, 1));
      color2 = card2.substring(1, 3);
      shape2 = card2.substring(3, 5);
      
      if (color1.equals(color2) || shape1.equals(shape2) || num1 == num2) {
        notMatch = true;
      }
      else {
        notMatch = false;
      }
        return notMatch;
    }

    /**
     * This function returns a desription of how the two input cards match.
     * Commas seperates matches.  If the cards do not match, the empty 
     * string is returned.
     * 
     * @param card1 The first card.  E.g., 3REMO
     * @param card2 The second card.  E.g., 3BLMO
     * @return A description of how the two input cards match.  E.g., for this example, Number, Shape
     */

    public static String getMatches(String card1, String card2)
    {
      int num1;
      String color1;
      String shape1;
      
      int num2;
      String color2;
      String shape2;

      String matched = "";

      num1 = Integer.parseInt(card1.substring(0, 1));
      color1 = card1.substring(1, 3);
      shape1 = card1.substring(3, 5);

      num2 = Integer.parseInt(card2.substring(0, 1));
      color2 = card2.substring(1, 3);
      shape2 = card2.substring(3, 5);

      if (isMatch(card1, card2) == true) {
        if (num1 == num2) {
          matched = "Number";
            if (color1.equals(color2)) {
              matched += ", Color";
                if (shape1.equals(shape2)) {
                  matched += ", Shape";
                }
                else {
                  matched += "";
                }
            }
            else {
              if (shape1.equals(shape2)) {
                matched += ", Shape";
              }
              else {
                matched += "";
              }
            }
        }
        else if (color1.equals(color2)) {
          matched = "Color";
            if (num1 == num2) {
              matched += ", Number";
                if (shape1.equals(shape2)) {
                  matched += ", Shape";
                }
                else {
                  matched += "";
                }
            }
            else {
              if (shape1.equals(shape2)) {
                matched += ", Shape";
              }
              else {
                matched += "";
              }
            }
        }
        else {
          matched = "Shape";
            if (num1 == num2) {
              matched += ", Number";
                if (color1.equals(color2)) {
                  matched += ", Color";
                }
                else {
                  matched += "";
                }
            }
            else {
              if (color1.equals(color2)) {
                matched += ", Color";
              }
              else {
                matched += "";
              }
            }
        }
      }
      else {
        matched = "";
      }
        return matched;

    }

    /**
     * This function returns a string describing how the first card matches 
     * the second card.  E.g.,
     * 
     * Three Red Moons matches One Yellow Moon on Shape
     * 
     * If the cards do not match, an appropriate string is returned.  E.g.,
     * 
     * Two Yellow Lightning Bolts does not match Three Blue Stars
     * 
     * @param firstCard  The first card to match. 
     * @param secondCard The second card to match.  
     * @return A string describing how the strings match.
     */
    public static String getMatchDescription(String firstCard, String matchToCard)
    {
      String nameCard;
  
      if (isMatch(firstCard, matchToCard) == true) {
        nameCard = getCardName(firstCard) + "s matches " + getCardName(matchToCard) + "s on " + getMatches(firstCard, matchToCard);
      }
      else  {
        nameCard  = getCardName(firstCard) + "s does not match " + getCardName(matchToCard);
      }
        return nameCard;
    }

    /**
     * This function determines the number of ways the cards match.  Each 
     * way they match is one point.  Cards can match on number, color, or shape.
     * E.g., if the first card is 3REMO and the second card is 3BLSU, this 
     * function would return 1 because the cards only match on number.
     * 
     * @param card1 The first card.
     * @param card2 The second card.
     * @return The number of ways the cards match. 
     */
    public static int getIndividualPoints(String card1, String card2)
    {
      int numMatches;
      int num1;
      int num2;
      String color1;
      String color2;
      String shape1;
      String shape2;

      num1 = Integer.parseInt(card1.substring(0, 1));
      color1 = card1.substring(1, 3);
      shape1 = card1.substring(3, 5);

      num2 = Integer.parseInt(card2.substring(0, 1));
      color2 = card2.substring(1, 3);
      shape2 = card2.substring(3, 5);

      if (card1.equals(card2)) {
        numMatches = 3;
      }
      else if (num1 == num2) {
        if (color1.equals(color2)) {
          numMatches = 2;
        }
        else if (shape1.equals(shape2)) {
          numMatches = 2;
        }
        else {
          numMatches = 1;
        }
      }
      else if (color1.equals(color2)) {
        if (shape1.equals(shape2)) {
          numMatches = 2;
        }
        else {
          numMatches = 1;
        }
      }
      else if (shape1.equals(shape2)){
        numMatches = 1;
      }
      else {
        numMatches = 0;
      }
        return numMatches;
    }

    /**
     * This function prints the player's hand, the cards on the table, and 
     * how the player's cards match the cards on the table.  E.g., if the 
     * input cards to match are 1YEMO 3BLST and the input player one's hand 
     * is 3REMO 2YELB 1BLMO, then this function would print
     * 
     * Player One's Hand:
     * Three Red Moons matches One Yellow Moon on Shape
     * Three Red Moons matches Three Blue Stars on Number
     * Two Yellow Lightning Bolts matches One Yellow Moon on Color
     * Two Yellow Lightning Bolts does not match Three Blue Stars
     * One Blue Moon matches One Yellow Moon on Number, Shape
     * One Blue Moon matches Three Blue Stars on Color
     * 
     * @param playerNumber The player's number.
     * @param playersCards The player's cards.
     * @param cardsToMatch The cards to match.
     */
    public static void printPlayersCardsMatches(int playerNumber, String playersCards, String cardsToMatch)
    {
      
      System.out.println("Player " + playerNumber + "'s Hand:  ");

      String card1 = playersCards.substring(0, 5);
      String card2 = playersCards.substring(6, 11);
      String card3 = playersCards.substring(12, 17);

      String cardMatch1 = playersCards.substring(0, 5);
      String cardMatch2 = playersCards.substring(6, 11);

      System.out.println(getMatchDescription(card1, cardMatch1));
      System.out.println(getMatchDescription(card1, cardMatch2));
      System.out.println(getMatchDescription(card2, cardMatch1));
      System.out.println(getMatchDescription(card2, cardMatch2));
      System.out.println(getMatchDescription(card3, cardMatch1));
      System.out.println(getMatchDescription(card3, cardMatch2));
    }

    /**
     * This function prints the results of a single hand.  A hand is first 
     * won on cards.  If a single card of one player matches both of the 
     * cards on the table, that card is counted only as one match.  The player 
     * with the most matching cards wins.  If there is a tie on cards, then a 
     * hand is won on points.  One point is awarded for each way a player's 
     * card matches either or both cards on the table.  If there is still a tie, 
     * then the hand ends in a tie.  
     * 
     * @param player1 The first player's hand.  
     * @param player2 The second player's hand.  
     * @param cardsToMatch The cards each player is trying to match. 
     */
    public static void printHandResults(String player1, String player2, String cardsToMatch)
    {
      int p1Match;
      int p2Match;
      int p1Point = 0;
      int p2Point = 0;

      String p1Card1 = player1.substring(0, 5);
      String p1Card2 = player1.substring(6, 11);
      String p1Card3 = player1.substring(12, 17);
      
      String p2Card1 = player2.substring(0, 5);
      String p2Card2 = player2.substring(6, 11);
      String p2Card3 = player2.substring(12, 17);

      String cardMatch1 = cardsToMatch.substring(0, 5);
      String cardMatch2 = cardsToMatch.substring(6, 11);

      p1Match = getIndividualPoints(p1Card1, cardMatch1) + getIndividualPoints(p1Card1, cardMatch2) + getIndividualPoints(p1Card2, cardMatch1) + getIndividualPoints(p1Card2, cardMatch2) + getIndividualPoints(p1Card3, cardMatch1) + getIndividualPoints(p1Card3, cardMatch2);
      
      p2Match = getIndividualPoints(p2Card1, cardMatch1) + getIndividualPoints(p2Card1, cardMatch2) + getIndividualPoints(p2Card2, cardMatch1) + getIndividualPoints(p2Card2, cardMatch2) + getIndividualPoints(p2Card3, cardMatch1) + getIndividualPoints(p2Card3, cardMatch2);

      if ((isMatch(p1Card1, cardMatch1) == true) || (isMatch(p1Card1, cardMatch2) == true ) || (isMatch(p1Card2, cardMatch1) == true) || (isMatch(p1Card2, cardMatch2) == true ) || (isMatch(p1Card3, cardMatch1) == true ) || (isMatch(p1Card3, cardMatch2) == true )) {
        p1Point++;
      }
      else if ((isMatch(p2Card1, cardMatch1) == true) || (isMatch(p2Card1, cardMatch2) == true ) || (isMatch(p2Card2, cardMatch1) == true) || (isMatch(p2Card2, cardMatch2) == true ) || (isMatch(p2Card3, cardMatch1) == true ) || (isMatch(p2Card3, cardMatch2) == true )) {
        p2Point++;
      }
      else {
        System.out.println("Not Valid");
      }

        if (p1Match == p2Match) {
          if (p1Point == p2Point) {
            System.out.println("Tie");
          }
          else if (p1Point > p2Point) {
            System.out.println("Player One Wins");
          }
          if (p1Point < p2Point) {
            System.out.println("Player Two Wins");
          }
        }
        else if (p1Match > p2Match) {
          System.out.println("Player One Wins");
        }
        else if (p1Match < p2Match) {
          System.out.println("Player Two Wins");
        }
        else {
          System.out.println("Not Valid");
        }
 





}
}