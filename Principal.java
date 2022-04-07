import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*Com Construtor		
		String modelo1 = JOptionPane.showInputDialog("Insira o Modelo do primeiro carro: ");
		String cor1 = JOptionPane.showInputDialog("Insira a Cor do primeiro carro: ");
		
		String modelo2 = JOptionPane.showInputDialog("Insira o Modelo do segundo carro: ");
		String cor2 = JOptionPane.showInputDialog("Insira a Cor do segundo carro: ");
		
		Classe_Carro carro1 = new Classe_Carro(modelo1,cor1);
		Classe_Carro carro2 = new Classe_Carro(modelo2,cor2);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());*/
		
		
		//Sem Construtor
		
		//Declarando carro 1 e 2
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		//Dando valor para o carro 1 e 2
		carro1.setModelo("Ferrari");
		carro2.setModelo("Uno");
		carro1.setCor("Vermelha");
		carro2.setCor("Cinza");
		//Monstrando para o usuario carro 1 e 2
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		
	}

}
