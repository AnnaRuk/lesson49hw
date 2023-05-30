package Service;

import Repository.UserRepository;
import models.User;

public class ServiceUsers {

    private UserRepository userRepository;
    private User user;

    public ServiceUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void selectionSort(User[] array) {
        User currentMin;
        int indexOfCurrentMin;
        User temp;
        for (int i = 0; i < array.length; i++) {
            currentMin = array[i];
            indexOfCurrentMin = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j].compareTo(currentMin) < 0) {
                    currentMin = array[j];
                    indexOfCurrentMin = j;
                }
            }
            temp = array[i];
            array[i] = array[indexOfCurrentMin];
            array[indexOfCurrentMin] = temp;
        }

    }

    public boolean binarySearchByUser(User[] array, User user) {
        boolean contains = false;
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (user.compareTo(array[middle]) < 0) {
                right = middle - 1;
            } else if (user.compareTo(array[middle]) > 0) {
                left = middle + 1;
            } else {
                contains = true;
                break;
            }
            middle = left + (right - left) / 2;

        }
        return contains;
    }
    public boolean binarySearchByHeight(User[] array, double height) {
        boolean contains = false;
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (height<(array[middle].getHeight())) {
                right = middle - 1;
            } else if (height>(array[middle].getHeight())) {
                left = middle + 1;
            } else {
                contains = true;
                break;
            }
            middle = left + (right - left) / 2;

        }
        return contains;
    }
}
