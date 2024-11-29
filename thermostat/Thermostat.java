/**
 * This class represents a simple thermostat that has a
 * fan the can be turned on or off and a temperature
 * range of [60, 85] degrees Fahrenheit.
 * 
 * @author Prof. White
 * @version Fall 2019
 */
public class Thermostat
{
    private boolean fan;
    private int temp;

    /**
     * Constructs a thermostat that is off and has a temperature
     * setting of 68 degrees Fahrenheit.
     */
    public Thermostat()
    {
      temp = 68;
      fan = false;
    }

    /**
     * Constructs a thermostat. The fan will be set to the input
     * value.  If the temperature is in [60, 85], it is set to
     * the input value.  Otherwise, it is set to 68 degrees.
     * 
     * @param fan True if the fan should be on or false if
     * it should be off.
     * @param The setting for the thermostat in [60, 85].
     */
    public Thermostat(boolean fan1, int temp1)
    {
      fan = fan1;
      if(temp1 >= 60 && temp1 <= 85){
        temp = temp1;
      }
      else {
        temp = 68;
      }
     
    }

    /**
     * Returns true if the fan is on. Returns false otherwise.
     * 
     * @return true if the fan is on. Returns false otherwise.
     */
    public boolean getFan()
    {
        if (fan == true) {
          return true;
        }
        else {
          return false;
        }
        
    }

    /**
     * Returns the current temperature of the thermostat.
     * 
     * @return The current temperature of the thermostat.
     */
    public int getTemp()
    {
        return temp;
    }

    /**
     * Sets the fan to on(true) or off(false) according
     * to the input value.
     * 
     * @param fan True if the fan should be set to on and
     * false otherwise.
     */
    public void setFan(boolean fan1)
    {
      fan = fan1;
    }

    /**
     * If the input temperature is in [60, 85], sets the
     * thermostate to the input temperature.  Otherwise,
     * sets the temperature to 68 degrees Fahrenheit.
     * 
     * @param temp The temperature at which to set the
     * thermostat in [60, 85].
     */
    public void setTemp(int temp1)
    {
      if (temp1 >= 60 && temp1 <= 85) {
      temp = temp1;
      }
      else {
        temp = 68;
      }
    }

    /**
     * If the fan is on, turns it off.  If the fan is off,
     * turns it on.
     */
    public void toggleFan()
    {
      if (fan == true){
        fan = false;
      }
      else{
        fan = true;
      }
    }

    /**
     * If the input value + the current temperature is
     * less than or equal to 85 degrees, changes the
     * temperature to the current temperature plus the input
     * value.  Otherwise, sets the temperature to 85 degrees.
     *
     * @param adder The amount by which the temperature may
     * be increased.
     * @return The temperature of the thermostat after it is
     * updated.
     */
    public int increaseTemp(int adder)
    {
        if ((adder + temp) <= 85) {
          temp = adder + temp;
        }
        else {
          temp = 85;
        }
        return temp;
    }

    /**
     * If the input value - the current temperature is
     * greater than or equal to 60 degrees, changes the
     * temperature to the current temperature plus the input
     * value.  Otherwise, sets the temperature to 60 degrees.
     *
     * @param adder The amount by which the temperature may
     * be decreased.
     * @return The temperature of the thermostat after it is
     * updated.
     */
    public int decreaseTemp(int subtr)
    {
        if ((temp - subtr) >= 60){
          temp = temp - subtr;
        }
        else{
          temp = 60;
        } 
        return temp; 
    }

    /**
     * Returns a description of the thermostat settings,
     * includeing whether the fan is on or off and
     * the current temperature.
     * 
     * E.g., 
     * Fan is on; Temperature = 72
     * 
     * @return A description of the thermostat settings,
     * includeing whether the fan is on or off and
     * the current temperature.
     */
    @Override
    public String toString()
    {
      String onOff;
      if (fan == false){
        onOff = "off";
      }
      else{
        onOff = "on";
      }
      return "Fan is " + onOff + "; Temperature = " + temp;
    }
}