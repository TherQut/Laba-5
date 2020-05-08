
public class BstToQueueClient {
    public static void main(String[] args) {
        BST<Date_, String> bst = new BST<>();
        MinPQueue<Date_> pq = new MinPQueue<>();
        PeopleGenerator generator = new PeopleGenerator();
        int MAX = 500;
        Date_ minDate = null;

        // generate random data to bst
        // save min date to future checking
        for (int i = 0; i < MAX; i++) {
            Date_ date = new Date_();
            String person = generator.generatePerson();
            if (minDate == null)
                minDate = date;
            else if (minDate.compareTo(date) < 0)
                minDate = date;
            bst.put(date, person);
        }

        bst.convertToQueue(pq);

        System.out.println("****************");
        System.out.println("Saved Min date: " + minDate);
        System.out.println("Min key -> value in BST: " + bst.min() + " -> " + bst.getMin());
        System.out.println("Min date in Queue: " + pq.min());
    }
}
