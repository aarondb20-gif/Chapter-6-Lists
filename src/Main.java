public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Hit Baby One more time","Britney Spears",3);
        Song song2 = new Song("Smells Like Teen Spirit", "Nirvana", 4);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", 6);
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(song1);
        list.addLast(song2);
        list.addLast(song2);
        list.display();
    }
}
