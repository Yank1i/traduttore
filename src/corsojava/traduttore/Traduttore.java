package corsojava.traduttore;

import java.util.ArrayList;
import java.util.List;

public class Traduttore {

	private List<Lingua> langList = new ArrayList();

	public Traduttore() {

	}

	@Override
	public String toString() {
		return "Traduttore [langList=" + langList + "]";
	}

	public void insertParola(char c, String parolaStr, String parolaIt, Lingua lang) {

		switch (c) {
		case 'e':
			lang.setParola(parolaStr);
			lang.setParolaIt(parolaIt);
			lang.setLang('e');
			langList.add(lang);
			break;

		case 'f':
			lang.setParola(parolaStr);
			lang.setParolaIt(parolaIt);
			lang.setLang('f');
			langList.add(lang);
			break;
		default:
			System.out.println("Lingua non esistente");

		}

	}

	public void traduciParola(String parola) {

		for (int i = 0; i < langList.size(); i++) {
			Lingua l = langList.get(i);

			if (l.getParola().equalsIgnoreCase(parola) && l.getLang() == 'e') {
				System.out.println("La traduzione di: " + l.getParola() + " e' " + l.getParolaIt());
			}
			if (l.getParola().equalsIgnoreCase(parola) && l.getLang() == 'f') {
				System.out.println("La traduzione di: " + l.getParola() + " e' " + l.getParolaIt());
			}

		}

	}

	public void removeParola(String parola) {
		for (int i = 0; i < langList.size(); i++) {
			Lingua l = langList.get(i);
			if (l.getParola().equalsIgnoreCase(parola)) {
				langList.remove(l);
			} else {
				System.out.println("Parola inesistente");
			}

		}
	}

	public void printDizionario(char c) {

		for (int i = 0; i < langList.size(); i++) {
			Lingua lang = langList.get(i);
			if (lang.getLang() == c) {
				System.out.println(lang.getParola() + "     " + lang.getParolaIt());
			}
		}

	}

}
