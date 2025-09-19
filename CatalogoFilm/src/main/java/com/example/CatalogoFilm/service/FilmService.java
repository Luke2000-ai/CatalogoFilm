package com.example.CatalogoFilm.Film;
package com.example.CatalogoFilm.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class FilmService {

    private final List<Film> catalogo = new ArrayList<>();
    private final AtomicLong sequenza = new AtomicLong(0);

   public Film create(Film nuovoFilm) {
        Long id = sequenza.incrementAndGet(); 
        nuovoStudente.setId(id);
        catalogo.add(nuovoFilm);
        return nuovoFilm;
    }
       public List<Film> getTuttiIFilm() {
        return new ArrayList<>(catalogo);
    }

    public List<Film> cercaFilm(String titolo, String genere) {
        return catalogo.stream()
                .filter(f -> (titolo == null || f.getTitolo().equalsIgnoreCase(titolo)) &&
                             (genere == null || f.getGenere().equalsIgnoreCase(genere)))
                .toList();
  }

   public Film update(Long id, Film filmAggiornato) {
        return findById(id).map(filmDaAggiornare -> {
            filmDaAggiornare.setTitolo(filmAggiornato.getTitolo());
            filmDaAggiornare.setRegista(filmAggiornato.getRegista());
            filmDaAggiornare.setAnno(filmAggiornato.getAnno());
            filmDaAggiornare.setGenere(filmAggiornato.getGenere());
            return filmDaAggiornare; 
         }).orElseThrow(() -> new NoSuchElementException("Modifica del film non aggiornato"));
    }

    public Optional<Film> findById(Long id) {
        return catalogo.stream()
                         .filter(film -> Objects.equals(film.getId(),id))
                         .findFirst(); 
    }

    public void deleteById(Long idDaEliminare) {
        boolean rimozioneFilmEffettuata = catalogo.removeIf(filmRimosso -> filmRimosso.getId().equals(idDaEliminare));

        if(!rimozioneFilmEffettuata) {
            throw new NoSuchElementException("Eleminzaione del film non effettuata!");
        }
    }



}