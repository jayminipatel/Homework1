package inheritance;

public class Testplane {
    public static void main(String[] args) {
        System.out.println("Parental class Plane");
        //Create object
        PassengerPlane p =new PassengerPlane();
        p.selectDate();
        p.bookTicket();
        p.payment();
        p.travel();
        p.Size();
        p.ParkingPlace();
        p.charges();

        System.out.println("child class AirIndia");
        AirIndia a = new AirIndia();
        a.selectDate();
        a.bookTicket();
        a.payment();
        a.travel();
        a.Size();
        a.ParkingPlace();
        a.charges();

        System.out.println("Child class BritishAirways");
        BritishAirways b = new BritishAirways();
        b.selectDate();
        b.bookTicket();
        b.payment();
        b.travel();
        b.Size();
        b.ParkingPlace();
        b.charges();

        System.out.println("Child class Emirates");
        Emirates e = new Emirates();
        e.selectDate();
        e.bookTicket();
        e.payment();
        e.travel();
        e.Size();
        e.ParkingPlace();
        e.charges();

        System.out.println("Child class Cargo plane");
        CargoPlane c =new CargoPlane();
        c.Size();
        c.ParkingPlace();
        c.charges();





    }

}
