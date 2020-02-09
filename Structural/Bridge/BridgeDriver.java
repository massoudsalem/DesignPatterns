package Structural.Bridge;

import java.text.Normalizer;

public class BridgeDriver {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action, Drama, Sci-Fi");
        movie.setTitle("Snowpiercer");
        movie.setRuntime("02:06");
        movie.setYear("2013");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printed = moviePrinter.print(printFormatter);

        System.out.println(printed);

        Formatter htmlFormatter = new HtmlFormatter();

        printed = moviePrinter.print(htmlFormatter);

        System.out.println(printed);
    }
}
