package generic;

import generic.model.Gender;
import generic.model.Phone;
import generic.model.User;
import generic.service.impl.PhoneServiceImpl;
import generic.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        userService.save(new User(
                1L,
                "aibek@gmail.com",
                "Password123",
                "+996557251673",
                Gender.MAN));

        userService.save(new User(
                2L,
                "nursultan@gmail.com",
                "Password123",
                "+996555100200",
                Gender.MAN));

        User user1 = userService.findById(1L);
        System.out.println(user1);
        System.out.println(user1.getPhone());

        boolean updated = userService.updateById(2L,
                new User(
                "baiel@gmail.com",
                "Password123",
                "+996555100200",
                Gender.MAN));
        System.out.println(updated);

        String deleted = userService.deleteById(1L);
        System.out.println(deleted);

        phoneService.save(new Phone(1, "iphone 16", 512));

        boolean result = userService.assignPhoneToUser(2L, 1);
        System.out.println(result);

        for (User user : userService.findAll()) {
            System.out.println(user);
            System.out.println(user.getPhone());
        }


    }

    public static <Baiel> Baiel print(Baiel type, Baiel element){//
        System.out.println("type.getClass().getName() = " + type.getClass().getName());
        System.out.println("element.getClass().getName() = " + element.getClass().getName());
        return element;
    }

    public static <T, E> T print2(T type, E ...element){
        System.out.println(type);
        for (E e : element) {
            System.out.println(e);
        }
        return type;
    }


//
//    public static void print(String string){
//        System.out.println(string);
//    }
//
//    public static void print(Integer integer){
//        System.out.println(integer);
//    }
//
//    public static void print(Boolean element){
//        System.out.println(element);
//    }

}
