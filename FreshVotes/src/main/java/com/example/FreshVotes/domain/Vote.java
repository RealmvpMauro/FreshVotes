package com.example.FreshVotes.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity

public class Vote {
    
    private VoteID pk;
    private Boolean upvote;

    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }
    
    @EmbeddedId
    
    public VoteID getPk() {
        return pk;
    }

    public void setPk(VoteID pk) {
        this.pk = pk;
    }
    
}
