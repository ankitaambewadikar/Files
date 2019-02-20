var person1 ={ name:"Brenden",surname:"Eich",age:"35" };
console.log(person1);
/*
Object.defineProperties(person1,{
                    age:{
                        value : 42,configurable:false
                    },
                    name:{
                        value:"Amitabh",configurable:false
                    }
}
                                                
);

console.log(person1.age);
console.log(person1.name);
console.log(person1.age,person1.name,person1.surname);*/

Object.defineProperties(person1,{
                                age:{
                                    value:30,configurable:true,writable:false
                                },
                                name:{
                                    value:"Ankita"
                                }
});
person1.age=22;
console.log(person1.age);

Object.defineProperties(person1,{
    age:{
        value:30,configurable:true,writable:true
    },
    name:{
        value:"Ankita"
    },
    surname:{
        value:"Ambewadikar",enumerable:true

    }
});
person1.age=22;

console.log(person1);

