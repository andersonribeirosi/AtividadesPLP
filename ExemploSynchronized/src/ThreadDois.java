/**
 * 
 */

/**
 * @author Anderson Ribeiro
 *
 */

/*Esta thread imprime o estado do jogador*/
public class ThreadDois extends Thread {
	Jogador jd;

	public ThreadDois(Jogador jogador) {
		jd = jogador;
		start();
	}

	public void run() {
		if (jd.jogadorMorto()) {

			System.out.println("O jogador está morto amigo");
		} else {
			System.out.println("O jogador esta vivo, aê");

		}
	}
}
