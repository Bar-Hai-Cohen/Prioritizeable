import java.util.Arrays;

public class PriorityQueue {
    private Prioritizeable[] priority; // property of an array from the type of the interface

    public PriorityQueue() {
        this.priority = new Prioritizeable[100]; // default constructor that create an object of 100 index
    }

    /*
        Help method that rotate all the element in the array on index left
        this is method that we use when we find an element that we need to get in
     */
    private void swap(Prioritizeable[] priority, int index) { // get the array and the index where to stop
        for (int i = 0; i < index; i++) { // go over all the array
            priority[i] = priority[i + 1]; // put the element in one index left
        }
    }

    /*
     method that get element and insert him in the right position in the array
     */
    public void insert(Prioritizeable element) {  // get an element
        int len = this.priority.length - 1; // variable the contains the last index of the array
        if (this.priority[this.priority.length - 1] == null) { // if we have no element in the array put him in the first position
            this.priority[this.priority.length - 1] = element; // put the element in the first position of the priority
        } else if (this.priority[0] != null) return; // if all the array is full then we can get enter element
        else { //otherwise ..
            for (int i = len; i > 0; i--) { // go over of all the array and do some check
                if (this.priority[i] != null && element.getPriority() > this.priority[i].getPriority()) { // if the priority of the element is bigger than priority  in index i and check if the priority in index i is not null
                    swap(this.priority, i); // call the swap element and move all one side left
                    this.priority[i] = element; // put the element ih his right position
                    break; // break from the method
                } else {
                    if (i != len && this.priority[i] == null && this.priority[i + 1].getPriority() >= element.getPriority()) {// if the priority of the element is smaller than priority  in index i and check if the priority in index i is not null
                        this.priority[i] = element; // put the element ih his right position
                        break; // break from the method
                    }
                }
            }
        }
    }

    /*
    method that return the element with the most priority important index and also remove him from the array
     */
    public Prioritizeable remove() {
        int len = this.priority.length - 1;// variable the contains the last index of the array
        Prioritizeable temp = null; // create an object that get the element with the most priority important index
        if (this.priority[len] != null) { // if the array is not empty
            temp = this.priority[len]; // take the element with the most priority important index
            for (int i = len; i > 0; i--) { // rotate all the element one side right
                this.priority[i] = this.priority[i - 1];
            }
            this.priority[0] = null; // put in the index zero null that not create duplicate
        }
        return temp; // return the array
    }

    public String toString() {
        String str = ""; // create an empty string
        for (int i = 0; i < this.priority.length; i++) {
            if (this.priority[i] != null) { // check if not null
                str += "The element number " + (i + 1) + "is :" + this.priority[i].toString()+ "\n"; // get am element to the str
            }
        }
        return str;
    }
}

