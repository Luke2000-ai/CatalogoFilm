package com.example.CatalogoFilm.web;
import com.example.CatalogoFilm.Film;
import com.example.CatalogoFilm.service.FilmService;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.net.URI;


@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmService service;

    public FilmController(FilmService service) {
        this.service = service;
    }

    @GetMapping
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
            
            return ResponseEntity.created(URI.create("/films"+ filmCreato.getId()))
                                 .body(filmCreato);
    } 

    @PutMapping("/{id}")
    public ResponseEntity<Film> update(@PathVariable Long id, @RequestBody Film body) {
        Film filmAggiornato = service.update(id, body);
        return ResponseEntity.ok().body(filmAggiornato); 
    }

    @GetMapping("/cerca")
public List<Film> cercaFilm(@RequestParam(required = false) String titolo,
                            @RequestParam(required = false) String genere) {
    return service.cercaFilm(titolo, genere);
     }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
