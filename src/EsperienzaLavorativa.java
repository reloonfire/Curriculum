import java.time.LocalDate;
import java.util.ArrayList;


public class EsperienzaLavorativa extends Voci {
	private String nomeAz;
	private String retribuzioneM;
	private String corsiAgg;
	private ArrayList<String> tipiCorsi = new ArrayList<String>();

	public EsperienzaLavorativa(LocalDate dataInizio, LocalDate dataFine, String descrizione, String nomeAz,
			String retribuzioneM, boolean corsiAgg, ArrayList<String> tipiCorsi) {
		super(dataInizio, dataFine, descrizione);
		this.nomeAz = nomeAz;
		this.retribuzioneM = retribuzioneM;
		if (corsiAgg)
			this.corsiAgg = "Si";
		else
			this.corsiAgg = "No";
		this.tipiCorsi = tipiCorsi;
	}

	@Override
	public String toString() {
		String tipoDiCorso = "";
		if (tipiCorsi == null)
			tipoDiCorso = "Tipo di corso: Nessuno";
		else
			tipoDiCorso = "\nTipo di corso: " + tipiCorsi;
		return super.toString() + "\nLavorato presso: " + nomeAz + "\nInquadramento mensile netto: " + retribuzioneM
				+ "€\nPartecipazione corsi aggiornamento: " + corsiAgg + "\n" + tipoDiCorso;
	}
}
