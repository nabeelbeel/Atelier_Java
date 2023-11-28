package PK1;

import java.util.Arrays;

public class UserArray extends User {
    // constructeur qui remplit le tableau de taille 5
    public UserArray(String name, String email, int Id) {
        super(name, email, Id);
        User[] users = new User[5];
        users[0] = new User("A", "test", 1);
        users[1] = new User("B", "test", 2);
        users[2] = new User("C", "test", 3);
        users[3] = new User("D", "test", 4);
        users[4] = new User("E", "test", 5);
    }

    // methode de tri du tableau
    public static void sort(User[] users) {
        Arrays.sort(users);
    }

    // ajout d'element dans le tableau
    public static void add(User[] users, User user) {
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
    }

    // suppression d'element dans le tableau
    public static void remove(User[] users, User user) {
        int index = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.arraycopy(users, index + 1, users, index, users.length - index - 1);
            users = Arrays.copyOf(users, users.length - 1);
        }
    }

    // compter les elements dans le tableau
    public static int count(User[] users) {
        return users.length;
    }

    // inverser les elements du tableau
    public static void reverse(User[] users) {
        for (int i = 0; i < users.length / 2; i++) {
            User temp = users[i];
            users[i] = users[users.length - 1 - i];
            users[users.length - 1 - i] = temp;
        }
    }

    // afficher le tableau
    public static void print(User[] users) {
        for (User user : users) {
            System.out.println(user);
        }
    }

    // afficher le plus grand element
    public static User max(User[] users) {
        return Arrays.stream(users).max(User::compareTo).orElse(null);
    }

    // egalite entre deux tableaux
    public static boolean equals(User[] users1, User[] users2) {
        return Arrays.equals(users1, users2);
    }

    // test
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("A", "hhehehe", 1);
    }
}
