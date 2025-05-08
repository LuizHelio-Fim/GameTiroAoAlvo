package entities;

public class AlvoPreto extends Alvo{

	public AlvoPreto(int posX, int posY) {
		super(posX, posY);
	}

	@Override
	public boolean acerta(int posX, int posY) {
		if(super.getPosX() == posX && super.getPosY() == posY) {
			super.setQuantADestruir(getQuantADestruir()-1);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Alvo Preto na posição (" + super.getPosX() + ", " + super.getPosY() + ")";
	}
	
}
