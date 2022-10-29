public class Humen {
    public String name;
    private String town;
    private int yearOfBirth;
    public String job;

    public Humen(String name, String town, int yearOfBirth, String job) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "информация не указана";
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (job != null) {
            this.job = job;
        } else {
            this.job = "информация не указана";
        }
        if (town != null) {
            this.town = town;
        } else {
            this.town = "информация не указана";
        }
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (town != null) {
                this.town = town;
        } else {
            this.town = "информация не указана";
        }}

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth (int yearOfBirth){
            if (yearOfBirth > 0) {
                this.yearOfBirth = yearOfBirth;
            } else {
                this.yearOfBirth = 0;
            }
        }}
