
public class Main {
	
	public static void main(String[] args) {
		
		Jogador jogador = new Jogador();
		
		ThreadUm td1 = new ThreadUm(jogador);
		ThreadDois td2 = new ThreadDois(jogador);
		
		
	}

}
