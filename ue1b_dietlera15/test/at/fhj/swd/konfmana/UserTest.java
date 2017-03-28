package at.fhj.swd.konfmana;

import org.junit.Assert;
import org.junit.Test;

import at.fhj.swd.konfmana.User;

public class UserTest
{
    @Test
    public void testConstructor()
    {
        User u = new User(3, "homer", "*****");
        
        Assert.assertEquals(3, u.getId());
        Assert.assertEquals("homer", u.getUsername());
        Assert.assertEquals("*****", u.getPassword());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_UsernameIsNull()
    {
        new User(3, null, "*****");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_PasswordIsNull()
    {
        new User(3, "homer", null);
    }
    
    @Test
    public void testToString()
    {
        User u = new User(3, "homer", "*****");

        final String EXPECTED = "3,homer,*****";        
        Assert.assertEquals(EXPECTED, u.toString());
    }
    
}
