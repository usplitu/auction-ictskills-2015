
import java.util.HashSet;
/**
 * Class to manage an audience
 * Has set of people and methods to register and authenticate new members
 * 
 * @author jf
 * @version 14.3.2015
 *
 */
public class Audience
{
    // a set of people, the members of the audience
    // a set has been chosen to ensure duplicate registration does not occur
    HashSet<Person> members;

    /**
     * Constructs an Audience object
     * Initializes the members field
     */
    public Audience()
    {
        members = new HashSet<Person>();
    }

    /**
     * Registers a person as a member of the audience
     * @param person an instance of Person register as member of members
     * @return returns true if the person successfully added to set else false
     */
    public boolean register(Person person)
    { 
        // TODO 1 Add the parameter person to the set of members returning true if addition successful else false
        // Was the registration successful? Not if the person is already registered, then this registration can't
        // be successful
        boolean isMember = false;
        if (members.contains(person))
        {
          isMember = false;
        }    
        else
        {
          members.add(person);
          if (members.contains(person))
          {
            isMember = true;
          }  
        } 
        return isMember;
    }

    /**
     * Authenticates a person is a member of the audience
     * @param person The person being authenticated
     * @return Returns true if the person is a member of the audience otherwise returns false.
     */
    public boolean isRegistered(Person person)
    {
        // TODO 2 return true of the set of members contains the parameter person otherwise return false
        if (members.contains(person))
        {
          return true;
        }    
        return false;
    }

    /**
     * Authenticates person is member of audience 
     * Information provided is email and pin
     * @param email The email address of person being authenticated
     * @param pin The pin number of person being authenticated
     * @return Returns true if the person is a member of the audience otherwise returns false.
     */
    public Person isRegistered(String email, int pin)
    {
        for (Person person : members)
        {
            // TODO 3 Check if the person represented by email and pin is present in the set of members
            boolean b1 = false;
            boolean b2 = false;

            // when running Organizer main for output, I was getting Null pointer exception on the b1 = ....line (String email = null in debugger)
            // so only performing this line now if email string is ok.            
            if (email != null && !email.isEmpty())     
            {
              b1 = person.email.equalsIgnoreCase(email);
            }    

            if (person.getPin() == pin)
            {
              b2 = true;
            }  

            if ((b1 && b2 == true))
            {
              return person;              
            }  
        }
        return null;
    }
}
