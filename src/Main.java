public class Main {
    public static void main(String[] args) {

        String movieName = "Seven pounds";
        System.out.println("My favorite movie is: " + movieName);

        //String movieNames = "Seven pounds";
        int yearReleased = 2008;
        String genre = "Drama";
        double imdbRating = 7.6;  // Double is used for IMDb rating for precision
        boolean isPartOfSeries = false;
        char directorInitial = 'M';  // Director: Gabriele Muccino

        // Print the movie details
        System.out.println("Movie Name: " + movieName + "Year released");
        System.out.println("Year Released: " + yearReleased);
        System.out.println("Genre: " + genre);
        System.out.println("IMDb Rating: " + imdbRating);
        System.out.println("Part of a Series: " + isPartOfSeries);
        System.out.println("Director's Last Name Initial: " + directorInitial);

        System.out.print("Movie Name: " + movieName + "\n"
                + "Year Released: " + yearReleased + "\n"
                + "Genre: " + genre + "\n"
                + "IMDb Rating: " + imdbRating + "\n"
                + "Part of a Series: " + isPartOfSeries + "\n"
                + "Director's Last Name Initial: " + directorInitial);



        // A database of movies in SQL (Structure Query Language);
        // SELECT *
        // FROM MOVIES; PRINT all the Movies

        //An array is a list to store multiple values (movietitles);
        //Same data type so only strings, no numbers"
        String[] movieNames = {"Seven Pounds", "Interstellar", "Inception"};
        int[] movieYears ={2008,2009,2010};

        String movieName1 = "Seven Pounds";
        String movieName2 = "Brian Vega-Solano Powers";

        //Write down your 3 favorite genres
        String[] favoriteGenres = {"Action", "Comedy", "Animated"};
        System.out.println("First movie" + movieNames[0]); //Action first item in my array
        System.out.println("First movie" + movieNames); //last item in my array
        System.out.println("First movie" + movieNames[1]); //Comedy
    }
}