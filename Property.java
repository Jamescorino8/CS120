
/**
 * This class represents a property in a Monopoly game.
 * 
 * @author 
 * @version 
 */
public class Property
{
    //The name of the property.
    private String name;

    //The color of the property.
    private String color;

    //The number of houses on the property.
    private int houses;

    //True if the property has a hotel and false otherwise.
    private boolean hasHotel;

    //The rents for the property in the following order:
    //rents[0] --> no houses or hotels; 
    //rents[1] --> 1 house; 
    //rents[2] --> 2 houses; 
    //rents[3] --> 3 houses; 
    //rents[4] --> 4 houses; 
    //rents[5] --> 1 hotel.
    private int[] rents;

    /**
     * Constructs a Monopoly property with no houses or hotel.
     * 
     * @param name The name of the property.
     * @param color The color of the property.
     * @param rents The rents for a property in the following order:
     *              rents[0] --> no houses or hotels; 
     *              rents[1] --> 1 house; 
     *              rents[2] --> 2 houses; 
     *              rents[3] --> 3 houses; 
     *              rents[4] --> 4 houses; 
     *              rents[5] --> 1 hotel.
     */
    public Property(String name, String color, int[] rents)
    {
      this.name = name;
      this.color = color;
      this.rents = rents;
    }

    /**
     * Adds a house to the property if it has less than 4 houses.
     */
    public void addHouse()
    {
      if (houses < 4) {
        houses++;
      }
    }

    /**
     * If the property has 4 houses, adds a hotel and removes all houses.
     */
    public void addHotel()
    {
      if (houses == 4) {
        hasHotel = true;
        houses = 0;
      }
    }

    /**
     * Returns the rent for the property based on the number of 
     * houses/hotel on the property.
     * 
     * @return The property's current rent.
     */
    public int getRent()
    {
        int rent = rents[5];
        
        if(!hasHotel)
        {
            rent = rents[houses];
        }
        
        return rent;
    }
}
