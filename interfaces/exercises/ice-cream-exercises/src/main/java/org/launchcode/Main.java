package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator flavorComparator = new FlavorComparator();

        System.out.println("Before Sort: ");
        for (Flavor flavor : flavors) {
            System.out.println("\t" + flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(flavorComparator);
        System.out.println("After Sort: ");
        for (Flavor flavor : flavors) {
            System.out.println("\t" + flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator costComparator = new ConeComparator();
        System.out.println("Before Sort: ");
        for (Cone cone : cones) {
            System.out.println("\t$" + cone.getCost());
        }

        cones.sort(costComparator);
        System.out.println("After Sort: ");
        for (Cone cone : cones) {
            System.out.println("\t$" + cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}