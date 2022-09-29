package corsojava.traduttore;

public class Lingua {

	private char lang;
	private String parola;
	private String parolaIt;

	public Lingua() {

	}
	


	public char getLang() {
		return lang;
	}

	public void setLang(char lang) {
		this.lang = lang;
	}

	public String getParolaIt() {
		return parolaIt;
	}

	public void setParolaIt(String parolaIt) {
		this.parolaIt = parolaIt;
	}



	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}



	@Override
	public String toString() {
		return "Lingua [lang=" + lang + ", parola=" + parola + ", parolaIt=" + parolaIt + "]";
	}


	
	
}

