
sayhello=function(){

    console.log("HELLO");
}
sayhello();//get evaluated at run time

sayhello=function() {

    console.log("HELLOWORLD");
}
sayhello();
/*
//complie time
function sayhello(){

    console.log("HELLO");
}
sayhello();

function sayhello() {

    console.log("HELLOWORLD");
}
sayhello();
*/
