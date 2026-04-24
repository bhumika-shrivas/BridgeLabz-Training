package com.linkedlist.singlylinkedlist.socialmedia;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;   // list of friend IDs
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
