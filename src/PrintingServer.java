public class PrintingServer {
    private PriorityQueue priority; // create property of type PriorityQueue

    public PrintingServer() { //default Constructor that create object of the PriorityQueue
        this.priority = new PriorityQueue();
    }

    public void acceptJob(PrintJob p) { // insert object into the PriorityQueue
        this.priority.insert(p); // call the mthod
    }

    public void print() {
        PrintJob p; //create an object from print job
        p = (PrintJob) this.priority.remove(); // return the element with the most priority and to casting to print job object
        if (p != null) { // check if he is not null
            System.out.println(p.getText()); // print the text of the element
        }
    }

}
