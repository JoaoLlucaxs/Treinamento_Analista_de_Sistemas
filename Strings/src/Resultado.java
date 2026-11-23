import java.util.Locale;

public class Resultado {
    public static void main(String[] args) {

        String original = "hgyg gyy FGHJT ABC abc FGE   ";

        String minuscula = original.toLowerCase();
        String maiuscula = original.toUpperCase();
        String limpaEspaco = original.trim();
        String recortar = original.substring(2);
        String recortarApartirLimite = original.substring(2,9);
        String troca = original.replace("g", "X"); // troca g por X
        int validarPosicao = original.indexOf("F");
        int validarUltimaPosicao = original.lastIndexOf("F");

        String frut = "laranja uva maça";
        String[] vetor = frut.split(" ");

        System.out.println(vetor[2]);

        String texto = "  Java é incrível  ";
        boolean vazioOuEspacos = texto.isBlank(); // true se vazia ou só espaços (Java 11+)
        boolean contem = texto.contains("Java");  // true
        boolean comecaCom = texto.trim().startsWith("Java"); // true
        boolean igualIgnorandoCaso = texto.trim().equalsIgnoreCase("java é incrível"); // true

        String email = "usuario@exemplo.com.br";

        int arroba = email.indexOf("@"); // 7
        String usuario = email.substring(0, arroba); // "usuario"
        String dominio = email.substring(arroba + 1); // "exemplo.com.br"

        String csv = "maçã,banana,laranja";
        String[] frutas = csv.split(","); // ["maçã", "banana", "laranja"]

        String nome = "Ana";
        int idade = 28;
        String mensagem = String.format("Nome: %s | Idade: %d", nome, idade); // "Nome: Ana | Idade: 28"

        StringBuilder sb = new StringBuilder();
        for (String fruta : frutas) {
            sb.append("- ").append(fruta).append("\n");
        }
        String listaFormatada = sb.toString();

        int numero = Integer.parseInt("42"); // String para int
        double preco = Double.parseDouble("19.90"); // String para double
        String textoNumero = String.valueOf(100); // int para String

    }
}
