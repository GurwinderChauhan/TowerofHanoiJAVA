package Towerofhanoi;

import java.util.Scanner;

public class Logic_Output {
    private Scanner sc = new Scanner(System.in);
    public Logic_Output() {
        System.out.println("How many rings do you want in tower of hanoi :\n");
        Ring ring =new Ring(sc.nextInt());
        System.out.println(ring.getNumberOfRing());
        Tower redTower= new Tower("Red");
        Tower greenTower= new Tower("Green");
        Tower yellowTower= new Tower("Yellow");
        towerOfHanoi(ring.getNumberOfRing(),redTower.getNameOfTOwer(),greenTower.getNameOfTOwer(),yellowTower.getNameOfTOwer());

    }

    private void towerOfHanoi(int numberofrings, String beg_rod, String end_rod, String mid_rod) {
        if (numberofrings == 1) {
            System.out.println("Move disk 1 from rod " +  beg_rod + " to rod " + end_rod);
            return;
        }

        towerOfHanoi(numberofrings-1, beg_rod, mid_rod, end_rod);

        System.out.println("Move disk " + numberofrings + " from rod " +  beg_rod + " to rod " + end_rod);

        towerOfHanoi(numberofrings-1, mid_rod, end_rod, beg_rod);
    }
}
