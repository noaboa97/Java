
public class elevator {
    private double maxweight;
    private double currentloadweight;
    private int currentfloor;

    public void set_maxweight(double weight) {

        this.maxweight = weight;
    }

    public double get_currentloadweight() {

        return this.currentloadweight;
    }

    public int get_currentfloor() {

        return this.currentfloor;
    }

    public void ride(int floor) {

        this.currentfloor = floor;
    }

    public void add_person(Person person) {

        this.currentloadweight += person.getWeight();

    }

    public void status() {
        System.out.println("Current Floor " + this.currentfloor);
        System.out.println("Weight: " + this.currentloadweight);
    }
}
