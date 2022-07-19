public class tester {

    public static void main(String[] args) {
      /*  PrintingServer server = new PrintingServer();
        PrintJob p = new PrintJob("hello", 7);
        server.acceptJob(p);
        p = new PrintJob("Good Morning", 3);
        server.acceptJob(p);
        p = new PrintJob("How do you do?", 8);
        p = new PrintJob("yes", 10);
        server.acceptJob(p);
        server.acceptJob(p);
        p = new PrintJob("goodbye", 1);
        server.acceptJob(p);
        server.print();
        server.print();
        p = new PrintJob("Hello again", 10);
        server.acceptJob(p);
        server.print();
        server.print();
        server.print();
        server.print();
        server.print();
        server.print();
        for (int i = 0; i < 100; i++) {
            p = new PrintJob("Hello again", 10);
            server.acceptJob(p);
            //server.print();
        }
        p = new PrintJob("yes", 10);
        server.acceptJob(p);
        //server.print();

    }*/

        PriorityQueue queue = new PriorityQueue();
        queue.insert(new PrintJob("A", 1));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("B", 2));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("C", 3));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("D", 4));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("E", 5));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("F", 6));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("G", 7));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("H", 8));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("I", 9));
        System.out.println(queue.toString() + "done");
        queue.insert(new PrintJob("J", 10));
        System.out.println(queue.toString() + "done");
        for(int i = 0 ; i < 15 ;i++) {
            queue.remove();
            System.out.println(queue.toString() + "done");
        }
        PrintingServer server = new PrintingServer();
        PrintJob p = new PrintJob("Hello", 7);
        server.acceptJob(p);
        p = new PrintJob("Good Morning", 3);
        server.acceptJob(p);
        p = new PrintJob("How do you do?", 8);
        server.acceptJob(p);
        p = new PrintJob("goodbye", 1);
        server.acceptJob(p);
        server.print();
        server.print();
        p = new PrintJob("Hello again", 10);
        server.acceptJob(p);
        server.print();
        server.print();
        server.print();
        PriorityQueue queue2 = new PriorityQueue();
        for(int i = 0 ; i<100 ; i++) {
            queue2.insert(new PrintJob("1", 1));
        }
        System.out.println(queue2.toString());
        queue2.insert(new PrintJob("2", 10));//2 shouldnt be able to there!!!!!!!will tell why in console too :)
        System.out.println(queue2.toString());
    }
}





