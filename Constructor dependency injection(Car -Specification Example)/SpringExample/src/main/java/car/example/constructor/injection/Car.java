package car.example.constructor.injection;

public class Car {
//car needs Specifiction
    //it means it is dependent on specification
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void diplayDetails(){
        System.out.println("car Details:"+specification.toString());
    }
}
