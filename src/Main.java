import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> names=new ArrayList<>();
        String name="Cafer";

        names.add(name);
        names.add("Zeynep");
        names.add("Umut");
        names.add("Arzu");
        names.add("Hüseyin");

        int index=0;
        while(index<names.size()) {
            System.out.println(names.get(index));
            index++;
        }
        System.out.println("-------");
        for(int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }
        System.out.println("-------");
        for(String nameler:names) {
            System.out.println(nameler);
        }
        */


        /*
        ArrayList<Person> persons=new ArrayList<>();
        Person John=new Person("John");
        persons.add(John);
        persons.add(new Person("Cafer"));
        persons.add(new Person("Zeyno"));

        for(Person person:persons) {
            System.out.println(person);
        }
        */

        Scanner giris=new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();

        while(true) {
            System.out.println("Enter a name.Empty will stop");
            String name=giris.nextLine();
            if(name.isEmpty()) {
                break;
            }
            persons.add(new Person(name));

            System.out.println();
            System.out.println("persons in total:"+persons.size());
            System.out.println("Persons:");
            for(Person person:persons) {
                System.out.println(person);
            }
        }




    }
}
