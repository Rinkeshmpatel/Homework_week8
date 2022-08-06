package Homework_week8;
public class Floor {

    private double width;
    private double lenght;

    public Floor(double width, double lenght){
        if (width < 0 && lenght >0){
            this.width = 0;
            this.lenght = lenght;
        } else if (width >0 && lenght <0) {
            this.width = width;
            this.lenght = 0;
        } else if (width< 0 && lenght< 0) {
            this.width = 0;
            this.lenght = 0;
        }
        else {
            this.width = width;
            this.lenght = lenght;
        }
    }
    public double getArea(){
        return this.width * this.lenght;
    }
}
Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms