public interface Prioritizeable {
    int MAX_PRIORITY = 10, MIN_PRIORITY = 0; // Too final that Determine the most priority and the minimum priority
    public abstract int getPriority(); // An abstract method that return the priority of an object
    public abstract void setPriority(int p); // An abstract method that change the priority of object

}
