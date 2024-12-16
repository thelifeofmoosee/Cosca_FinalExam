package Outputs;

import java.util.Stack;

public class FinalExam {
    // Creature class to name and power level
    static class Creature {
        String name;
        int powerLevel;

        Creature(String name, int powerLevel) {
            this.name = name;
            this.powerLevel = powerLevel;
        }                           
    }

    public static void main(String[] args) {
        // Input data
        Creature[] creatures = {
            new Creature("Dragon", 95),
            new Creature("Griffin", 88),    
            new Creature("Unicorn", 78),
            new Creature("Phoenix", 92),    
            new Creature("Centaur", 85)
        };

        // Bubble Sort in descending order by power level
        bubbleSortDescending(creatures);
        System.out.println( "===== Bubble Sort: Descending Order by Power Level =====");
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        displayCreatures(creatures);

        // Selection Sort in ascending order by power level
        selectionSortAscending(creatures);
        System.out.println("\n");
        System.out.println("===== Selection Sort: Ascending Order by Power Level =====");
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        displayCreatures(creatures);

        // Stack implementation
        Stack<Creature> creatureStack = new Stack<>();
        for (Creature creature : creatures) {
            creatureStack.push(creature);
        }
        // Stack implementation popping creature
        System.out.println("\n");
        System.out.println("===== Stack Implementation: Popping Creatures =====");
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (!creatureStack.isEmpty()) {
            Creature creature = creatureStack.pop();
            System.out.println(creature.name + " - " + creature.powerLevel);
        }
    }

    // Bubble Sort implementation (Descending Order)
    public static void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].powerLevel < creatures[j + 1].powerLevel) {
                    // Swap
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort implementation    Ascending Order
    public static void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].powerLevel < creatures[minIndex].powerLevel) {
                    minIndex = j;
                }
            }
            // Swap
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    // Method to display creatures
    public static void displayCreatures(Creature[] creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature.name + " - " + creature.powerLevel);
        }
    }
}