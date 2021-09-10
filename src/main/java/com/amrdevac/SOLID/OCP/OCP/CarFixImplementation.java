package com.amrdevac.SOLID.OCP.OCP;

public class CarFixImplementation {
    public static void main(String[] args) {
        CarNotification urgenNotif = new UrgentNotification();
        CarNotification normalNotif = new NormalNotification();
        CarNotification adsNotif = new AdsNotificacion();
        urgenNotif.Notification("The car is run out of gass");
        normalNotif.Notification("Your car is ready");
        adsNotif.Notification("New Expensive car !");
    }
}

//we area gona use the inheritance
abstract class CarNotification {
    public abstract void Notification(String message);
}

class UrgentNotification extends CarNotification {

    @Override
    public void Notification(String message) {
        System.out.println("URGENT MESSAGE : " + message);
    }
}

class NormalNotification extends CarNotification {

    @Override
    public void Notification(String message) {
        System.out.println("NORMAL MESSAGE : " + message);
    }
}
// we area gonaa add more

class AdsNotificacion extends CarNotification {

    @Override
    public void Notification(String message) {
        System.out.println("ADS : " + message);
    }
}

//class CarFunctionFixImplementation {
//    static Boolean engineStart;
//
//    enum NotificationType {URGENT, NORMAL}
//
//    static public void CarNotification(NotificationType notificationType, String message) {
//        if (notificationType.equals(NotificationType.URGENT)) {
//            System.out.println("URGENT MESSAGE : " + message);
//        }
//        if (notificationType.equals(NotificationType.NORMAL)) {
//            System.out.println("NORMAL MESSAGE : " + message);
//        }
//    }
//}
