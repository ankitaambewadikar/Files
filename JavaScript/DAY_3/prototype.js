function Person(id,name){
    this.id=id;
    this.name=name;
   /* Person.prototype.print=function(){
        console.log(this.id);
        console.log(this.name,this.surname);
        
}*/
}

var p1 = new Person(10,"Amitabh");
var p2 = new Person(20,"Abji");

Person.prototype.surname = "bachchan";

Person.prototype.print=function(){
    console.log(this.id,this.name,this.surname);
}

p1.print();
p2.print();

