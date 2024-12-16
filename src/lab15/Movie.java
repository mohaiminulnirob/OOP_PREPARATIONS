package lab15;

public class Movie implements Comparable<Movie>{
    private int year;

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Movie(int year, int rating, String title, double duration) {
        this.year = year;
        this.rating = rating;
        this.title = title;
        this.duration = duration;
    }

    private int rating;
    private String title;
    private double duration;
    public int compareTo(Movie movie){
        if(this.year> movie.year) return 1;
        else return 0;
    }

}
//model class

