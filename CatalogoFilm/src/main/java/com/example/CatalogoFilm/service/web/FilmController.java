package com.example.CatalogoFilm.service.web;
import com.example.CatalogoFilm.Film;
import com.example.CatalogoFilm.service.FilmService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class FilmController {
    // Da aggiungere l'inserimento dei film

    @GetMapping("/tutti")
    public List<Film> getAllFilms() {
        return catalogo;
    }
}
