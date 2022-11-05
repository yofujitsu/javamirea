package practice25_26;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Station{
    private int number;
    private String name;

    public Station(int number, String name) {
        this.number = number;
        this.name = name;
    }
}

class Line{
    private String number;
    private String name;

    public Line(String number, String name) {
        this.number = number;
        this.name = name;
    }
}

public class ParserJSON {
    public static void main(String[] args){
        String path = "C:\\Users\\sesa7\\IdeaProjects\\test\\src\\practice25_26\\file.json";
        String data = "";
        Gson gson = new Gson();
        ArrayList<Station> stations = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        try {
            Document document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
            Elements stationsData = document.select("p");
            Elements linesData = document.select("span");
            for (Element el: stationsData){
                Pattern pattern = Pattern.compile("\\d+[.]\\s[^a-zA-Z]+");
                Matcher matcher = pattern.matcher(el.text());
                if (matcher.matches()){
                    int number = Integer.parseInt(el.text().split(". ")[0]);
                    String name = el.text().split(". ")[1];
                    Station station = new Station(number, name);
                    stations.add(station);
                    System.out.println(el.text());
                }
            }
            for (Element el: linesData) {
                if (!el.attr("data-line").isEmpty()) {
                    Line line = new Line(el.attr("data-line"), el.text());
                    lines.add(line);
                    System.out.println(el.text());
                }
            }
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll(stations);
            arrayList.addAll(lines);
            data = gson.toJson(arrayList);
//            data += gson.toJson(stations);
//            data += gson.toJson(lines);

        }catch (Exception e){

        }
        try(PrintWriter out = new PrintWriter(new FileWriter(path))){
            out.write(data);
        }catch (Exception e){

        }
    }
}
