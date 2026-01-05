package com.linkedlist.singlylinkedlist.socialmedia;

class SocialNetwork {
    private UserNode head;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    // Find user by ID
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Find user by name
    void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printUser(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("User not found");
    }

    // Add friend connection (bidirectional)
    void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends = addFriendNode(u1.friends, id2);
        u2.friends = addFriendNode(u2.friends, id1);
        System.out.println("Friend connection added");
    }

    private FriendNode addFriendNode(FriendNode head, int id) {
        FriendNode node = new FriendNode(id);
        node.next = head;
        return node;
    }

    // Remove friend connection
    void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends = removeFriendNode(u1.friends, id2);
        u2.friends = removeFriendNode(u2.friends, id1);
        System.out.println("Friend connection removed");
    }

    private FriendNode removeFriendNode(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display friends of user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Mutual friends
    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found) System.out.print("None");
        System.out.println();
    }

    // Count friends
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void printUser(UserNode u) {
        System.out.println(
            "ID: " + u.userId +
            ", Name: " + u.name +
            ", Age: " + u.age
        );
    }
}
