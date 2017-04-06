/**
 * 
 */

/**
 * @author Anderson Ribeiro
 *
 */

// Esta thread recebe os golpes de um jogador
public class ThreadUm extends Thread {
	Jogador jd;

	public ThreadUm(Jogador jogador) {
		jd = jogador;
		start();
	}

	public void run() {
		jd.receberGolpe(12);

	}
}
