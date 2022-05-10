package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._04double_checked_locking;

final class Captain2

{
    private static Captain2 captain;
    static int instances =0;

    private Captain2() {
        instances++;
        System.out.println("number of instances at this moment="+ instances);
    }

    public static  Captain2 getCaptain(){
        if (captain == null) {
            synchronized (Captain2.class) {
// lazy initialization
                if (captain == null){
                    captain = new Captain2();
                    System.out.println("new captain is elected for your team. ");
                }
                else
                {
                    System.out.println("you already have a captain for your team. ");
                    System.out.println("send him for the toss. ");
                }
            }
        }
        return captain;
    }
}
