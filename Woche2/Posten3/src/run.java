public class run {
    public static void main(String[] args) {
        elevator mainhall = new elevator();

        Person person = new Person();

        person.setName("Noah");
        person.setWeight(75);

        Person person2 = new Person();
        person2.setName("Kyren");
        person2.setWeight(80);

        System.out.println(person2.getWeight());

        mainhall.set_maxweight(300);

        mainhall.add_person(person);
        mainhall.ride(3);
        mainhall.status();

        mainhall.ride(0);
        mainhall.add_person(person2);

        mainhall.status();
    }
}
