package practice23_24.parser_html;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ParserHTML {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.mirea.ru").get();
            Elements elements = document.select("img");
            for (Element el: elements){
                String link = el.attr("abs:src");
                if (!link.equals("") &&
                        (link.contains("jpg") ||
                        link.contains("jpeg") ||
                        link.contains("png") ||
                        link.contains("svg") ||
                        link.contains("webp") ||
                        link.contains("gif")
                )) {
                    System.out.println(link);

                    String name = link.substring(link.lastIndexOf("/") + 1);
                    URL url = new URL(link);
                    InputStream in = url.openStream();

                    Files.copy(in, Paths.get("D:\\Programming\\IDEA\\mirea\\src\\practice_23_24\\parser_html\\img\\" + name), StandardCopyOption.REPLACE_EXISTING);
                    in.close();
                }
            }
        }catch (Exception e){

        }
    }
}
