package app;

import java.util.Date;
import java.util.GregorianCalendar;

import app.dao.EventoDAO;
import app.dao.LocationDAO;
import app.dao.PartecipazioneDAO;
import app.dao.PersonaDAO;
import app.entities.Evento;
import app.entities.Location;
import app.entities.Partecipazione;
import app.entities.Persona;
import app.entities.Sesso;
import app.entities.StatoPartecipazione;
import app.entities.TipoEvento;

public class Exercise {

	public static void main(String[] args) {

		Location location = saveLocation();
		Evento evento = saveEvento(location);
		Persona persona = savePersona();

		Partecipazione partecipazione = savePartecipazione(evento, persona);

	}

	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(StatoPartecipazione.CONFERMATA);

		PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
		partecipazioneDAO.save(part);
		return part;
	}

	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("Mario");
		per.setCognome("Rossi");
		per.setEmail("m.rossi@google.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDataDiNascita(new GregorianCalendar(1980, 9, 23).getTime());
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}

	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Firenze");
		loc.setNome("Stadio Franchi");

		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}

	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setDataEvento(new Date());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di coppa");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);

		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}

}