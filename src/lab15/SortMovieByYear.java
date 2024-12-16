package lab15;

import java.util.Comparator;

public class SortMovieByYear implements Comparator<Movie> {
    public int compare(Movie o1,Movie o2){
        if(o1.getYear()>o2.getYear())
            return 1;
        else if  (o1.getYear()<o2.getYear())
            return -1;
        else return 0;

    }
}
