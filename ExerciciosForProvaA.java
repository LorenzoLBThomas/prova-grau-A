
public class ExerciciosForProvaA {

	public static void contador() {
		int x = Teclado.leInt("Digite um número inteiro: ");
		if (x < 0)
			System.out.println("ERRO! O valor digitado não pode ser negativo.");
		else
			for (; x >= 0; x--) {
				System.out.println(x);
			}
	}
}