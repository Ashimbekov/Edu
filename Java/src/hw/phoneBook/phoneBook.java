package hw.phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();
        String name_phone;
        while (true){
            System.out.println("1. Add contact");
            System.out.println("2. Show all contacts");
            System.out.println("3. Find contact");
            System.out.println("4. Remove contact");
            System.out.println("5. Edit contact");
            int choice = sc.nextInt();
            String name;
            switch(choice){
                case 1:
                    System.out.println("Введите имя: ");
                    name = sc.next();
                    if (contacts.contains(name)){
                        System.out.println("Такое имя есть в телефоной книге");
                    } else {
                        contacts.add(name);
                    }
                    break;
                case 2:
                    for (String contact : contacts) {
                        System.out.print(contact + ", ");
                    }
                    break;
                case 3:
                    String searchQuery = sc.next();
                    boolean found = false;
                    for (String contact : contacts) {
                        if (contact.contains(searchQuery)) {
                            System.out.println("Найден контакт: " + contact);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого имени нету в телефоной книге");
                    }
                    break;
                case 4:
                    System.out.println("Введите имя: ");
                    name = sc.next();
                    if (contacts.contains(name)){
                        contacts.remove(name);
                    } else {
                        System.out.println("Такого имени нету в телефоной книге");
                    }
                    break;
                case 5:
                    System.out.println("Введите имя: ");
                    name = sc.next();
                    if (contacts.contains(name)){
                        System.out.println("Менять 1. Имя, 2. Номер телефона");
                        int choice1 = sc.nextInt();
                        switch (choice1){
                            case 1:
                                System.out.println("Введите новое имя: ");
                                String newName = sc.next();
                                contacts.set(contacts.indexOf(name), newName);
                                break;
                            case 2:
                                System.out.println("Введите номер телефона");
                                name_phone = sc.next();
                                System.out.println("Имя: " + contacts.get(contacts.indexOf(name)) + " Телефон: " + name_phone);
                        }

                    } else {
                        System.out.println("Такого имени нету в телефоной книге");
                    }
                    break;
                default:
                    System.out.println("Неверный пункт меню.");
                    break;
            }
        }
    }
}
