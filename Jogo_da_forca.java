
public class Jogo_da_forca {
import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra[] = {"TIAGO","CLARISSE","BRUNO", "LUIZ", "DOUGLAS", "JOAO","PEDRO","MARIA", "BRUNA", "PAULO"};
		String letraUsada = "";
		String palavraAdivinhada = "";
		String palavraEscolhida;
		int qtde;
		int pos;
		int tam;
		int maxTentativas = 7;

		qtde = palavra.length;
		pos = Math.random()*qtde;
		palavraEscolhida = palavra[pos];
		tam = palavraEscolhida.length;
				
			for(int x = 0; x < palavraEscolhida.length(); x++) {
				palavraAdivinhada = "_";
			}
				for(int tentativa = 0; ; tentativa++) {
					if(tentativa == maxTentativas) {
						System.out.println("Já foram 7 erros! A palavra era '%c'",palavraEscolhida);
						System.exit(0);
					}}
				System.out.println("E vamos para a rodada %d. Até essa rodada foi adivinhado as seguintes letras: %s".tentativa , palavraAdivinhada);
				
				char letraTentada = new Scanner (System.in).next().charAt(0);
				
				if(letraUsada.indexOf(letraTentada) >= 0) {
					System.out.println("Você já tentou a letra %c.%n".letraTentada);
				} else {
					letraUsada += letraTentada;
				}
					
					if (0 <= palavra.indexOf(letraTentada){
						palavraAdivinhada = "";
					}
						for(int y = 0; y < palavraEscolhida.length(); y++) {
							palavraEscolhida += letraUsada.indexOf(palavraEscolhida.charAt(y))>= 0 ? palavra.charAt(y):"_"
						}
							if (palavraEscolhida.contains("_")) {
								System.out.println("Você acertou essa letra, mas ainda tem letras para descobrir%n".letraTentada);
							}else {
								System.out.println("Parabens! A palavra é '%s'".palavraEscolhida);
								System.exit(0);
					}else {
						System.out.println("A letra %c não existe na palavra".letraTentada);
					}
			

	}

}
