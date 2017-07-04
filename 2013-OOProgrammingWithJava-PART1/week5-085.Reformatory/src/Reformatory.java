public class Reformatory {
    private int weightMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.weightMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int addWeight = person.getWeight() + 1;
        person.setWeight(addWeight);
    }

    public int totalWeightsMeasured() {
        return this.weightMeasured;
    }

}
