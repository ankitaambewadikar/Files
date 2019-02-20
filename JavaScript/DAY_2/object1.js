
/*
var person1={name:"ankita",id:15};
console.log(person1);
console.log(person1.name,person1.id);
console.log(person1["name"]);*/
 
var amitabh = {name:"Amitabh",surname :"Bachchan"};
var abhishek = Object.create(amitabh);
console.log(amitabh.name);
console.log(amitabh.surname);

abhishek.name="Abhi";
console.log(abhishek.name);
console.log(abhishek.surname);