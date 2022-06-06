
public class Produto {
	private String nome, marca;
	private double preco;
	private boolean importado;

	public Produto(String nome, String marca, double preco, char resp_importado) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		if (resp_importado == 'S' || resp_importado == 's')
			this.importado = true;
		else
			this.importado = false;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}

	public void imprimeInfo() {
		System.out.println("Nome do produto: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Preço: R$ "+preco);
		System.out.println("Importado: "+importado);
	}

	public String toString() {
		return "Nome do produto: " + "/ Marca: " + "/ Preço: R$ " + "/ Importado: " + importado;
	}

}
