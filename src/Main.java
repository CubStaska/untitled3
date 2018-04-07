public class Main {
    static boolean run = false;
    public static void main(String[] args) {
       Main main = new Main();
        String[][] pole = main.createpole();
        main.draw(pole);
        main.gamerun(pole);


    }

    private void gamerun(String[][] pole) {
        while(run) {
            draw(pole);
            System.out.println("Runner Game");
        }
    }


    public String[][] createpole(){
        String [] [] pole  = new String[3][3];
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = "* ";
            }
        }
        return pole;
    }

     void draw(String [] [] pole){
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole[i][j]);
            }
            System.out.println();
        }
    }
}
