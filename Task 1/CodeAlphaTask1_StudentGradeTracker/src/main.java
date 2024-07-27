        //Task No: 1 This Project is Assigned by Code Alpha to Me in which a Teacher enters the Students Subject Score and 
        // the Program will return him the Highest and Loweset Score of Subject as well as the Average of Subject. 

import java.util.*;

public class main {

    // Method to Calcualte the Average Grade of Student
    public float avg(ArrayList<Float> list) {

        float average = 0;
        float total = 0;

        ListIterator<Float> itr = list.listIterator();
        while (itr.hasNext()) {
            total += itr.next();
        }

        average = total / 5;
        return average;
    }

    // Method for Find the Highest Score
    public float highestScore(ArrayList<Float> list) {
        return Collections.max(list);
    }

    // Method for Find the Lowest Score
    public float lowestScore(ArrayList<Float> list) {
        return Collections.min(list);
    }

    public static void main(String[] args) {

        main obj = new main();
        Scanner scan = new Scanner(System.in);

        ArrayList<Float> list = new ArrayList<Float>(5);
        ArrayList<String> sub = new ArrayList<>(5);
        Collections.addAll(sub,"English","Math","Physics","Chemistry","Science");

        System.out.println("--------------------------------------Welcome-----------------------------------------\n");
        System.out.println("This Porgram is made to Calculate the Student Average, Loweset & Highest Grades:\n");
        boolean flag = false;

            System.out.println("Please Enter the Subject Marks: \n");
            System.out.println("1. English: ");
            list.add(scan.nextFloat());
            System.out.println("2. Math: ");
            list.add(scan.nextFloat());
            System.out.println("3. Physics: ");
            list.add(scan.nextFloat());
            System.out.println("4. Chemistry: ");
            list.add(scan.nextFloat());
            System.out.println("5. Science: ");
            list.add(scan.nextFloat());
            scan.nextLine();

            System.out.println("-------------------------------------");
            System.out.println("Average: " + obj.avg(list));
            System.out.println("Max Score in Subject: "+sub.get(list.indexOf(obj.highestScore(list)))+": "+obj.highestScore(list));
            System.out.println("Min Score in Subject: " +sub.get(list.indexOf(obj.lowestScore(list)))+": "+obj.lowestScore(list));
            System.out.println("-------------------------------------");

        scan.close();

    }
}
