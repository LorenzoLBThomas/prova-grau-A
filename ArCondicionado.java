
public class ArCondicionado {
	private double temp_min, temp_max, temp_atual;
	private boolean quenteEFrio;

	public ArCondicionado(double temp_min, double temp_max) {
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.temp_atual = (temp_max + temp_min) / 2;

		if (temp_max < temp_min) {
			temp_max = 30.00;
			temp_min = 16.00;
		}
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public double getTemp_atual() {
		return temp_atual;
	}

	public boolean isQuenteEFrio() {
		return quenteEFrio;
	}

	public void imprimeInfo() {
		System.out.println("Temperatura mínima: ");
		System.out.println("Temperatura máxima: ");
		System.out.println("Temperatura atual: ");
		System.out.println("Quente e frio: ");
	}

	public String toString() {
		return "Temperatura mínima: " + "/ Temperatura máxima: " + "/ Temperatura atual: " + "/ Quente e frio: "
				+ quenteEFrio;
	}

	public boolean ajustaTemperaturaAtual(double novaTemperatura) {
		if (novaTemperatura < this.temp_min) {
			this.temp_atual = this.temp_min;
			return false;
		} else if (novaTemperatura > this.temp_max) {
			this.temp_atual = this.temp_max;
			return false;
		} else
			return true;
	}
}
