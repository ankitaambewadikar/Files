
var person1 ={ name:"Brenden" };
console.log(person1);
Object.defineProperty(person1 , "name",{value:"Amitabh",
                                        configurable:true,
                                        writable:true,
                                        enumerable:false});
console.log(person1);
Object.defineProperty(person1 , "name",{value:"Abhi",
                                        configurable:true,
                                        writable:true,
                                        enumerable:true});//here as enumerable is false the value of name is notchanged and empty set is returned
console.log(person1);   

Object.defineProperty(person1 , "name",{value:"Abhi",
                                        configurable:true,
                                        writable:false,
                                        enumerable:true});
console.log(person1);

Object.defineProperty(person1 , "name",{value:"Ankita",
                                        configurable:false,//conf we have done false but the line is going to execute but next line will not ie line27
                                        writable:false,
                                        enumerable:true});
console.log(person1);

/*Object.defineProperty(person1 , "name",{value:"Deepika",
                                        configurable:true,//line error will occur as conf is false in prev conf
                                        writable:true,
                                        enumerable:true});
console.log(person1);*/

Object.defineProperty(person1 , "name",{value:"Deepika",
                                        configurable:true,//line error will occur as conf is false in prev conf
                                        writable:true,
                                        enumerable:true});
console.log(person1);

Object.defineProperty(person1 , "name",{value:"Deepika",
                                        configurable:true,//line error will occur as conf is false in prev conf
                                        writable:true,
                                        enumerable:true});
console.log(person1);




