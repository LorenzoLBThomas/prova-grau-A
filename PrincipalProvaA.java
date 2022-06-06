
public class PrincipalProvaA {

    public static void main(String[] args) {

        // PRODUTO
        // PROD 1
        
        String nome1 = Teclado.leString("Nome do produto: ");
        String marca1 = Teclado.leString("Marca: ");
        double preco1 = Teclado.leDouble("Preço: R$ ");
        while (preco1 < 0) {
            System.out.println("Preço inválido. O preço não pode ser negativo.");
            preco1 = Teclado.leDouble("Preço: R$ ");
        }
        while (preco1 >= 10000) {
            System.out.println("Preço inválido. O preço não pode ser maior do que 9999.");
            preco1 = Teclado.leDouble("Preço: R$ ");
        }
        char importado1 = Teclado.leChar("Importado? (S/N): ");
        Produto prod1 = new Produto(nome1, marca1, preco1, importado1);

        // PROD 2
        
        String nome2 = Teclado.leString("Nome do produto: ");
        String marca2 = Teclado.leString("Marca: ");
        double preco2 = Teclado.leDouble("Preço: R$ ");
        while (preco2 < 0) {
            System.out.println("Preço inválido. O preço não pode ser negativo.");
            preco2 = Teclado.leDouble("Preço: R$ ");
        }
        while (preco2 >= 10000) {
            System.out.println("Preço inválido. O preço não pode ser maior do que 9999.");
            preco2 = Teclado.leDouble("Preço: R$ ");
        }
        char importado2 = Teclado.leChar("Importado? (S/N): ");
        Produto prod2 = new Produto(nome2, marca2, preco2, importado2);

        // PROD 3
        
        String nome3 = Teclado.leString("Nome do produto: ");
        String marca3 = Teclado.leString("Marca: ");
        double preco3 = Teclado.leDouble("Preço: R$ ");
        while (preco3 < 0) {
            System.out.println("Preço inválido. O preço não pode ser negativo.");
            preco3 = Teclado.leDouble("Preço: R$ ");
        }
        while (preco3 >= 10000) {
            System.out.println("Preço inválido. O preço não pode ser maior do que 9999.");
            preco3 = Teclado.leDouble("Preço: R$ ");
        }
        char importado3 = Teclado.leChar("Importado? (S/N): ");
        Produto prod3 = new Produto(nome3, marca3, preco3, importado3);

        // PROD MAIS BARATO
        
        Produto prodMaisBarato = prod1;
        if (prod2.getPreco() < prodMaisBarato.getPreco())
            prodMaisBarato = prod2;
        if (prod3.getPreco() < prodMaisBarato.getPreco())
            prodMaisBarato = prod3;
        System.out.println();
                System.out.println("Informações do produto mais barato:");
        prodMaisBarato.imprimeInfo();

        // AR CONDICIONADO

        // AR 1
        
        System.out.println();
        double temp_min1 = Teclado.leDouble("Digite a temperatura mínima do ar 1: ");
        while (temp_min1 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_min1 = Teclado.leDouble("Digite a temperatura mínima do ar 1: ");
        }
        double temp_max1 = Teclado.leDouble("Digite a temperatura máxima: ");
        while (temp_max1 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_max1 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        while (temp_max1 < temp_min1) {
            System.out.println("A temperatura máxima não pode ser menor do que a mínima.");
            temp_max1 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        ArCondicionado ar1 = new ArCondicionado(temp_min1, temp_max1);

        if (ar1.ajustaTemperaturaAtual(Teclado.leDouble("Nova temperatura: ")))
            System.out.println("Não foi necessário ajustar a temperatura atual.");
        else
            System.out.println("Foi necessário ajustar a temperatura atual.");

        // AR 2
        
        System.out.println();
        double temp_min2 = Teclado.leDouble("Digite a temperatura mínima do ar 2: ");
        while (temp_min2 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_min2 = Teclado.leDouble("Digite a temperatura mínima do ar 2: ");
        }
        double temp_max2 = Teclado.leDouble("Digite a temperatura máxima: ");
        while (temp_max2 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_max2 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        while (temp_max2 < temp_min1) {
            System.out.println("A temperatura máxima não pode ser menor do que a mínima.");
            temp_max2 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        ArCondicionado ar2 = new ArCondicionado(temp_min1, temp_max1);

        if (ar2.ajustaTemperaturaAtual(Teclado.leDouble("Nova temperatura: ")))
            System.out.println("Não foi necessário ajustar a temperatura atual.");
        else
            System.out.println("Foi necessário ajustar a temperatura atual.");

        // AR 3
        
        System.out.println();
        double temp_min3 = Teclado.leDouble("Digite a temperatura mínima do ar 3: ");
        while (temp_min3 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_min3 = Teclado.leDouble("Digite a temperatura mínima do ar 3: ");
        }
        double temp_max3 = Teclado.leDouble("Digite a temperatura máxima: ");
        while (temp_max3 < 0) {
            System.out.println("Temperatura inválida. Não é possível informar um valor menor do que 1");
            temp_max3 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        while (temp_max3 < temp_min1) {
            System.out.println("A temperatura máxima não pode ser menor do que a mínima.");
            temp_max3 = Teclado.leDouble("Digite a temperatura máxima: ");
        }
        ArCondicionado ar3 = new ArCondicionado(temp_min1, temp_max1);

        if (ar3.ajustaTemperaturaAtual(Teclado.leDouble("Nova temperatura: ")))
            System.out.println("Não foi necessário ajustar a temperatura atual.");
        else
            System.out.println("Foi necessário ajustar a temperatura atual.");

    }
}
