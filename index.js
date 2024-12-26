let input;
let cel = document.getElementById("ctf");
let fah = document.getElementById("ftc");

function ctf(celcius){
    let fahrenheit = ((Number(celcius))*(9/5))+32;
    return fahrenheit;
}

function ftc(fahrenheit){
    let celcius = (Number(fahrenheit)-32)*(5/9);
    return celcius;
}

document.getElementById("sub").onclick = function(){
    if(cel.checked){
        input = document.getElementById("input").value;
        let result = ctf(input);
        document.getElementById("res").textContent = `${result}F`;
    }
    else if(fah.checked){
        input = document.getElementById("input").value;
        let result = ftc(input);
        document.getElementById("res").textContent = `${result}C`;
    }
    else{
        document.getElementById("res").textContent = `Select a conversion`;
    }
}
