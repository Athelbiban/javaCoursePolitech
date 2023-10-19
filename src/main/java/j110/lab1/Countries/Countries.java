package j110.lab1.Countries;

public class Countries {
    private String name;
    private int square;
    private int population;
    private String nameOfCapital;
    private String populationInCapital;

    public static void main(String[] args) {
        Countries a = new Countries();
        System.out.println(a.getName());
        a.setName("Stas");
        System.out.println(a.getName());
    }

    // get-методы, возвращающие значения соответствующих атрибутов
    public String getName() { return name; }
    public int getSquare() { return square; }
    public int getPopulation() { return population; }
    public String getNameOfCapital() { return nameOfCapital; }
    public String getPopulationInCapital() { return populationInCapital; }

    // get-метод, возвращающий значение плотности населения страны
    // ???????????????????????????????????????????????????????????

    // set-методы, устанавливающие значения соответствующих атрибутов с проверкой значений

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            // тут должно выброситься исключение подходящего типа
            System.out.println("Заглушка для исключения setNameException");
        }
    }
    public void setSquare(int square) {
        if (square > 0) {
            this.square = square;
        }
        else {
            // и тут тоже должно выброситься исключение подходящего типа
            System.out.println("Заглушка для исключения setSquareException");
        }
    }
    public void setPopulation(int population) {
        if (population > 0) {
            this.population = population;
        }
        else {
            // и тут тоже должно выброситься исключение подходящего типа
            System.out.println("Заглушка для исключения setPopulationException");
        }
    }
    public void setNameOfCapital(String nameOfCapital) {
        if (!nameOfCapital.isEmpty()) {
            this.nameOfCapital = nameOfCapital;
        }
        else {
            // и тут тоже должно выброситься исключение подходящего типа
            System.out.println("Заглушка для исключения setNameOfCapitalException");
        }
    }
    public void setPopulationInCapital(String populationInCapital) {
        this.populationInCapital = populationInCapital;
    }

    // метод, задающий/сбрасывающий данные о столице
    public void addCapitalData(String nameOfCapital) {
        // тут будет код
    }
}
