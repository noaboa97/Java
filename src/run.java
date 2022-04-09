public class run {
    public static void main(String[] args) {
        elevator mainhall = new elevator();

        mainhall.set_maxweight(300);
        mainhall.add_person(75);
        mainhall.ride(3);
        mainhall.status();
    }
}
