package com.brajevicm;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class User {
  private String username;
  private List<Post> posts = new ArrayList<>();
  private List<Comment> comments = new ArrayList<>();
  private List<Post> upvotedPosts = new ArrayList<>();
  private List<Comment> upvotedComments = new ArrayList<>();

  public User(String username) {
    this.username = username;
  }

  public void addPost(Post post) {
    posts.add(post);
  }

  public void addComments(Comment comment) {
    comments.add(comment);
  }

  public void upvotePost(Post upvote) {
    upvotedPosts.add(upvote);
  }

  public void upvoteComment(Comment upvote) {
    upvotedComments.add(upvote);
  }

  @Override
  public String toString() {
    return "User{" +
      "username='" + username + '\'' +
      ", posts=" + posts +
      ", comments=" + comments +
      ", upvotedPosts=" + upvotedPosts +
      ", upvotedComments=" + upvotedComments +
      '}';
  }
}
