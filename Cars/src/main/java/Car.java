public class Car {

    private int id;

    private String  marka;

    private String model;

    private int year;


    private int price;

    private int registrnumber;

    public Car(){
        this.id = 0;
        this.marka = "";
        this.model = "";
        this.year = 0;
        this.price = 0;
        this.registrnumber = 0;
    }

    public Car(int id, String marka, String model, int year, int price, int registrnumber) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registrnumber = registrnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>0) {
            this.price = price;
        }
    }

    public int getRegistrnumber() {
        return registrnumber;
    }

    public void setRegistrnumber(int registrnumber) {
        this.registrnumber = registrnumber;
    }

    public String toString() {
        return "Машина --- " +
                "id=" + id +
                ", Марка=" + marka  +
                ", Модель=" + model +
                ", Рік випуску=" + year +
                ", Ціна=" + price +
                ", Реєстраційний номер=" + registrnumber;
    }
}

