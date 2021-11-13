package Equal;

public class Animals {
    String animal_name;

    public Animals(String animal_name) {
        this.animal_name = animal_name;
    }

    public static void main(String[] args) {
        Animals a1 = new Animals("Raja");
        Animals a2 = new Animals("Raja");

        System.out.println(a1.equals(a2));

    }
}
