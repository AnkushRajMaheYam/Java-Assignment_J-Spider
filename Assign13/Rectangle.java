class Rectangle {
    
        double length;
        double width;
      

    
    
        public void setValues(double length, double  width){
            this.length=length;
            this.width=width;
        
        }

        public void  getArea(){
            double area = length*width;
            System.out.println("Rectange's Area is : "+area);
            
            
        }
        public void getPerimeter(){
            double Perimeter = 2*(length+width);
            System.out.println("Rectange's Perimeter is : "+Perimeter);
        }
    
        public void getDetails(){
            System.out.println("Rectangle's length is : " + this.length);
            System.out.println("Rectange's width is : " + this.width);
            getArea();
            getPerimeter();


        
    
    }
    
}
