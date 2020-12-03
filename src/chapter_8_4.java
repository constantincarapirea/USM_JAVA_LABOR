public class chapter_8_4 {
    private double length;
    private double width;
    public chapter_8_4(double length,double width){
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (0.0<length&&length<20.0 )
        this.length = length;
        else this.length=1.0;
    }

    public void setWidth(double width) {
        if (0.0<width&&width<20.0 )
            this.width = width;
        else this.width=1.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double Perimeter(){
        return this.width*2+this.length*2;
    }
    public double Area(){
        return this.width*this.length;
    }
}
