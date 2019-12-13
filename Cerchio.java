class Cerchio{
    private double r;

    public Cerchio(double r){
        this.r=r;
    }

    public double diametro(){
        return this.r*2;
    }

    public double area(){
        return this.r*this.r*Math.PI;

    }

    public double perimetro(){
        return this.r*Math.PI*2;
    }

    public double getRaggio(){
        return this.r;
    }
}