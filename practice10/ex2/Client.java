package practice10.ex2;

public class Client {
    IChair chair;

    public void sit() {
        System.out.println("Присядешь?");
    };

    public void setChair(IChair chair) {
        this.chair = chair;
    }
}
