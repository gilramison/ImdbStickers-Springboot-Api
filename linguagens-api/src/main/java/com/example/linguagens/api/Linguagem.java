package com.example.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "linguagens_tb")
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public Linguagem(){}
    
    public Linguagem(String image, int ranking,String title) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }

    public String getId() {
        return id;
    }


    
}
