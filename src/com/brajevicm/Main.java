package com.brajevicm;

public class Main {

  public static void main(String[] args) {
    User user = new User("milos");
    Post post = new Post("postTitle");
    Comment comment = new Comment("commentDesc");

    Upvote upvote = new Upvote(post);

    PostAction postAction = new PostAction(post, user);
    CommentAction commentAction = new CommentAction(comment, user);
    UpvoteAction upvoteAction = new UpvoteAction(upvote, user);

    ActionInvoker invoker = new ActionInvoker(postAction);
    invoker.invoke();

    invoker.setAction(commentAction);
    invoker.invoke();

    invoker.setAction(upvoteAction);
    invoker.invoke();

    System.out.println(user);
    System.out.println(upvote);
  }
}
