package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class Post {
  private String title;
  private User user;

  public Post(String title) {
    this.title = title;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Post{" +
      "title='" + title + '\'' +
//      ", user=" + user +
      '}';
  }
}
