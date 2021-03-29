package nicolas.color.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

    Color color;
    Color color2;
    
    
    private final int rouge = 213;
    private final int vert = 141;
    private final int bleu = 53;
    
    
    @Before
    public void setUp() {
        color = new Color(213,141,53);
        color2 = new Color(rouge, vert, bleu);
    }

    @After
    public void tearDown() {
        color = null;
        color2 = null;

    }

    @Test
    public void testGetRed() {
        assertEquals(213, color.getRed());
    }

    @Test
    public void testGetGreen() {
        assertEquals( 141, color.getGreen());
    }

    @Test
    public void testGetBlue() {
        assertEquals( 53, color.getBlue());
    }

    @Test
    public void testSetGreen() {
        color.setGreen(141);
        assertEquals( 141, color.getGreen());
    }

    @Test
    public void testSetBlue() {
        color.setBlue(53);
        assertEquals( 53, color.getBlue());
    }

    @Test
    public void testSetRed() {
        color.setRed(213);
        assertEquals(213, color.getRed());
    }


    @Test
    public void testGetHexa() {
        color.setHexa("#D58D35");
        assertEquals( "#D58D35", color.getHexa());
    }

    @Test
    public void testSetHexa() {
        color.setHexa("#D58D35");
        assertEquals( "#D58D35", color.getHexa());
    }

    @Test
    public void testToString() {
        color.setHexa("#D58D35");
        assertEquals( "[value=#D58D35, r=213, g=141, b=53]", color.toString());
    }
    
    @Test
    public void testRougePlus() {
    	
    	new Color(-1500,vert,bleu) ;
    }
    @Test
    public void testRougeMoins() {
    	
    	new Color(1500,vert,bleu) ;
    }
    
    @Test
    public void testVertPlus() {
    	
    	new Color(rouge,-1500,bleu) ;
    }
    @Test
    public void testVErtMoins() {
    	
    	new Color(rouge,1500,bleu) ;
    }
    
    
    @Test
    public void testBleuPlus() {
    	
    	new Color(rouge,vert,-1500) ;
    }
    @Test
    public void testBleuMoins() {
    	
    	new Color(rouge,vert,1500) ;
    }
    
    @Test
    public void testPlusieursColorErreur() {
    	
    	new Color(255,255,1500) ;
    }
    
    @Test
    public void testPlusieursColorErreur2() {
    	
    	new Color(255,255,1500) ;
    }

    @Test
    public void testHexaSansDiese() {
        color.setHexa("D58D35");
    }
    
    @Test
    public void testHexaTropLong() {
        color.setHexa("#D58D356");
    }
    
    @Test
    public void testHexaIncorrect() {
        color.setHexa("#D58)356");
    }
    
    @Test
    public void testHexaIncorrect2() {
        color.setHexa("#D58J356");
    }
    
    @Test
    public void testHexaIncorrect3() {
        color.setHexa("&D58J356");
    }
    
}