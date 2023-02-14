package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.util.Random;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();





        for (int i = 0; i < 5; i++) {

            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(100);
        zofka.penDown();


        var random = new Random();
        var nakresliCtverec=random.nextInt(4)+1;
        while (nakresliCtverec!=4){

            zofka.move(100);
            zofka.turnRight(90);




        }











    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
