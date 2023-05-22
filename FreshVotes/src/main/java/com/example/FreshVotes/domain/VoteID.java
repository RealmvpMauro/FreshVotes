package com.example.FreshVotes.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;


@Embeddable
public class VoteID implements Serializable{

    private static final long serialVersionUID = 8927102781380223L;
    private User users;
    private Feature feature;

    @ManyToOne
    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    @ManyToOne
    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    
}
