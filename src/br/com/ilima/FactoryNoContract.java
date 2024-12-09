package br.com.ilima;

public class FactoryNoContract extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new City(80, "cheio", "prata");
        } else if ("B".equals(requestedGrade)) {
            return new Yaris(84, "cheio", "branco");
        } else {
            System.out.println("Grade de carros não encontrada!");
            return null;
        }
    }
}
