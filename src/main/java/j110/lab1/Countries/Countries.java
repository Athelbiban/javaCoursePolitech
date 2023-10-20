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
        printAll();
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
    public void setName(String name) throws Exception {
        dataVerification(name);
        this.name = name;
    }
    public void setSquare(double square) throws Exception {
        dataVerification(square);
        this.square = square;
    }
    public void setPopulation(double population) throws Exception {
        dataVerification(population);
        this.population = population;
    }
    public void setNameOfCapital(String nameOfCapital) throws Exception {
        dataVerification(nameOfCapital);
        this.nameOfCapital = nameOfCapital;
    }
    public void setPopulationInCapital(double populationInCapital) throws Exception {
        dataVerification(populationInCapital);
        this.populationInCapital = populationInCapital;
    }

    // метод проверяющий значения задаваемых данных
    private void dataVerification(String data) throws Exception {
        if (data.isEmpty()) throw new Exception("Exception: string not be empty");
    }
    private void dataVerification(double data) throws Exception {
        if (data <= 0) throw new Exception("Exception: number must be > 0");
    }

    // метод, задающий/сбрасывающий данные о столице
    public void resetCapitalData(String nameOfCapital, double populationInCapital) {
        this.nameOfCapital = nameOfCapital;
        this.populationInCapital = populationInCapital;
    }

    // конструкторы инициализирующие экземпляр объекта
    Countries(String name, double square, double population, String nameOfCapital, double populationInCapital) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.nameOfCapital = nameOfCapital;
        this.populationInCapital = populationInCapital;
    }
    Countries(String name, double square, double population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    // метод print
    public void print() {
        if (nameOfCapital == null || populationInCapital == 0) {
            System.out.printf("Название: %s\nПлощадь: %f\nНаселение: %f", name, square, population);
        }
        else {
            System.out.printf("Страна: %s\nПлощадь: %f\nНаселение: %f\nСтолица: %s\nНаселение столицы: %f",
                    name, square, population, nameOfCapital, populationInCapital);
        }
    }

    // метод printAll
    public static void printAll() {
        for (String str : countriesArr) {
            System.out.println(str);
        }
    }
}