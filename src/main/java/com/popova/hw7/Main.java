package com.popova.hw7;

import com.popova.hw7.model.Animal;
import com.popova.hw7.model.AnimalType;
import com.popova.hw7.servise.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Animal animal = userInputService.userInputAnimalTypeAndName();
        userInputService.doActions(animal);
    }
}