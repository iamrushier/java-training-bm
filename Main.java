
import java.util.Optional;

class Main {

    public static void main(String[] args) {
        Person person = new Person();
        // //Null check for person
        // if (person != null) {
        //     House house = person.getHouse();
        //     //Null check for house
        //     if (house != null) {
        //         HouseLoan houseLoan = house.getHouseLoan();
        //         //Null check for houseLoan
        //         if (houseLoan != null) {
        //             System.out.println(houseLoan.getHouseLoanDetails());
        //         }
        //     }
        // }
    }
}

class Person {

    //house declared as an Optional
    Optional<House> house;

    public Optional<House> getHouse() {
        return house;
    }
}

class House {

    //houseLoan declared as an Optional
    Optional<HouseLoan> houseLoan;

    public Optional<HouseLoan> getHouseLoan() {
        return houseLoan;
    }
}

class HouseLoan {

    String houseLoanDetails;

    public String getHouseLoanDetails() {
        return houseLoanDetails;
    }
}
