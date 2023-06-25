public class NoShape implements Shape{
    //Liskov Substitution
    @Override
    public double area() {
        throw new IllegalStateException("Cannot Calculate Area");
    }
}
