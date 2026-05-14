package com.interview.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Interview Question:
 * How would you design a simplified version of Twitter?
 *
 * Explanation:
 * - Users can post tweets.
 * - Users can follow/unfollow other users.
 * - Users can see the 10 most recent tweets in their news feed.
 * - This involves designing data structures to store tweets and follow relationships.
 */

public class Day83DesignTwitter {

    /**
     * Problem Description:
     * Design a simplified version of Twitter where users can post tweets, follow/unfollow another user and is able to see the 10 most recent tweets in the user's news feed.
     * Implement the Twitter class:
     * - Twitter() Initializes your twitter object.
     * - void postTweet(int userId, int tweetId) Composes a new tweet with ID tweetId by the user userId. Each call to this function will be made with a unique tweetId.
     * - List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user themself. Tweets must be ordered from most recent to least recent.
     * - void follow(int followerId, int followeeId) The user with ID followerId started following the user with ID followeeId.
     * - void unfollow(int followerId, int followeeId) The user with ID followerId started unfollowing the user with ID followeeId.
     *
     * Example:
     * Twitter twitter = new Twitter();
     * twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
     * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
     * twitter.follow(1, 2);    // User 1 follows user 2.
     * twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
     * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
     * twitter.unfollow(1, 2);  // User 1 unfollows user 2.
     * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
     */

    static class Twitter {
        private static int timestamp = 0;
        private Map<Integer, User> userMap;

        private class Tweet {
            public int id;
            public int time;
            public Tweet next;

            public Tweet(int id) {
                this.id = id;
                time = timestamp++;
                next = null;
            }
        }

        private class User {
            public int id;
            public Set<Integer> followed;
            public Tweet tweetHead;

            public User(int id) {
                this.id = id;
                followed = new HashSet<>();
                follow(id); // Follow self
                tweetHead = null;
            }

            public void follow(int id) {
                followed.add(id);
            }

            public void unfollow(int id) {
                followed.remove(id);
            }

            public void post(int id) {
                Tweet t = new Tweet(id);
                t.next = tweetHead;
                tweetHead = t;
            }
        }

        public Twitter() {
            userMap = new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            // TODO: Implement this method
        }

        public List<Integer> getNewsFeed(int userId) {
            // TODO: Implement this method
            return new ArrayList<>();
        }

        public void follow(int followerId, int followeeId) {
            // TODO: Implement this method
        }

        public void unfollow(int followerId, int followeeId) {
            // TODO: Implement this method
        }
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        System.out.println("News Feed 1: " + twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println("News Feed 1: " + twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        System.out.println("News Feed 1: " + twitter.getNewsFeed(1));

        // Expected Output:
        // News Feed 1: [5]
        // News Feed 1: [6, 5]
        // News Feed 1: [5]
    }
}

/*
// Solution Implementation

public void postTweet(int userId, int tweetId) {
    if (!userMap.containsKey(userId)) {
        userMap.put(userId, new User(userId));
    }
    userMap.get(userId).post(tweetId);
}

public List<Integer> getNewsFeed(int userId) {
    List<Integer> res = new ArrayList<>();
    if (!userMap.containsKey(userId)) return res;

    Set<Integer> users = userMap.get(userId).followed;
    PriorityQueue<Tweet> q = new PriorityQueue<>(users.size(), (a, b) -> (b.time - a.time));
    for (int user : users) {
        Tweet t = userMap.get(user).tweetHead;
        if (t != null) {
            q.add(t);
        }
    }
    int n = 0;
    while (!q.isEmpty() && n < 10) {
        Tweet t = q.poll();
        res.add(t.id);
        n++;
        if (t.next != null) {
            q.add(t.next);
        }
    }
    return res;
}

public void follow(int followerId, int followeeId) {
    if (!userMap.containsKey(followerId)) {
        userMap.put(followerId, new User(followerId));
    }
    if (!userMap.containsKey(followeeId)) {
        userMap.put(followeeId, new User(followeeId));
    }
    userMap.get(followerId).follow(followeeId);
}

public void unfollow(int followerId, int followeeId) {
    if (!userMap.containsKey(followerId) || followerId == followeeId) {
        return;
    }
    userMap.get(followerId).unfollow(followeeId);
}
*/
