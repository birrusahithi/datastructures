import java.sql.SQLOutput;

public class SingleTon{
    public static SingleTon object = null;
    private SingleTon(){
        System.out.println("ob");
    }
    public static SingleTon getInstance(){
        if(object==null){
            object = new SingleTon();
        }
        return object;
    }
}
