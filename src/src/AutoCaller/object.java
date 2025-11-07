package AutoCaller;

public class object {
    @AutoCall
    public void cat(){
        System.out.println("moew");
    }
    public void dog(){
        System.out.println("bark");
    }
    @AutoCall
    public void food(){
        System.out.println("Pizza");
    }
}
