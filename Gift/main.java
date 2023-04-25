package Gift;

import Gift.Items.BaseClass;
import Gift.Items.Names;
import Gift.Items.Toy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    static final int Capacity = 10;
    public static ArrayList<BaseClass> toys = new ArrayList<>();
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Нажмите Enter для начала.");
        user_input.nextLine();
        for(int i = 0; i < Capacity; i++){
            int rnd = new Random().nextInt(100);
            toys.add(new Toy(getNewName(), i+1, rnd));
        }
        int maxIndex = 0;
        int max = toys.get(0).getWeight();
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).toString());
            if (toys.get(i).getWeight() > max){
                max = toys.get(i).getWeight();
                maxIndex = i;
            }

        }
        getPrize(toys, maxIndex);
        System.out.println("Розыгрыш состоялся.\n");
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).toString());
        }

    }

    static String getNewName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    static void getPrize(ArrayList items, int maxIndex){
        items.remove(maxIndex);
        }
    }
