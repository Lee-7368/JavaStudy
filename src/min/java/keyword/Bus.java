package min.java.keyword;

class Veh{
    public void run(){
        System.out.println("vehcile run");
    }
}


public class Bus {
    public static void main(String[] args) {
        Veh veh = new Veh(){
            @Override
            public void run(){
                super.run();
                System.out.println("vehcile run");
            }
        };
    }
}