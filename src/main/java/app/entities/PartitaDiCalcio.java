package app.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class PartitaDiCalcio extends Evento {
	private String SquadraDiCasa;
	private String SquadraOspite;
	private String SquadraVincente;
	private Integer GolSquadraCasa;
	private Integer GolSquadraOspite;

}
