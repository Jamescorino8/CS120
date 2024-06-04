class Main {
  public static void main(String[] args) {
        testArrayUtilities();
  }

  public static void testArrayUtilities()
  {
        System.out.println("Testing clearInt():");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.print("   input:  " );
        ArrayUtilities.printArray(array1);
        System.out.print("  output:  " );
        ArrayUtilities.clear(array1);
        ArrayUtilities.printArray(array1);
        System.out.println("expected:  0 0 0 0 0" );
        System.out.println();

         System.out.println("Testing clearInt():");
         int[] array2 = {2, -1, 0, 3, 1, 4, 21, -6};
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array2);
         System.out.print("  output:  " );
         ArrayUtilities.clear(array2);
         ArrayUtilities.printArray(array2);
         System.out.println("expected:  0 0 0 0 0 0 0 0" );
         System.out.println();

        System.out.println("Testing getIntArray(7):");
        System.out.print("  output:  " );
        ArrayUtilities.printArray(ArrayUtilities.getIntArray(7));
         System.out.println("expected:  0 0 0 0 0 0 0" );
         System.out.println();

         System.out.println("Testing getIntArray(10):");
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getIntArray(10));
         System.out.println("expected:  0 0 0 0 0 0 0 0 0 0" );
         System.out.println();

         System.out.println("Testing getMaxInt():");
         System.out.print("   input:  " );
         int[] array3 = {1, 6, -3, 0 , 4};
         ArrayUtilities.printArray(array3);
         System.out.print("  output:  " );
         System.out.println(ArrayUtilities.getMaxInt(array3));
         System.out.println("expected:  6" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array3);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getMaxInt():");
         System.out.print("   input:  " );
         int[] array4 = {-4, -8, -1, -33};
         ArrayUtilities.printArray(array4);
         System.out.print("  output:  " );
         System.out.println(ArrayUtilities.getMaxInt(array4));
         System.out.println("expected:  -1" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array4);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getMaxInt():");
         System.out.print("   input:  " );
         int[] array5 = {8, 145, 233, 121, 8};
         ArrayUtilities.printArray(array5);
         System.out.print("  output:  " );
         System.out.println(ArrayUtilities.getMaxInt(array5));
         System.out.println("expected:  233" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array5);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array6 = {"to", "too", "2"};
         ArrayUtilities.printArray(array6);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array6));
         System.out.println("expected:  2 to too" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array6);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array7 = {"Heir", "here", "hire"};
         ArrayUtilities.printArray(array7);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array7));
         System.out.println("expected:  Heir here hire" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array7);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array8 = {"its", "it's", "ITS"};
         ArrayUtilities.printArray(array8);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array8));
         System.out.println("expected:  ITS it's its" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array8);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array9 = {"0", "2", "1"};
         ArrayUtilities.printArray(array9);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array9));
         System.out.println("expected:  0 1 2" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array9);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array10 = {"1", "0", "2"};
         ArrayUtilities.printArray(array10);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array10));
         System.out.println("expected:  0 1 2" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array10);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing getSorted3():");
         System.out.print("   input:  " );
         String[] array11 = {"1", "2", "0"};
         ArrayUtilities.printArray(array11);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.getSortedOf3(array11));
         System.out.println("expected:  0 1 2" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array11);
         System.out.println("Input arrays should be the same");
         System.out.println();

        System.out.println("Testing rotateLeft():");
        System.out.print("   input:  " );
        int[] array12 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        ArrayUtilities.printArray(array12);
        System.out.print("  output:  " );
        ArrayUtilities.printArray(ArrayUtilities.rotateLeft(array12));
        System.out.println("expected:  2 1 2 1 2 1 2 1 2 1" );
        System.out.print("   input:  " );
        ArrayUtilities.printArray(array12);
        System.out.println("Input arrays should be the same");
        System.out.println();

        System.out.println("Testing rotateLeft():");
        System.out.print("   input:  " );
        int[] array13 = {5, 6, 7, 1, 2, 3, 4};
        ArrayUtilities.printArray(array13);
        System.out.print("  output:  " );
        ArrayUtilities.printArray(ArrayUtilities.rotateLeft(array13));
        System.out.println("expected:  6 7 1 2 3 4 5" );
        System.out.print("   input:  " );
        ArrayUtilities.printArray(array13);
        System.out.println("Input arrays should be the same");
        System.out.println();

         System.out.println("Testing combine():");
         System.out.print("   input:  " );
         int[] array14 = {0};
         int[] array15 = {1, 2, 3, 4, 5, 6, 7};
         ArrayUtilities.printArray(array14);
         ArrayUtilities.printArray(array15);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.combine(array14, array15));
         System.out.println("expected:  0 1 2 3 4 5 6 7" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array14);
         ArrayUtilities.printArray(array15);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing combine():");
         System.out.print("   input:  " );
         int[] array16 = {1, 2, 3, 4};
         int[] array17 = {4, 3, 2, 1};
         ArrayUtilities.printArray(array16);
         ArrayUtilities.printArray(array17);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.combine(array16, array17));
         System.out.println("expected:  1 2 3 4 4 3 2 1" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array16);
         ArrayUtilities.printArray(array17);
         System.out.println("Input arrays should be the same");
         System.out.println();

         System.out.println("Testing combine():");
         System.out.print("   input:  " );
         int[] array18 = {5, 4};
         int[] array19 = {3};
         ArrayUtilities.printArray(array18);
         ArrayUtilities.printArray(array19);
         System.out.print("  output:  " );
         ArrayUtilities.printArray(ArrayUtilities.combine(array18, array19));
         System.out.println("expected:  5 4 3" );
         System.out.print("   input:  " );
         ArrayUtilities.printArray(array18);
         ArrayUtilities.printArray(array19);
         System.out.println("Input arrays should be the same");
         System.out.println();
    }
  /**
     * This method is used to test the Property class.
     * 
     * @param args No command line input required.
     */
    public static void testPropertyClass()
    {
        // initialize an array of 5 properties
        Property[] properties = new Property[5];

        int[] rents0 = {4, 20, 60, 180, 320, 450};
        properties[0] = new Property("Baltic Avenue", "purple", rents0);

        int[] rents1 = {6, 30, 90, 270, 400, 550};
        properties[1] = new Property("Oriental Avenue", "light blue", rents1);

        int[] rents2 = {24, 120, 360, 850, 1025, 1200};
        properties[2] = new Property("Marvin Gardens", "yellow", rents2);
        
        add4HousesAndHotel(properties);
        System.out.printf("The sum of all hotel rents is $%,5d.", sumRents(properties)); 
    }

    /**
     * For each property in the input array, 
     * add 4 houses and then add one hotel.  Only one call
     * to .addHouse() should appear in your algorithm.
     */
    private static void add4HousesAndHotel(Property[] properties)
    {
      for (int i = 0; i < 4; i++) {
        for (Property j : properties) {
          j.addHouse();
        }
      }
    }

    /**
     * Use a loop to return the sum of the rents for 
     * all properties in the input array.
     * 
     * @return The sum of the rents for all properties.
     */
    private static int sumRents(Property[] properties)
    {
      int totalRent = 0;
      int j = 0;
      for (Property i : properties) {
        totalRent += i.getRent();
      }
      return totalRent;
    }
  
}