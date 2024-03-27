public class Bell {
    boolean str = true;

    void sound() {
        if (str) {
            System.out.println("ding");
        } else  {
            System.out.println("dong");
        }

        str = !str;
    }



}

/*Boolean ding = true;

    void sound() {
        if (ding) {
            System.out.println("Ding");
        }else {
            System.out.println("Dong");
        }
        ding = !ding;
    }*/