package j110.lab1.Countries;

public class Countries {
    private String name;
    private double square;
    private double population;
    private String nameOfCapital;
    private double populationInCapital;

    public static void main(String[] args) {
        Countries[] countriesArr = new Countries[5];
        countriesArr[0] = new Countries("Russia", 17.1e6, 146.7e6, "Moscow", 12.6e6);
        countriesArr[1] = new Countries("Finland", 338e3, 5.5e6, "Helsinki", 655e3);
        countriesArr[2] = new Countries("France", 643.8e3, 67.8e6, "Paris", 2.1e6);
        countriesArr[3] = new Countries("Andorra", 467e3, 85.4e3, "Andorra la Vella", 22.6e3);
        countriesArr[4] = new Countries("Singapore", 725e3, 5.7e6);

        printAll(countriesArr);
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
    private static void dataVerification(String data) {
        if (data == null || data.isEmpty()) throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }
    private static void dataVerification(double data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }
    private static void dataVerification(Countries[] countries) {
        if (countries == null || countries[0] == null) {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }

    // метод, задающий/сбрасывающий данные о столице
    public void resetCapitalData(String nameOfCapital, double populationInCapital) {
        setNameOfCapital(nameOfCapital);
        setPopulationInCapital(populationInCapital);
    }

    // конструкторы инициализирующие экземпляр объекта
    Countries(String name, double square) {
        setName(name);
        setSquare(square);
    }
    Countries(String name, double square, String nameOfCapital) {
        this(name, square);
        setNameOfCapital(nameOfCapital);
    }
    Countries(String name, double square, double population) {
        this(name, square);
        setPopulation(population);
    }
    Countries(String name, double square, double population,
              String nameOfCapital, double populationInCapital) {
        this(name, square, population);
        setNameOfCapital(nameOfCapital);
        setPopulationInCapital(populationInCapital);
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
    public static void printAll(Countries[] countries) {
        dataVerification(countries);
        for (Countries country : countries) {
            country.print();
            System.out.println();
        }
    }
}