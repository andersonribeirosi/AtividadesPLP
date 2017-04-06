/**
 * 
 */

/**
 * @author Anderson Ribeiro
 *
 */
public class PlayerSoccer {
	String nome;
	String posicao;

	public PlayerSoccer(String nome, String posicao) {
		this.nome = nome;
		this.posicao = posicao;
	}

	public synchronized void chuta(PlayerSoccer adv) {
		PlayerSoccer ps = this;
		System.out.println(ps.nome + "( " + ps.posicao + " )" + ": chutou para " + adv.nome);
		adv.chutaDeVolta(ps);
	}

	public synchronized void chutaDeVolta(PlayerSoccer adv) {
		PlayerSoccer ps = this;
		System.out.println(ps.nome + "( " + ps.posicao + " )" + ": chutou de volta para " + adv.nome);
	}

}
