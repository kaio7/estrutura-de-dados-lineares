public class No{
	private Object valor;
	private No prox; 

	public No(){}

	public Object getValor(){return valor;}
	public void setValor(Object valor){
		this.valor = valor; 
	}
	public No getProx(){return prox;}
	public void setProx(No prox){
		this.prox = prox;
	}
}
