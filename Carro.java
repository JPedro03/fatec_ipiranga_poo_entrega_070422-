
public class Carro {
	//Sem Construtor
	private String modelo = "";
	private String cor = "";
	
	/*Com Construtor
	private String modelo;
	private String cor;
	
	public Classe_Carro(String modelo,String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}*/
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
