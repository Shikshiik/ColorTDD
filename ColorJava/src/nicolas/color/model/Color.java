package nicolas.color.model;


public class Color {

	
	private int red;
	private int green;
	private int blue;
	private String hexa;
	


	public Color(int red, int green, int blue)  {
		
		if (red >= 0 || red <= 255 || green >= 0 || green <= 255 || blue >= 0 || blue <= 255) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		} else {
			throw new IllegalArgumentException("Erreur rgb");
		}
	}
	
	
    @SuppressWarnings("unlikely-arg-type")
	public Color(String hexa) {
    	
    	if (hexa.substring(0,1).equals('#') && hexa.length() == 7 && hexa.matches("^#([A-F0-9]{6}")) {
            this.hexa = hexa;
    	} else {
			throw new IllegalArgumentException("Erreur hexa");
		}
    
    }
	
	


    @Override
    public String toString() { 
        return "[value=" + hexa + ", r=" + red + ", g=" + green + ", b=" + blue + "]";
    }
	
	
	
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	public String getHexa() {
		return hexa;
	}

	public void setHexa(String hexa) {
		this.hexa = hexa;
	}
	
	
}
