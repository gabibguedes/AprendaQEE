package src.model;

import java.util.List;

public class FluxoDePotenciaFundamental {
	double amplitudeTensao, amplitudeCorrente, anguloTensao, anguloCorrente;
	double potAtiva, potReativa, potAparente, fatPotencia;
	List<Double> pontosGrafico;
	
	public FluxoDePotenciaFundamental(double amplitudeTensao, double amplitudeCorrente,
			double anguloTensao, double anguloCorrente) {
		this.amplitudeTensao = amplitudeTensao;
		this.amplitudeCorrente = amplitudeCorrente;
		this.anguloTensao = anguloTensao;
		this.anguloCorrente = anguloCorrente;
		
	}
	
	public double calcularPotAtiva() {
		potAtiva = amplitudeTensao * amplitudeCorrente * Math.cos(anguloTensao - anguloCorrente);
		return potAtiva;
	}
	
	public double calcularPotReativa() {
		potReativa = amplitudeTensao * amplitudeCorrente * Math.sin(anguloTensao - anguloCorrente);
		return potReativa;
	}
	
	public double calcularPotAparente() {
		potAparente = amplitudeTensao * amplitudeCorrente;
		return potAparente;
	}
	
	public double calcularFatPotencia() {
		if(anguloTensao == anguloCorrente) {
			fatPotencia = 1;
		}else {
			fatPotencia = Math.cos(anguloTensao - anguloCorrente);
		}
		return fatPotencia;
	}
}