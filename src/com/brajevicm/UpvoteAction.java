package com.brajevicm;

/**
 * Project: upvote-test
 * Date: 17-Jan-18
 * Author: Milos Brajevic
 * Mail: brajevicms@gmail.com
 */
public class UpvoteAction<T> implements Action {
  private Upvote upvote;
  private T postOrComment;
  private User user;

  public UpvoteAction(Upvote upvote, T postOrComment, User user) {
    this.upvote = upvote;
    this.postOrComment = postOrComment;
    this.user = user;
  }

  public void setPostOrComment(T postOrComment) {
    this.postOrComment = postOrComment;
  }

  @Override
  public void execute() {
    upvote.setPostOrComment(postOrComment);
    upvote.setUser(user);
    if (postOrComment instanceof Post) {
      user.upvotePost((Post) postOrComment);
    } else if (postOrComment instanceof Comment) {
      user.upvoteComment((Comment) postOrComment);
    }

  }
}
