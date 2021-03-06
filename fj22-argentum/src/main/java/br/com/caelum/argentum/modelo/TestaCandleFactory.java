package br.com.caelum.argentum.modelo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestaCandleFactory {
	public static void main(String[] args){
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
		Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
		
		CandleFactory fabrica = new CandleFactory();
		Candle candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println("Abertura.....> " + candle.getAbertura());
		System.out.println("Fechamento...> " + candle.getFechamento());
		System.out.println("Minimo.......> " + candle.getMinimo());
		System.out.println("Maximo.......> " + candle.getMaximo());
		System.out.println("Volume.......> " + candle.getVolume());
	}
}
