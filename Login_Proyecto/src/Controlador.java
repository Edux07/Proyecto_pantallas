
public class Controlador {
	private Modelo Mimodelo;
	private Vista Mivista;

	public void setmodelo(Modelo mimodelo) {
		Mimodelo = mimodelo;		
	}

	public void setvista(Vista mivista) {
		Mivista= mivista;
		
	}
	public void login() {
		String usr =Mivista.getUser();
		String psswd =Mivista.getPwd();
		Mimodelo.login(usr,psswd);
	}

	

	

}
