package j110.lab1.Countries;

public class Countries {
    private String name;
    private double square;
    private double population;
    private String nameOfCapital;
    private double populationInCapital;

    public static void main(String[] args) throws Exception {
        Countries a = new Countries("Country A", 273.3, 5.2, "Capital A", 0.64);
        System.out.println(a.getName());
        System.out.println(a.getSquare());
        a.setName("AnyCountry");
        a.setSquare(4.2);
        a.print();
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
        if (data.isEmpty()) {
            throw new Exception("Exception: string not be empty");
        }
    }
    private void dataVerification(double data) throws Exception {
        if (data <= 0) {
            throw new Exception("Exception: number must be > 0");
        }
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

    // массив из нескольких стран
//    Countries[][] countriesArr = new Countries[5][5];

    // метод printAll
    public static void printAll() {
        // тут печать массива
    }

}