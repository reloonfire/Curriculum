import java.time.LocalDate;


public class StudioEffettuato extends Voci
{
	private String nomeIst;
	private int anniStudio;
	private Diploma diplomaConseguito;
	
	public StudioEffettuato(LocalDate dataInizio, LocalDate dataFine, String descrizione, String nomeIst, Diploma diplomaConseguito)
	{
		super(dataInizio, dataFine, descrizione);
		this.nomeIst = nomeIst;
		this.anniStudio = dataFine.getYear()-dataInizio.getYear();
		this.diplomaConseguito = diplomaConseguito;
	}
	
	@Override
	public String toString()
	{
		return  super.toString() + "\nStudiato presso: " + nomeIst + "\nAnni di studio: " + anniStudio + 
				"\nDisploma: \n\n" + diplomaConseguito;
		
	}
}
