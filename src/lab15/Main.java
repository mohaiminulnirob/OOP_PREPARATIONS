package lab15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie(2014,7,"Intersteller",120));
        movies.add(new Movie(2012,6,"Intersteller",120));
        movies.add(new Movie(2013,8,"Intersteller",120));
        //Collections.sort(movies, new SortMovieByYear());
        Collections.sort(movies,(m1,m2)->m2.getRating()- m1.getRating());
        for(Movie m: movies){
            System.out.println(m.getYear());
        }
    }

}
//collection framework
//operator overloading
//comparable,comparator interface (sorting through these interface)
//stream API(functions: forEach(),map(),reduce() functions)
//processing collection
//pipeline
//storage usage reduction
//use of the map and reduce functions
//thread

