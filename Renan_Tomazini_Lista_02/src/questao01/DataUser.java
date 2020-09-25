package questao01;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.Period;

public class DataUser {
	


	private LocalDate dataEspecificada;

	public  DataUser(int dia,int mes,int ano) {
		dataEspecificada = LocalDate.of(ano, mes, dia);
		
	}

	public LocalDate getDataEspecificada() {
		return dataEspecificada;
	}
	
	public long getDiasPraHoje() {
		//int dias_passado;
		LocalDate dataHoje = LocalDate.now();
		//Period  periodo = Period.between(dataEspecificada , dataHoje);
		Duration dias = Duration.between(dataEspecificada.atStartOfDay(),dataHoje.atStartOfDay());
		return dias.toDays();
		
	
	}
	
	public String soma() {
		LocalDate dataEspecificadaNova = dataEspecificada.plusDays(110);
		String resultado = dataEspecificadaNova.toString();
		return resultado;
	}
	
	public String agosto() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate agosto = dataEspecificada.withMonth(8);
		String resultado = agosto.format(formatter);
		//String resultado = agosto.toString();
		return resultado;
	}
	
	public int qtdDiaUtil(DataUser inicio, DataUser fim) {
		LocalDate cont = inicio.getDataEspecificada();
		LocalDate cont2 = fim.getDataEspecificada();
		int diasUteis = 0;
		while(cont.compareTo(cont2) != 0){
			if(cont.getDayOfWeek().getValue() != 1 && cont.getDayOfWeek().getValue() != 7){
				//System.out.println(dia.getValue());
				diasUteis++;
			}

			cont = cont.plusDays(1);
		}
		return diasUteis;
		
	}
	
	
	
	}
