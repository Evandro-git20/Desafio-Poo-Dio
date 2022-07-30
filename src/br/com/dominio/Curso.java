package br.com.dominio;

public class Curso extends Conteudo {

	private double cargaHoraria;	
	
	public Curso() {

	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO*cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo =" + getTitulo() + ", descricao =" + getDescricao() + ", cargaHoraria =" + cargaHoraria + "]";
	}
	
	
}
