package assignment12;

import java.util.ArrayList;

public class News implements Inews{
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public  String content;
    public double averageRate;
    ArrayList<Integer> rateList;

    public News(int id,String title,String publishDate,String author,String content,float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        rateList = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getAverageRate() {
        return averageRate;
    }
    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+this.getTitle());
        System.out.println("PublishDate:"+this.getPublishDate());
        System.out.println("Author:"+this.getAuthor());
        System.out.println("Content: "+this.getContent());
        System.out.println("AverageRate:"+this.getAverageRate());
    }

    public void calculate() {
        double total = 0;
        for(Integer i: rateList){
            total +=i;
        }
        averageRate = total/rateList.size();
    }
    public void inputRate(int star) {
        if(star >= 0 && star <=5){
            rateList.add(star);
            calculate();
            return;
        }
    }
}
