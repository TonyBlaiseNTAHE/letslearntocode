#!/usr/bin/nodejs
function myFunction() {
    var myVar = "Tony";
    if (true) {
        var myVar = "Keza";
        console.log(myVar);
    }
    console.log(myVar);
}
//console.log(myVar);

myFunction();