package entities;

public class AlvoBranco extends Alvo{

	public AlvoBranco(int posX, int posY) {
		super(posX, posY);
	}

	@Override
	public boolean acerta(int posX, int posY) {
		if(super.igual(null)) {
			super.setQuantADestruir(getQuantADestruir()+1);
			return true;
		} else {
			return false;
		}
	}

}
