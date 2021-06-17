package com.day4.sort;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie>
	{
	    public int compare(Movie m1, Movie m2)
	    {
	        if (m1.getRating() < m2.getRating()) return -1;
	        if (m1.getRating() > m2.getRating()) return 1;
	        else return 0;
	    }
	}
