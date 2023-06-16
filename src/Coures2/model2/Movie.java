package Coures2.model2;

public class Movie {
    private String title;
    private String director;
    private String year;
    private String country;

    public Movie(){ }

    public Movie(String title, String director, String year, String country) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
