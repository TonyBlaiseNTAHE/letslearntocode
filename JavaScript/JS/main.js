const myImage = document.querySelector("img");

myImage.onclick = () => {
    const mySrc = myImage.getAttribute("src");
    if (mySrc === "images/DSC_7370 (6).jpg") {
        myImage.setAttribute("scr", "images/DSC_7370 (4).jpg");
    } else {
        myImage.setAttribute("scr", "images/DSC_7370 (6).jpg");
    }
};

let myButton = document.querySelector("button");
let myHeading = document.querySelector("h1");

function setUserName(){
    const myName = prompt("Please enter your name. ");
    localStorage.setItem("name", myName);
    myHeading.textContent = `Google is cool, ${myName}`;
}

if (!localStorage.getItem("name")){
    setUserName();
} else {
    const storedName = localStorage.getItem("name");
    myHeading.textContent = `Google is cool, ${storedName}`;
}
myButton.onclick = () => {
    setUserName();
}
