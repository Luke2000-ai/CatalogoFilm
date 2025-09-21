package com.example.CatalogoFilm.web;
import com.example.CatalogoFilm.Film;
import com.example.CatalogoFilm.service.FilmService;

import java.net.URI;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/films")
public class FilmController{
    private final FilmService service;

    public FilmController(FilmService service){
        this.service=service;
    }

    


    @GetMapping("/tutti")
    public List<Film> getAll() {
        return service.getTuttiIFilm();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getById(@PathVariable Long id) {
        return service.findById(id)
            .map(ResponseEntity::ok) 
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Film> create(@RequestBody Film body) {
        Film filmCreato = service.create(body);
        return ResponseEntity.created(URI.create("/films"+filmCreato.getId()))
                                 .body(filmCreato);
    }

    @GetMapping("/cerca")
    public List<Film> cercaFilm(@RequestParam (required=false)) String titolo,
    @RequestParam(required=false)String genere{
        return service.cercaFilm(titolo, genere);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Film> update(@PathVariable Long id, @RequestBody Film body){
        Film filmAggiornato = service.update(id, body);
        return ResponseEntity.ok().body(filmAggiornato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
