

public class Diploma {
	
	private String tipoDiploma;
	private String durataDiploma;
	private String votoDiploma;

	public Diploma(String tipoDiploma, String durataDiploma, String votoDiploma) {
		this.tipoDiploma = tipoDiploma;
		this.durataDiploma = durataDiploma;
		this.votoDiploma = votoDiploma;
	}

	@Override
	public String toString() {
		return "          Tipo di diploma: " + tipoDiploma + "\n          Durate del diploma: " + durataDiploma
				+ "\n          Voto di uscita: " + votoDiploma;
	}
}
