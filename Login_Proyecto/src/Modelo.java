
public class Modelo {
	private Vista mivista;
	private final String user;
	private final String pwd;
	private String resultado;
	private int fallos;

	public Modelo() {
		this.user = "Administrador";
		this.pwd = "5825";
	}

	public void setvista(Vista mivista) {
		this.mivista = mivista;
	}

	public void login(String usr, String psswd) {
		if (this.user.equals(usr) && this.pwd.equals(psswd)) {
			resultado = "correcto";
			fallos = 0;
		} else {
			fallos++;
			if (fallos == 3) {
				resultado = "Cerrar";
			} else
				resultado = "Incorrecto";
		}
	}
}
	
