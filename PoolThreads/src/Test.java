
/**
 * 
 * @author Anderson Ribeiro
 * Classe onde testamos nosso Pool de Threads
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(2);

		//É executada uma thread por vez
		for (int i = 0; i < 5; i++) {
			exe.submit(new ProcessadorThreads(i));

		}

		exe.shutdown();

		System.out.println("Tarefas enviadas com sucesso");

		try {
			exe.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Tarefas concluídas com sucesso");
	}

}
