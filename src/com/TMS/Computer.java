package com.TMS;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    public String result;
    public int processor;
    public int operativka;
    public int disk;
    public int resurs;

    public Computer(int processor, int operativka, int disk, int resurs) {
        this.processor = processor;
        this.operativka = operativka;
        this.disk = disk;
        this.resurs = resurs;
    }

    public String vkl() {
        System.out.println("Введите 0 или 1 для включения компа: ");
        Scanner scan = new Scanner(System.in);
        int vvod = scan.nextInt();
        Random rnm = new Random();
        int rnd = rnm.nextInt(1);
        if (vvod == rnd) {
            result = "Компьютер включен ";
            return result;
        } else {
            result = "Ваш компьютер неисправен";
            return result;
        }
    }

    public String info() {
        return "processor " + processor + ", operativka " + operativka +
                ", disk " + disk + ", resurs " + resurs;
    }
}
