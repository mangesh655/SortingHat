public class Student {

    private int rollNo;
    private String batch;
    private String foodPreference;

    public Student(int rollNo, String batch, String foodPreference) {
        this.rollNo = rollNo;
        this.batch = batch;
        this.foodPreference = foodPreference;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getBatch() {
        return batch;
    }

    public String getFoodPreference() {
        return foodPreference;
    }
}
