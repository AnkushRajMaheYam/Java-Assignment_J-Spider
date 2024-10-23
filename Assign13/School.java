class School {
    String name;
    double fee;
    int noOfStudents;


    public void setValues(String name, double fee, int noOfStudents){
        this.name=name;
        this.fee=fee;
        this.noOfStudents=noOfStudents;
    }

    public void getDetails(){
        System.out.println("School's name is : " + this.name);
        System.out.println("School's fee is : " + this.fee);
        System.out.println("School's noOfStudents is : " + this.noOfStudents);
    }

}
