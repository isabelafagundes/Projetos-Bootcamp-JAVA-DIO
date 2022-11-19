import java.util.*;

public class SetOrdenacao {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{

            add(new Serie("One Piece", "Aventura", 25));
            add(new Serie("The Umbrella Academy", "Aventura", 40));
            add(new Serie("Heartstopper", "Romance", 20));

        }};

        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempEp());





    System.out.println("Ordem de inserção: ");
    //linkedHashSet são capazes de exibir pela ordem de inserção, diferente do HashSet
    Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{

        add(new Serie("One Piece", "Aventura", 20));
        add(new Serie("The Umbrella Academy", "Ação e Comédia", 40));
        add(new Serie("Heartstopper", "Romance", 20));

    }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempEp());


        System.out.println("--\tOrdem natural (Tempo ep)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempEp());





        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempEp());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempEp());


//Pra você
        System.out.println("--\tOrdem gênero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempEp());








        System.out.println("--\tOrdem Tempo Episódio\t--");

}





}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempEp;

    public Serie(String nome, String genero, Integer tempEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempEp = tempEp;
    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempEp() {
        return tempEp;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempEp='" + tempEp +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempEp.equals(serie.tempEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempEp);
    }

    @Override
    public int compareTo(Serie serie) {

        int tempEp = Integer.compare(this.getTempEp(), serie.getTempEp());
        if(tempEp != 0) return tempEp;



        return this.getGenero().compareTo(serie.getGenero());



    }


}


class ComparatorNomeGeneroTempEp implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getTempEp().compareTo(s2.getTempEp());
        if(nome != 0) return nome;


        int genero = s1.getTempEp().compareTo(s2.getTempEp());
        if(genero != 0) return genero;



        return Integer.compare(s1.getTempEp(), s2.getTempEp());



    }
}

