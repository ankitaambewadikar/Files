function Person(fname,lname){

    this.fname=fname;
    this.lname=lname;
    this.print=function(){
        console.log(this.fname);
        console.log(this.lname);
    }   
}

var person1 = new Person("amitabh","bacchan");
var person2 = new Person("abhi","bacchans");
person1.print();
person2.print();
/*
console.log(person1.fname);
console.log(person1.lname);
console.log(person2.fname);
console.log(person2.lname);*/