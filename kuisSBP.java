public class kuisSBP {
    public static void main(String[] args) {
        //variabel a dan e memiliki nilai awal true
        boolean a = true, e = true;
        boolean f, g, j, k;

        //karena A & E memiki nilai awal true maka pernyataan dibawah ini benar.
        if (a && e) {
            f = true;
            System.out.println("Fakta Baru f");
            if (a) {
                g = true;
                System.out.println("Fakta Baru g");
                if (f == true && g == true) {
                    System.out.println("Fakta Baru d");
                    if (g == true && e == true) {
                        System.out.println("Fakta Baru h");
                        if (g==true) {
                            j = true;
                            System.out.println("Fakta Baru j");
                            if (j == true) {
                                k = true;
                                System.out.println("Fakta Baru k");
                                System.out.println("k bernilai " + k);
                            }
                        }
                    }
                }
            }      
        }
    }
}

