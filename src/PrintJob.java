public class PrintJob implements Prioritizeable{
    private String text; // property of text to print of object
    private int priority; // The property of the priority of text between all the printing job

    public PrintJob(String text , int priority){ // Constructor that get priority of text and the text to print
        if(priority >= MIN_PRIORITY && priority <=MAX_PRIORITY){ // if the priority is not between 1- 10 than put 0 ( the lowest priority)
            this.priority=priority; // put the priority that enter
        }
        this.text=text; // put the text that enter
    }

    @Override
    public int getPriority() { // override the method from the interface and return the priority
        return this.priority; // return the priority
    }

    @Override// override the method from the interface and set a new priority for the print object
    public void setPriority(int p) {
        this.priority=p;
    }

    public String getText() { // get the text of the priority
        return this.text;
    }

    @Override
    public String toString() {
        return "PrintJob{" +
                "text='" + text + '\'' +
                ", priority=" + priority +
                '}';
    }
}
