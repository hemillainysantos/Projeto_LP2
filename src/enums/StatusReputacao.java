package enums;

/**
 * Enum responsavel pelo Status de reputacao de um usuario. 
 *
 * Projeto de Laboratorio de Progamacao 2 - 2017.1 (TT - Tracking things)
 * 
 * @author Cassio Cordeiro - 116210038
 * 		   Geovane Silva - 116211149
 * 		   Hemillainy Santos - 116210802
 *
 */
public enum StatusReputacao {
	NOOB("Noob"), CALOTEIRO("Caloteiro"), BOM_AMIGO("BomAmigo"), FREE_RYDER("FreeRyder");

	private String valor;
	
	/**
	 * Construtor do Enum.
	 * 
	 * @param valor
	 *            que representa o status de reputacao de um usuario.
	 */
	private StatusReputacao(String valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo que retorna o valor do enum. 
	 * 
	 * @return A String que representa o status de reputacao de um usuario.
	 */
	public String getValor() {
		return valor;
	}

}
