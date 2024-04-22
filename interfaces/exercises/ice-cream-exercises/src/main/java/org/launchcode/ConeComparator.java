package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        return Double.compare(cone1.getCost(), cone2.getCost());
    }
}
