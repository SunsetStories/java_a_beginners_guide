/*
 * This project creates a queue class for characters
 * Accessing elements in a queue follows the FIFO order.
 * A queue support two basic operations: put and get. They are consumptive and a queue can get full / empty. 
 */
class Queue {
    char[] q; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch){
        if (putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// Demonstrate the Queue class
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers into bigQ
        for(i=0; i<26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display lements from bigQ
        for (i=0; i< 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for (i=0; i<5; i++){
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i=0; i<5; i++) {
            ch = smallQ.get();
            if (ch != (char)0) System.out.print(ch);
        }
    }
}