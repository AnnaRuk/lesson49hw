import Repository.UserRepository;
import Service.ServiceUsers;
import models.User;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        Необходимо создать массив из 1000 людей (каждый человек это имя и рост).

//            Необходимо изменить методы selectionSort и binarySearch таким образом,
//                чтобы они работали с массивом людей (поиск и сортировка по росту)
//        Используйте comparable/comparator

        UserRepository userRepository = new UserRepository();
        ServiceUsers serviceUsers = new ServiceUsers(userRepository);
        User[] randomArray = userRepository.createRandomArray();
        serviceUsers.selectionSort(randomArray);
        userRepository.print(randomArray);
        System.out.println(serviceUsers.binarySearchByHeight(randomArray, 1.22)); ///true


        ///TODO class plus test
        System.out.println("Test for binarySearch");
        User[] users = new User[4];
        users[0] = new User("Anna", 1.65);
        users[1] = new User("Olha", 1.55);
        users[2] = new User("Elene", 1.85);
        users[3] = new User("Kata", 1.50);

        User user4 = new User("Anna", 1.65);

        serviceUsers.selectionSort(users);
        userRepository.print(users);
        System.out.println(serviceUsers.binarySearchByUser(users, user4));
        System.out.println(serviceUsers.binarySearchByHeight(users,1.85));
        System.out.println(serviceUsers.binarySearchByHeight(users,1.55));





    }











}