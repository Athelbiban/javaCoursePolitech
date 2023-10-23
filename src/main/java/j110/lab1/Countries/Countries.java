package j110.lab1.Countries;

public class Countries {
    private String name;
    private double square;
    private double population;
    private String nameOfCapital;
    private double populationInCapital;
    // массив из нескольких стран
    private static final String[] countriesArr = {
            "Russia, 17,1 млн кв.км., 146,7 млн чел., Moscow, 12,6 млн чел.",
            "Finland, 338 тыс. кв. км., 5,5 млн чел., Helsinki, 655 тыс. чел.",
            "France, 643,8 тыс. кв. км., 67,8 млн чел., Paris, 2,1 млн чел.",
            "Andorra, 467 кв. км., 85,4 тыс. чел., Andorra la Vella, 22,6 тыс. чел.",
            "Singapore, 725 кв. км., 5,7 млн чел., -",
    };

    public static void main(String[] args) {
        Countries country1 = new Countries("Country1", 3.14, "Capital1");
        Countries country2 = new Countries("Russia", 17.1e6, 146.7e6, "Moscow", 12.6e6);
        Countries country3 = new Countries("Finland", 338e3, 5.5e6, "Helsinki", 655e3);
        Countries country4 = new Countries("France", 643.8e3, 67.8e6, "Paris", 2.1e6);
        Countries country5 = new Countries("Country2", 999.99);

//        System.out.println(country5.getNameOfCapital());
//        System.out.println(country2.getPopulationDensity());
//        System.out.println(country1.getPopulationDensity());
        country5.print();
        country4.print();
        country3.print();
        country2.print();
        country1.print();
//        printAll();
    }

    // get-методы, возвращающие значения соответствующих атрибутов
    public String getName() { return name; }
    public double getSquare() { return square; }
    public double getPopulation() { return population; }
    public String getNameOfCapital() { return nameOfCapital; }
    public double getPopulationInCapital() { return populationInCapital; }

    // get-метод, возвращающий значение плотности населения страны
    public double getPopulationDensity() {
        return population / square;
    }

    // set-методы, устанавливающие значения соответствующих атрибутов с проверкой значений
    public void setName(String name) {
        dataVerification(name);
        this.name = name;
    }
    public void setSquare(double square) {
        dataVerification(square);
        this.square = square;
    }
    public void setPopulation(double population) {
        dataVerification(population);
        this.population = population;
    }
    public void setNameOfCapital(String nameOfCapital) {
        dataVerification(nameOfCapital);
        this.nameOfCapital = nameOfCapital;
    }
    public void setPopulationInCapital(double populationInCapital) {
        dataVerification(populationInCapital);
        this.populationInCapital = populationInCapital;
    }

    // метод проверяющий значения задаваемых данных
    private void dataVerification(String data) {
        if (data.isEmpty()) throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }
    private void dataVerification(double data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }

    // метод, задающий/сбрасывающий данные о столице
    public void resetCapitalData(String nameOfCapital, double populationInCapital) {
        setNameOfCapital(nameOfCapital);
        setPopulationInCapital(populationInCapital);
    }

    // конструкторы инициализирующие экземпляр объекта
    Countries(String name, double square, double population,
              String nameOfCapital, double populationInCapital) {
        setName(name);
        setSquare(square);
        setPopulation(population);
        setNameOfCapital(nameOfCapital);
        setPopulationInCapital(populationInCapital);
    }
    Countries(String name, double square, double population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
    }
    Countries(String name, double square, String nameOfCapital) {
        setName(name);
        setSquare(square);
        setNameOfCapital(nameOfCapital);
    }
    Countries(String name, double square) {
        setName(name);
        setSquare(square);
    }

    // метод print
    public void print() {
        if (nameOfCapital == null && populationInCapital == 0 && population != 0) {
            System.out.printf("Страна: %s\nПлощадь: %f\nНаселение: %f\n", name, square, population);
        }
        else if (nameOfCapital == null && populationInCapital == 0 && population == 0) {
            System.out.printf("Страна: %s\nПлощадь: %f\n", name, square);
        }
        else if (populationInCapital == 0 && population == 0) {
            System.out.printf("Страна: %s\nПлощадь: %f\nСтолица: %s\n",
                    name, square, nameOfCapital);
        }
        else {
            System.out.printf("Страна: %s\nПлощадь: %f\nНаселение: %f\nСтолица: %s\nНаселение столицы: %f\n",
                    name, square, population, nameOfCapital, populationInCapital);
        }
        if (population != 0 && populationInCapital != 0) {
            System.out.printf("Плотность населения: %f\n", getPopulationDensity());
        }
    }

    // метод printAll
    public static void printAll() {
        for (String str : countriesArr) {
            System.out.println(str);
        }
    }
}