package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class UpvoteAction implements Action {
  private Upvote upvote;
  private User user;

  public UpvoteAction(Upvote upvote, User user) {
    this.upvote = upvote;
    this.user = user;
  }

  public void setUpvote(Upvote upvote) {
    this.upvote = upvote;
  }

  @Override
  public void execute() {
    upvote.setUser(user);


    if (upvote.getPostOrComment() instanceof Post) {
      user.upvotePost((Post) upvote.getPostOrComment());
    } else if (upvote.getPostOrComment() instanceof Comment) {
      user.upvoteComment((Comment) upvote.getPostOrComment());
    }

  }
}
