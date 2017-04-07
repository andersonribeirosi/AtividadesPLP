
/**
 * 
 * @author Anderson Ribeiro 
 * Faz algo e periodicamente informa o status do trabalho realizado.
 */

class ProcessadorThreads implements Runnable {
	private int id;

	public ProcessadorThreads(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Iniciando: " + id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Concluído: " + id);
	}

}
