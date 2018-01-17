package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class CommentAction implements Action {
  private Comment comment;
  private User user;

  public CommentAction(Comment comment, User user) {
    this.comment = comment;
    this.user = user;
  }

  @Override
  public void execute() {
    comment.setUser(user);
    user.addComments(comment);
  }
}
