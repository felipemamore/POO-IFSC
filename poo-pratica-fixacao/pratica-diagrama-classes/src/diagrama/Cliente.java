package diagrama;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	
	private Integer nrConta;
	private Double saldo;
	
	public Cliente(String nome, LocalDate dataNasc, String email, Integer nrConta, Double saldo) {
		super.setNome(nome);
		super.setDataNasc(dataNasc);
		super.setEmail(email);
		this.nrConta = nrConta;
		this.saldo = saldo;
		
	}
	



	public Integer getNrConta() {
		return nrConta;
	}
	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
		
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
		
	}
	
	
	
	
	public Double sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo=-valor;
			}
		else {
			System.out.println("Saldo insuficiente !");
		}
		 
		
		
		return valor;
		
	}
	
	
	
	public Double mostrarSaldo() {
		return this.saldo;
		
	}
	
	
	
	

}
