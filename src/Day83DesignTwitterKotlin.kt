package com.interview.daily

import java.util.PriorityQueue

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
class Twitter {

    private inner class Tweet(val id: Int) {
        val time: Int = timestamp++
        var next: Tweet? = null
    }

    private inner class User(val id: Int) {
        val followed: MutableSet<Int> = mutableSetOf()
        var tweetHead: Tweet? = null

        init {
            follow(id)
        }

        fun follow(id: Int) {
            followed.add(id)
        }

        fun unfollow(id: Int) {
            followed.remove(id)
        }

        fun post(id: Int) {
            val t = Tweet(id)
            t.next = tweetHead
            tweetHead = t
        }
    }

    private val userMap: MutableMap<Int, User> = mutableMapOf()

    fun postTweet(userId: Int, tweetId: Int) {
        // TODO: Implement this method
    }

    fun getNewsFeed(userId: Int): List<Int> {
        // TODO: Implement this method
        return emptyList()
    }

    fun follow(followerId: Int, followeeId: Int) {
        // TODO: Implement this method
    }

    fun unfollow(followerId: Int, followeeId: Int) {
        // TODO: Implement this method
    }

    companion object {
        private var timestamp = 0
    }
}

fun main() {
    val twitter = Twitter()
    twitter.postTweet(1, 5)
    println("News Feed 1: ${twitter.getNewsFeed(1)}")
    twitter.follow(1, 2)
    twitter.postTweet(2, 6)
    println("News Feed 1: ${twitter.getNewsFeed(1)}")
    twitter.unfollow(1, 2)
    println("News Feed 1: ${twitter.getNewsFeed(1)}")

    // Expected Output:
    // News Feed 1: [5]
    // News Feed 1: [6, 5]
    // News Feed 1: [5]
}

/*
// Solution Implementation

fun postTweet(userId: Int, tweetId: Int) {
    userMap.getOrPut(userId) { User(userId) }.post(tweetId)
}

fun getNewsFeed(userId: Int): List<Int> {
    val user = userMap[userId] ?: return emptyList()
    val q = PriorityQueue<Tweet>(compareByDescending { it.time })
    user.followed.mapNotNull { userMap[it]?.tweetHead }.forEach { q.add(it) }
    val res = mutableListOf<Int>()
    while (q.isNotEmpty() && res.size < 10) {
        val t = q.poll()
        res.add(t.id)
        t.next?.let { q.add(it) }
    }
    return res
}

fun follow(followerId: Int, followeeId: Int) {
    userMap.getOrPut(followerId) { User(followerId) }
    userMap.getOrPut(followeeId) { User(followeeId) }
    userMap[followerId]!!.follow(followeeId)
}

fun unfollow(followerId: Int, followeeId: Int) {
    if (followerId !in userMap || followerId == followeeId) return
    userMap[followerId]!!.unfollow(followeeId)
}
*/
