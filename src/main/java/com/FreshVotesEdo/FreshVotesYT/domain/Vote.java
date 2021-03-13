/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FreshVotesEdo.FreshVotesYT.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Dell
 */
@Entity
public class Vote {

    private VoteId pk;

    @EmbeddedId
    public VoteId getPk() {
        return pk;
    }

    public void setPk(VoteId pk) {
        this.pk = pk;
    }
    private Boolean upvote;

    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }

}
