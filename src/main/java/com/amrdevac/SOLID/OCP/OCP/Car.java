package com.amrdevac.SOLID.OCP.OCP;

public class Car {
    public static void main(String[] args) {
        CarFunction.CarNotification(CarFunction.NotificationType.NORMAL, "Your car is ready");
        CarFunction.CarNotification(CarFunction.NotificationType.URGENT, "Your run out of gass");
    }
}

class CarFunction {
    static Boolean engineStart;

    enum NotificationType {URGENT, NORMAL}

    static public void CarNotification(NotificationType notificationType, String message) {
        if (notificationType.equals(NotificationType.URGENT)) {
            System.out.println("URGENT MESSAGE : " + message);
        }
        if (notificationType.equals(NotificationType.NORMAL)) {
            System.out.println("NORMAL MESSAGE : " + message);
        }
    }
}
//so the problem is if someday  we are gonna add more type on notificationType ,
// so , as per "open closed principle" the existing implementataion cannot be modified
// but if we adding new  notification  at enum NotificationType {URGENT, NORMAL,NEWTYPE} , we have to change the existing class
// the CarNotification so then we break the open closed principle so this is the isue ,
// so we gonna create another with the right apply for this kinda situation