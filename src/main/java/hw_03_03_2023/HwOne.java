package hw_03_03_2023;
/**
 * Даны два ArrayList, элементы которых упорядочены. Объединить их в трерий ArrayList,
 * элементы которого тоже должны быть отсортированы.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HwOne {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 4));
        List<Integer> list2 = new ArrayList<>(List.of(1, 3, 4));

        System.out.println(mergingSheets(list1, list2));
    }

    public static List<Integer> mergingSheets(List<Integer> l1, List<Integer> l2) {
        List<Integer> resList = new ArrayList<>();
        Iterator<Integer> itL1 = l1.iterator();
        Iterator<Integer> itL2 = l2.iterator();
        Integer elL1 = null;
        Integer elL2 = null;

        while (itL1.hasNext() || itL2.hasNext()) {
            if (itL1.hasNext() && elL1 == null) elL1 = itL1.next();
            if (itL2.hasNext() && elL2 == null) elL2 = itL2.next();
            if (elL1 == elL2) {
                resList.add(elL1);
                elL1 = null;
                resList.add(elL2);
                elL2 = null;
            }
            if (elL1 != null && elL2 != null) {
                if (elL1 < elL2) {
                    resList.add(elL1);
                    elL1 = null;
                } else {
                    resList.add(elL2);
                    elL2 = null;
                }
            } else if (elL1 == null && elL2 != null) {
                resList.add(elL2);
                elL2 = null;
            } else if (elL1 != null) {
                resList.add(elL1);
                elL1 = null;
            }

        }
        return resList;
    }
}
