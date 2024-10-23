class Fruit{
    String name;
    int price;
    int weight;
    
    public void setValue(String name, int price, int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    
    public void getDetails(){
        System.out.println("name is :" + name);
        System.out.println("or");
        System.out.println("name is :"+ this.name);
    }
}
