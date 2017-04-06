/**
 * 
 * @author Anderson Ribeiro
 * Representação das threads.
 */
public class Test {

	public static void main(String[] args) {
		final PlayerSoccer ps1 = new PlayerSoccer("Arda Turan", "Lateral Direito");
		final PlayerSoccer ps2 = new PlayerSoccer("Daniel Alves", "Lateral Esquerdo");

		Thread td1 = new Thread(new Runnable() {
			public void run() {
				ps1.chuta(ps2);
			}
		}, "Player Soccer 1 - Thread");

		Thread td2 = new Thread(new Runnable() {
			public void run() {
				ps2.chuta(ps1);
			}
		}, "Player Soccer 2 - Thread");

		td1.start();
		td2.start();
	}
}
