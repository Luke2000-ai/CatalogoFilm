package com.example.CatalogoFilm;

public class Film{
    private Long id;
    private String titolo;
    private String regista;
    private int anno;
    private String genere;

    
public Film(){}

public Film(String titolo, String regista, int anno, String genere){
    this.titolo= titolo;
    this.regista= regista;
    this.anno= anno;
    this.genere=genere;
}

    public Long getId() { return id; }
    public String getTitolo() { return titolo; }
    public String getRegista() { return regista; }
    public int getAnno() { return anno; }
    public String getGenere() { return genere; }

    public void setId(Long id) { this.id = id; }
    public void setTitolo(String titolo) { this.titolo= titolo; }
    public void setRegista(String regista) { this.regista= regista; }
    public void setAnno(int anno) { this.anno= anno; }
    public void setGenere(String genere) {this.genere=genere;}

@Override
public String toString() {
    return "Film{" +
           "id=" + id +
           ", titolo='" + titolo + '\'' +
           ", regista='" + regista + '\'' +
           ", anno=" + anno +
           ", genere='" + genere + '\'' +
           '}';
}

    
}

