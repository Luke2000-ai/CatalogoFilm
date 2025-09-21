## Autori del progetto
1. Andreozzi Luca Pietro Maria  
2. Alessandro Falchi Passeri  
3. Danilo Dalma

## Come eseguire il progetto
1. Clonare la repository:
2. Aprire il progetto con un IDE come IntelliJ o VS Code
3. Assicurarsi di avere Java 17+ e Maven installati
4. Eseguire il progetto con:
5. Testare gli endpoint con Postman o browser


## CatalogoFilm – Descrizione del progetto
- Questo progetto è un'applicazione Java fatta con Spring Boot che serve per gestire un catalogo di film. L'obiettivo è permettere all'utente di fare tutte le operazioni base: aggiungere, vedere, modificare, cercare ed eliminare dei film. Tutto funziona tramite chiamate REST (quindi si può usare Postman o anche il browser per testare).

## La classe Film è rappresentata da un ID univoco, un titolo, il nome del Regista, l'anno di uscita ed il genere.
### Funzionalità implementate nella classe Film 
- Inserimento di un nuovo film
- Visualizzazione di tutti i film
- Ricerca per titolo e genere
- Modifica dei dati di un film tramite ID
- Eliminazione di un film tramite ID
- Aggiunto il metodo toString() per facilitare il debug e la visualizzazione leggibile dei dati del film nei log.



## La classe FilmService nella cartella Service situata nel CatalogoFilm introduce nuove feature:
### Funzionalità implementate nel FilmService 
- Permette l'inserimento di un nuovo film.
- Permette la visualizzazione di tutti i film presenti nel catalogo.
- Permette la ricerca con filtro (per titolo o per genere).
- Permette la modifica dei dati di un film già presente, tramite id.
- Permette l' eliminazione di un film dal catalogo, tramite `id.

## La classe FilmController gestisce le richieste HTTP relative ai film, fungendo da punto di accesso per le operazioni esposte al client. 
## Funzionalità implementate
- Visualizzazione dell’elenco completo dei film tramite @GetMapping("/films")
- Inserimento di un nuovo film tramite @PostMapping("/films")
- Modifica dei dati di un film esistente tramite @PutMapping("/{id}")
- Eliminazione di un film tramite @DeleteMapping("/{id}")
- Ricerca dei film per titolo e genere tramite @GetMapping("/cerca") con parametri title e genere


### Primi commit inviati
* - commit che introduce e crea la classe Film 
* - secondo commit che modifica completamente la classe Film inserendo tutti gli attributi dellla classe
* - Implementazione delle classi
* - commit di modifica completa della classe Film con l'aggiunta dell'Ovveride per facilitare il debug dei log.
* - Creazione del README.md per tenere traccia delle modifiche apportate
* - commit che Introduce prima parte del service 
* - secondo commit che apporta le modifiche all FilmService.java, con l'introduzione della ricerca per titolo e dell eliminazione
del film
* - Implementazione nella classe FilmService delle funzioni CRUD
* - primo commit che introduce e crea la classe FilmController
* - secondo commit aggiunta completa delle funzioni nel FIlmController
* - Refiniture finali del README.md





