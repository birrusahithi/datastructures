public class SingleTon2 {
    public static void main(String[] args){
        SingleTon x = SingleTon.getInstance();
        SingleTon y = SingleTon.getInstance();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
    }
}
