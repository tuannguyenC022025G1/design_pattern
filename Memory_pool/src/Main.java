public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();

        System.out.println("Start");
//        gun.fire();           // Bắn theo cách truyền thống
        gun.fireInPool();       // Bắn sử dụng Memory Pool
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
