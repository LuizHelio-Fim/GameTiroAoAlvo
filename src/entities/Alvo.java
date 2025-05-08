package entities;

public abstract class Alvo {
	
	private static int quantADestruir = 3;
	private int posX, posY;
	
	public Alvo(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public static int getQuantADestruir() {
		return quantADestruir;
	}

	public static void setQuantADestruir(int quantADestruir) {
		Alvo.quantADestruir = quantADestruir;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public boolean igual(Alvo alvo) {
		if
	}
	
	public abstract void acerta(int posX, int posY);

	@Override
	public String toString() {
		return "Alvo\n posX= " + posX + ", posY= " + posY + "]";
	}
	
	
}
