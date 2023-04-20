
public class Main {
	public static void main(String[] args) {
		Controlador Micontrolador = new Controlador();
		Modelo Mimodelo = new Modelo();
		Vista Mivista = new Vista();

		Micontrolador.setmodelo(Mimodelo);
		Micontrolador.setvista(Mivista);
		Mimodelo.setvista(Mivista);
		Mivista.setcontrolador(Micontrolador);
		Mivista.setmodelo(Mimodelo);

		Mivista.setVisible(true);

	}

}
