package car.example.setter.injection;

public class Car {
//car needs Specifiction
    //it means it is dependent on specification
    private Specification specification;

//in Setter dependency injection here
//we modify from constructor to setter
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void diplayDetails(){
        System.out.println("car Details:"+specification.toString());
    }
}
