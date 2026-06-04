
//Write a program to create a class MOVIE with attributes name and genre. Write the movies with genre
//  comedy on COM.DAT file.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Creating class Movie
class Movie {
    String name;
    String genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
}

public class movieClass {
    public static void main(String[] args) {

        Movie[] movies = {
            new Movie("3 Idiots", "Comedy"),
            new Movie("Titanic", "Romance"),
            new Movie("Golmaal", "Comedy"),
            new Movie("Avengers", "Action")
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("COM.DAT"))) {

            for (Movie movie : movies) {
                if (movie.genre.equalsIgnoreCase("Comedy")) {
                    writer.write("Name: " + movie.name);
                    writer.newLine();

                    writer.write("Genre: " + movie.genre);
                    writer.newLine();
                    writer.newLine();
                }
            }

            System.out.println("Comedy movies written to COM.DAT successfully.");

        } catch (IOException e) {
            System.out.println("Error making file.");
        }
    }
}