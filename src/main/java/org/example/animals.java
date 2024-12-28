package org.example;
// Импорты
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class animals{

    public static void main(String[] args) {
        List<ShelterAnimal> animals = new ArrayList<>(); 
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            System.out.println("\nПитомник для бездомных животных");
            System.out.println();
            System.out.println("1 - Добавить животное");
            System.out.println("2 - Показать всех животных");
            System.out.println("3 - Выйти");
            
            System.out.println("Что вы хотите сделать? (введите номер действия)");
            int action = scanner.nextInt();
            scanner.nextLine();

            if (action == 1) {
                System.out.print("Введите имя животного: ");
                String name = scanner.nextLine();
                System.out.print("Введите вид животного: ");
                String species = scanner.nextLine();
                System.out.print("Введите возраст животного: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                animals.add(new ShelterAnimal(name, species, age));
                System.out.println("Животное добавлено");

            } else if (action == 2) {
                System.out.println("\nСписок животных:");
                for (ShelterAnimal animal : animals) {
                    System.out.println(animal);
                }

            } else if (action == 3) {
                System.out.println("Выход из программы");
                break;
            } else {
                System.out.println("Мы не знаем такого действия. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}


class ShelterAnimal {
    // Поля класса
    private String name;    
    private String species; 
    private int age;        
    
    public ShelterAnimal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Имя: " + name + ", Вид: " + species + ", Возраст: " + age + " лет";
    }
}
