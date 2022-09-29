package corsojava.traduttore;

import java.util.Scanner;

public class TraduttoreMain {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			Traduttore t = new Traduttore();

			int scelta;

			do {

				System.out.println("Scegli l'operazione da eseguire: ");
				System.out.println("1.Tradurre una parola");
				System.out.println("2.Inserire una nuova parola");
				System.out.println("3.Rimuovre la parola esistente");
				System.out.println("4.Visualizzare il dizionario");
				scelta = in.nextInt();
				in.nextLine();

				switch (scelta) {
				case 1:
					System.out.println("Inserisci la parola che vuoi tradurre");
					String parola;
					parola = in.nextLine();
					t.traduciParola(parola);

					break;

				case 2:
					Lingua l = new Lingua();
					String parolaStr;
					String parolaIta;
					System.out.println("Specifica lingua: e-per inglese, f-pre francese");
					char c;
					c = in.next().charAt(0);

					in.nextLine();

					System.out.println("Inserisci la parola nella lingua scelta:");
					parolaStr = in.nextLine();
					System.out.println("Inserisci la sua traduzione in italiano:");
					parolaIta = in.nextLine();

					t.insertParola(c, parolaStr, parolaIta, l);
					break;
					
				case 3:
					System.out.println("Inserisci la parola da eliminare nella lingua straniera:");
					String pRemove;
					pRemove=in.nextLine();
					t.removeParola(pRemove);
					break;
				case 4:
					System.out.println("Dizionario: e-Inglese, f-Francese");
					char h;
					h=in.next().charAt(0);
					t.printDizionario(h);
					

				}

				System.out.println("");

			} while (scelta != 0);

		}
	}

}
