
/**
 * Class contains personal details of person
 * 
 * @author jf
 * @version 14.3.2015
 *
 */
public class Person
{
    // Persons personal details
    private final String firstName;
    private final String lastName;
    String email;
    // A pin number associated with person
    private int pin;

    /**
     * Construct Person object
     * @param firstName
     * @param lastName
     * @param email
     * @param pin
     */
    public Person(String firstName, String lastName, String email, int pin)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        // TODO 1 Complete initialization with validation of remaining fields
               
        if (Util.validEmail(email))
        {
          this.email = email;
        }    
        else
        {
          this.email = " ";
        }    
            
        if (Util.validPin(pin))
        {  
          this.pin = pin;
        }  
        else
        {
          this.pin = Util.generatePin();
        } 
    }

    /**
     * Accessor for pin number
     * @return The pin number
     */
    public int getPin()
    {
        return pin;
    }

    /**
     * Generates a String representation of Person object
     * @return The string representation of Person object
     */
    public String toString()
    {
        return "Full name: " + firstName + " " + lastName + " : Email : " + email;
    }
}
