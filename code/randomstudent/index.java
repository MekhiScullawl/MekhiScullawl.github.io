<!DOCTYPE html>
<html>
<body>

<h3>Random Generator</h3>

<form id="myForm">
  Number of Students: <input type="number" id="input" name="fname" value="30"><br>
</form>

<p></p>

<button type="button" onclick="myFunction()" onerror="error">Generate</button>



<p id="list">[List]</p>

<p id="output">Output</p>

<script>
var z = 0;
var list = ["[0"];
var x = 0;

function myFunction() {
  var numClass = document.getElementById("input").value;

  var count = 1;

  var arrayLength = list.length;/*
  if  (arrayLength == numClass){
      list = [0]
      alert("Every student has been called on")
  }
  */
  x = random(list, numClass);

  list += [", " + x];

  
  document.getElementById("list").innerHTML = list + "]";
  document.getElementById("output").innerHTML = "Student: " + x;

}


function getRandInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1) ) + min;
}


function random(list, numClass) {
  var x = getRandInt(1,numClass);

  if (list.indexOf(x) > -1){
    x = random(list, numClass);
  }

  return x;
}
function error(){
  list = ["[0"];
  alert("Every student has been called on")
}


</script>

</body>
</html>