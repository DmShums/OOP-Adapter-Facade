package org.example.task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        // Uncomment the following lines if you want to make an HTTP connection using HttpURLConnection
//        String API_KEY = "";
//        URL url = new URL("https://lnup.edu.ua"); // no firewall(cloudfront)
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("GET");
////        connection.setRequestProperty("X-Api-Key", API_KEY);
//        connection.connect();
//        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
//        System.out.println(text);

        // Use JSoup to connect to a Wikipedia page and extract information
        String url = "https://en.wikipedia.org/";
        Document doc = Jsoup.connect(url).get();
        System.out.println(doc.title());

//        Elements newsHeadlines = doc.select("#mp-itn b a");
//        for (Element headline : newsHeadlines) {
//            System.out.printf("%s\n\t%s\n",
//                    headline.attr("title"), headline.absUrl("href"));
//        }

        Document document = Jsoup.connect(url).get();

        // Get website name from title tag
        String name = document.title();
        System.out.println("Name: " + name);

        // Get website description from meta tag
        String description = String.valueOf(document.select("#mp-free").first());
        System.out.println("Description: " + description);

        // Get website logo from img tag
        Element logoElement = document.select("img").first();
        if (logoElement != null) {
            String logoUrl = logoElement.absUrl("src");
            System.out.println("Logo URL: " + logoUrl);
        } else {
            System.out.println("No logo found");
        }
    }

    // Replace this method with your actual logger implementation
    private static void log(String format, Object... args) {
        System.out.printf(format, args);
    }


}
