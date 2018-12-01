import java.util.ArrayList;


public class Curriculum {
	private ArrayList<Voci> curriculum = new ArrayList<Voci>();
	private static ArrayList<Object> o = new ArrayList<Object>();

	public void add(EsperienzaLavorativa espLav) {
		curriculum.add(espLav);
	}

	public void add(StudioEffettuato titoloStudio) {
		curriculum.add(titoloStudio);
	}

	public void sistema() // Curriculum array
	{
		int conta = 0;
		for (int i = 0; i < curriculum.size(); i++) {
			if (conta != i) {
				if (curriculum.get(i).getClass() == curriculum.get(conta).getClass()) {
					if (curriculum.get(conta).getDataFine().compareTo(curriculum.get(i).getDataFine()) > 0) {
						curriculum.add(curriculum.get(i));
						curriculum.set(i, curriculum.get(conta));
						curriculum.set(conta, curriculum.get(curriculum.size() - 1));
						curriculum.remove(curriculum.size() - 1);
						i = -1;
					}
				}
			}

			if (i == curriculum.size() - 1 && conta != curriculum.size() - 1) {
				conta++;
				i = -1;
			}

		}

	}

	public void fillO() // Curriculum array
	{
		for (int i = 0; i < curriculum.size(); i++) {
			if (o.size() == 0) {
				o.add(EsperienzaLavorativa.class);
				i = -1;
			} else {
				if (!o.contains(curriculum.get(i).getClass())) {
					o.add(curriculum.get(i).getClass());
				}
			}
		}
	}

	public void printC() // Curriculum array
	{
		int conta = 0;

		for (int i = 0; i < curriculum.size(); i++) {
			if (curriculum.get(i).getClass() == o.get(conta)) {
				System.out.println(curriculum.get(i));
			}

			if (i == curriculum.size() - 1 && conta != o.size() - 1) {
				conta++;
				i = -1;
			}
		}
	}

	public void stampaCV() // Curriculum array
	{
		if (curriculum.size() == 0) {
			System.out.println("Non c'è nessuna voce da visualizzare");
		} else {
			this.sistema();
			this.fillO();
			this.printC();
		}
	}

	public boolean removeVoce(int n) {
		curriculum.remove(curriculum.get(n));
		Voci.removeId(n);
		return false;
	}

	public int getSize() {
		return curriculum.size();
	}

}
