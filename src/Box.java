public class Box {
    double width, height, length;
    public Box() {
         this.length = -1;
         this.width = -1;
         this.height = -1;
         System.out.println("Warning: Bot not initialised");
    }

    public Box(double edge) {
        this.length = edge;
        this.width = edge;
        this.height = edge;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume(){
        return this.length * this.height * this.width;
    }

    public void printVolume(){
        System.out.println("The Volume is : " + this.getVolume());
    }
}
