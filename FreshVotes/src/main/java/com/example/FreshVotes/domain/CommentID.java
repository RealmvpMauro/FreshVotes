
package com.example.FreshVotes.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
class CommentID implements Serializable {
    private static final long serialVersionUID = -923029308;
    private User user;
    private Feature feature;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @ManyToOne
    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    
}
