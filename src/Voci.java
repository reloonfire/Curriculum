import java.time.LocalDate;
import java.util.ArrayList;

public class Voci {

	private static final String alfabeto = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static ArrayList<String> ids = new ArrayList<String>();

	private String id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private String descrizione;

	public Voci(LocalDate dataInizio, LocalDate dataFine, String descrizione) {
		id = generaIds();
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.descrizione = descrizione;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public static String generaIds() {
		String id = "";
		for (int i = 0; i < 8; i++) {
			id += alfabeto.charAt((int) Math.floor(Math.random() * 62));

			if (!ids.contains(id) && i == 7) {
				ids.add(id);
			} else if (i == 7) {
				i = -1;
			}
		}
		return id;
	}

	public static String getListaId() {
		String result = "";
		for (int i = 0; i < ids.size(); i++) {
			result += i + ") " + ids.get(i).toString() + "\n";
		}
		return result;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "//\nId: " + id + "\nData di inizio: " + dataInizio + "\nData di fine: " + dataFine + "\nDescrizione: "
				+ descrizione + "\n";
	}

	public static void removeId(int n) {
		ids.remove(n);
	}

	
}