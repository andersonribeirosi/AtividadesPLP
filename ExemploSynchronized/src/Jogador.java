/**
 * 
 */

/**
 * @author Anderson Ribeiro
 *
 */
public class Jogador {

	int vida;
	int cura;

	Jogador() {
		vida = 10;
		cura = 5;
	}

	synchronized void receberGolpe(int golpe) {
		vida -= golpe;

		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		vida += cura;

	}

	synchronized boolean jogadorMorto() {
		return (vida <= 0);
	}
}
