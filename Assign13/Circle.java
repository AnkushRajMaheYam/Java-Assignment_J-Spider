class Circle {

    double radius;

    public void setValues(double radius){
       this.radius=radius;
    
    }

    public void getArea(){
        double area = 3.14*(radius*radius);
        System.out.println("Circle's Area is : "+area);
        
        
    }
    public void getcircumference(){
        double circumference = 2*3.14*radius;
        System.out.println("Circle's circumference is : "+circumference);
    }

    public void getDetails(){
        System.out.println("Circle's radius is : " + this.radius);
        getArea();
        getcircumference();


    

}
}
