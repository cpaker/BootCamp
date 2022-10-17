package entities;

public class Course {




    private String courseName;
    private int price;
    private String info;


    public Course(String courseName, int price, String info) {

        this.courseName = courseName;
        this.price = price;
        this.info = info;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
