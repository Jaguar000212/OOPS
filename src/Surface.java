public class Surface {
    int length, width;
    double radius;
    double pi = 3.14;

    public Surface(int edge){
        this.length = this.width = edge;
    }

    public Surface(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Surface(double radius){
        this.radius = radius;
    }

    public double getArea(){
        if(this.radius ==0)
            return this.length * this.width;
        return pi * this.radius * this.radius;
    }
}
