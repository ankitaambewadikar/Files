class Person{

    constructor(fname,lname){
        this.fname=fname;
        this.lname=lname;
    }
    print() {
        console.log(this.fname,this.lname);
        
    }
}
var person1 = new Person("Amitabh","Bachchan");
var person2 = new Person("Abhi","Bachchan");
person1.print();
person2.print();