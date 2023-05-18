package app.entities;

import java.util.List;

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
public class GaraDiAtletica extends Evento {

	private List<Persona> SetAtleti;
	private Persona Vincitore;

}
