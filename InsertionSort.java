package com.algoWork.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort<T extends Comparable<T>> {

    public void sort(List<T> arrayElements) {

        // Iterate over the arrayElements from second element
        for (int i = 1; i < arrayElements.size(); i++) {

            // consider the secondElement as the markedElement
            T markedElement = arrayElements.get(i);
            // Get the index of the markedElement
            int markedElementIndex = i;
            // Keep shifting the elements in the subList towards right until you
            // find the correct position to insert the markedElement. This
            // Comparison will be done till markedIndex is greater than 0 and
            // markedElement is less that the compared element in the subList.

            while (markedElementIndex > 0
                    && markedElement.compareTo(arrayElements
                            .get(markedElementIndex - 1)) < 0) {
                arrayElements.set(markedElementIndex,
                        arrayElements.get(markedElementIndex - 1));
                markedElementIndex--;
            }
            // At the end of the loop, correct position to insert the
            // markedElement in the subList will be found and insert the element
            // in that position.
            arrayElements.set(markedElementIndex, markedElement);
        }

    }

}
