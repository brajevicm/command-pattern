package com.brajevicm;

/**
 * Project: command-pattern
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class Upvote<T> {
  private int numberOfUpvotes = 0;
  private T postOrComment;
  private User user;

  public Upvote(T postOrComment) {
    this.postOrComment = postOrComment;
    numberOfUpvotes++;
  }

  public void setPostOrComment(T postOrComment) {
    this.postOrComment = postOrComment;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Upvote{" +
      "numberOfUpvotes=" + numberOfUpvotes +
//      ", postOrComment=" + postOrComment +
      '}';
  }
}
