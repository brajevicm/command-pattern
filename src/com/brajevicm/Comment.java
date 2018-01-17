package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class Comment {
  private String description;
  private User user;

  public Comment(String description) {
    this.description = description;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Comment{" +
      "description='" + description + '\'' +
//      ", user=" + user +
      '}';
  }
}
