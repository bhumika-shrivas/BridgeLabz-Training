package com.linkedlist.doublylinkedlist.moviemanagement;

class MovieList 
{
	private MovieNode head, tail;
	
	void addAtBeginning(MovieNode node)
	{
		if (head == null)
		{
			head = tail = node;
		}
		else
		{
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	
	void addAtEnd(MovieNode node)
	{
		if (tail == null)
		{
			head = tail = node;
		}
		else
		{
			tail.next = node;
			tail.prev = tail;
			tail = node;
		}
	}
	
	void addAtPosition(int pos, MovieNode node)
	{
		if (pos ==1)
		{
			addAtBeginning(node);
			return;
		}
		MovieNode temp = head;
		for (int i =1; i < pos -1 && temp != null; i++)
			temp = temp.next;
		
		if (temp == null || temp.next == null)
		{
			addAtEnd(node);
			return;
		}
		
		node.next = temp.next;
		node.prev = temp;
		temp.next.prev = node;
		temp.next = node;
	}
	
	void deleteByTitle(String title)
	{
		MovieNode temp = head;
		while (temp != null)
		{
			if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                System.out.println("Movie deleted");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found");
    }

    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found");
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    private void print(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " +
                           m.year + " | Rating: " + m.rating);
    }
}
