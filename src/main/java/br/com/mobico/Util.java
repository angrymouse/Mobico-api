package br.com.mobico;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class Util {
	public Timestamp getCurrentTimestamp() {
		return new Timestamp(new Date().getTime());
	}
	
	public boolean unwrapBoolean(Boolean bool) {
		return bool == null ? false : bool.booleanValue();
	}
	
	public <T extends Object> Optional<T> optionalOf(T obj){
		if(obj == null) return Optional.empty();
		else return Optional.of(obj);
	}
	
	/*Retorna Optional do valor caso a variável de teste seja verdadeira
	 * retorna Optional.empty() no contrário*/
	public <T extends Object> Optional<T> optionalIfTrue(T value, boolean test) {
		return test ? optionalOf(value) : Optional.empty();
	}
	
	public Timestamp getTimestamp(OffsetDateTime offsetDateTime) {
		return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
	}
}
