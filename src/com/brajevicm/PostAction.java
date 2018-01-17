package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class PostAction implements Action {
  private Post post;
  private User user;

  public PostAction(Post post, User user) {
    this.post = post;
    this.user = user;
  }

  @Override
  public void execute() {
    post.setUser(user);
    user.addPost(post);
  }
}
