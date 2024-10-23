class Weapon {
    
        String name;
        double range;
        int noOfRound;
    
    
        public void setValues(String name, double range, int noOfRound){
            this.name=name;
            this.range=range;
            this.noOfRound=noOfRound;
        }
    
        public void getDetails(){
            System.out.println("Weapon's name is : " + this.name);
            System.out.println("Weapon's range is : " + this.range);
            System.out.println("Weapon's noOfRound is : " + this.noOfRound);
        
    
    }
    
}
