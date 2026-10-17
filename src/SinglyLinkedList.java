public class SinglyLinkedList {
    private Node head;

    private static class Node {
        Node next;
        Song song;

        Node(Song song) {
            this.song = song;
            this.next = null; // New node initially points to nothing
        }
    }


    public void addFirst(Song song) {
        Node newNode = new Node(song);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(Song song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
            return;
        }


        Node current = head;
        while (current.next != null) {
            current = current.next;
        }


        current.next = newNode;
    }

    public void removeSong(Song song) {
        if (head == null) return;

        if (head.song == song) {
            head = head.next;
            return;
        }
        Node current = head;

        while (current.next != null && current.next.song != song) {
            current = current.next;
        }


        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.song + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
