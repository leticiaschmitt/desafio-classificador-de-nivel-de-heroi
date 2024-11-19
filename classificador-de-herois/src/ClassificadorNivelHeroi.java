import java.util.Scanner;

public class ClassificadorNivelHeroi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar nome e XP do herói
        System.out.println("Digite o nome do herói:");
        String nomeHeroi = scanner.nextLine();

        System.out.println("Digite a quantidade de XP do herói:");
        int xpHeroi = scanner.nextInt();

        // Variável para armazenar o nível do herói
        String nivel = classificarNivel(xpHeroi);

        // Exibindo o resultado
        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
    }

    // Método para classificar o herói de acordo com o XP
    public static String classificarNivel(int xp) {
        if (xp < 1000) {
            return "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            return "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            return "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            return "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            return "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            return "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }
}

