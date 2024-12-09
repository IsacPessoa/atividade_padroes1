package br.com.ilima;

public class FactoryContract extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Civic(184, "cheio", "preto");
        } else if ("B".equals(requestedGrade)) {
            return new Corolla(122, "cheio", "prata");
        } else {
            System.out.println("Grade de carros não encontrada!");
            return null;
        }
    }
}
