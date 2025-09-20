package com.example.CatalogoFilm.service;

import com.example.CatalogoFilm.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmService {

    private List<Film> catalogo = new ArrayList<>();
    private int nextId = 1;

    public Film aggiungiFilm(Film film) {
        film.setId(nextId++);
        catalogo.add(film);
        return film;
    }

    public List<Film> getTutti() {
        return catalogo;
    }

    public Film getById(int id) {
        Optional<Film> film = catalogo.stream()
                .filter(f -> f.getId() == id)
                .findFirst();
        return film.orElse(null);
    }

    public Film aggiornaFilm(int id, Film filmAggiornato) {
        for (Film film : catalogo) {
            if (film.getId() == id) {
                film.setTitolo(filmAggiornato.getTitolo());
                film.setRegista(filmAggiornato.getRegista());
                film.setAnno(filmAggiornato.getAnno());
                return film;
            }
        }
        return null;
    }

       public String eliminaFilm(int id) {
        boolean rimosso = catalogo.removeIf(f -> f.getId() == id);
        return rimosso ? "Film eliminato" : "Film non trovato";
    }

    public List<Film> cercaPerTitolo(String titolo) {
        return catalogo.stream()
                .filter(f -> f.getTitolo().toLowerCase().contains(titolo.toLowerCase()))
                .collect(Collectors.toList());
    }

 
}