import lab7.Main;

public class TestBlink {

    static public void testGetCardName() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getCardName(shortName)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input   Expected                  Actual");
      System.out.println("        Output                    Output");
            
      System.out.printf( "1BLSU   One Blue Sun              %s\n", Main.getCardName("1BLSU"));
      System.out.printf( "3YESU   Three Yellow Suns         %s\n", Main.getCardName("3YESU"));
      System.out.printf( "2BLLB   Two Blue Lightning Bolts  %s\n", Main.getCardName("2BLLB"));
      System.out.printf( "5GRST   Five Green Stars          %s\n", Main.getCardName("5GRST"));    
    }

    static public void testGetNumberName() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getNumberName(num)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input   Expected                  Actual");
      System.out.println("        Output                    Output");
            
      System.out.printf(  "1       One                       %s\n", Main.getNumberName(1));
      System.out.printf(  "4       Four                      %s\n", Main.getNumberName(4));
      System.out.printf(  "5       Five                      %s\n", Main.getNumberName(5));
      
    }

    static public void testGetColorName() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getColorName(num)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input   Expected                  Actual");
      System.out.println("        Output                    Output");
            
      System.out.printf(  "BL      Blue                      %s\n", Main.getColorName("BL"));
      System.out.printf(  "GY      Gray                      %s\n", Main.getColorName("GY"));
      System.out.printf(  "GR      Green                     %s\n", Main.getColorName("GR"));
      
    }

    static public void testGetShapeName() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getShapeName(num)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input   Expected                  Actual");
      System.out.println("        Output                    Output");
            
      System.out.printf(  "SN      Snowflake                 %s\n", Main.getShapeName("SN"));
      System.out.printf(  "SU      Sun                       %s\n", Main.getShapeName("SU"));
      System.out.printf(  "RA      Raindrop                  %s\n", Main.getShapeName("RA"));
      
    }

    static public void testIsMatch() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing isMatch(card1,card2)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input            Expected           Actual");
      System.out.println("                 Output             Output");
            
      System.out.printf(  "3REMO 3BLSU      true                %b\n", Main.isMatch("3REMO", "3BLSU"));
      System.out.printf(  "3REMO 2BLSU      false               %b\n", Main.isMatch("3REMO", "2BLSU"));
      System.out.printf(  "5GRRA 2GRRA      true               %b\n", Main.isMatch("5GRRA", "2GRRA"));
      System.out.printf(  "5YELB 2GRLB      true               %b\n", Main.isMatch("5YELB", "2GRLB"));
      System.out.printf(  "5YELB 2GRMO      false              %b\n", Main.isMatch("5YELB", "2GRMO"));
    }

    static public void testGetMatches() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getMatches(card1,card2)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input            Expected           Actual");
      System.out.println("                 Output             Output");
            
      System.out.printf(  "3REMO 3BLMO      Number, Shape      %s\n", Main.getMatches("3REMO", "3BLMO"));
      System.out.printf(  "3REMO 2BLSU      \"\"                 \"%s\"\n", Main.getMatches("3REMO", "2BLSU"));
      System.out.printf(  "5GRRA 2GRRA      Color, Shape       %s\n", Main.getMatches("5GRRA", "2GRRA"));
      System.out.printf(  "5YELB 2GRLB      Shape              %s\n", Main.getMatches("5YELB", "2GRLB"));
      System.out.printf(  "5YELB 5YEMO      Number, Color      %s\n", Main.getMatches("5YELB", "5YEMO"));
    }

    static public void testGetMatchDescription() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing getMatchDescription(firstCard,matchToCard)");
      System.out.println("-----------------------------------------------------");
                  
      System.out.println(  "Input: 3REMO 3BLMO" );
      System.out.println(  "Expected Output: Three Red Moons matches Three Blue Moons on Number, Shape");
      System.out.println( "Actual Output:   " + Main.getMatchDescription("3REMO", "3BLMO"));
      
      System.out.println(  "Input: 3REMO 2BLSU" );
      System.out.println(  "Expected Output: Three Red Moons does not match Two Blue Suns");
      System.out.println( "Actual Output:   " + Main.getMatchDescription("3REMO", "2BLSU"));

      System.out.println(  "Input: 5GRRA 2GRRA" );
      System.out.println(  "Expected Output: Five Green Raindrops matches Two Green Raindrops on Color, Shape");
      System.out.println( "Actual Output:   " + Main.getMatchDescription("5GRRA", "2GRRA"));
      
      System.out.println(  "Input: 5YELB 2GRLB" );
      System.out.println(  "Expected Output: Five Yellow Lightning Bolts matches Two Green Lightning Bolts on Shape");
      System.out.println( "Actual Output:   " + Main.getMatchDescription("5YELB", "2GRLB"));
    
    }

    static public void testGetIndividualPoints() {
      System.out.println("-----------------------------------------------------");System.out.println("Testing GetIndividualPoints(card1,card2)");
      System.out.println("-----------------------------------------------------");
      System.out.println("Input            Expected           Actual");
      System.out.println("                 Output             Output");
            
      System.out.printf(  "3REMO 2BLMO      1                  %d\n", Main.getIndividualPoints("3REMO", "2BLMO"));
      System.out.printf(  "3REMO 2BLSU      0                  %d\n", Main.getIndividualPoints("3REMO", "2BLSU"));
      System.out.printf(  "5GRRA 2GRRA      2                  %d\n", Main.getIndividualPoints("5GRRA", "2GRRA"));
      System.out.printf(  "5GRLB 5GRLB      3                  %d\n", Main.getIndividualPoints("5GRLB", "5GRLB"));
      System.out.printf(  "5YELB 5YEMO      2                  %d\n", Main.getIndividualPoints("5YELB", "5YEMO"));
    
    }
}