import static org.junit.Assert.*;

import org.junit.Test;


public class NumeroFelizTest
{

    @Test
    public void numeroCincoEhInfeliz()
    {
        boolean result = new NumeroFeliz().isHappy(5);
        assertFalse(result);
    }
    
    @Test
    public void numeroDezEhFeliz()
    {
        boolean result = new NumeroFeliz().isHappy(10);
        assertTrue(result);
    }
    
    @Test
    public void numero130Feliz()
    {
        boolean result = new NumeroFeliz().isHappy(130);
        assertTrue(result);
    }
}
