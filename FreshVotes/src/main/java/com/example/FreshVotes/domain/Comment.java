
package com.example.FreshVotes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Comment {
    private CommentID pk;
    private String text;

    @EmbeddedId
    public CommentID getPk() {
        return pk;
    }

    public void setPk(CommentID pk) {
        this.pk = pk;
    }

    @Column(length=5000)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
