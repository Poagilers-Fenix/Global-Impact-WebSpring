window.onload = function () {

 var porta = document.querySelector('#porta')

 porta.addEventListener('mouseenter', () => {
porta.src = '../img/portaAberta.png'
})

 porta.addEventListener('mouseout', () => {
porta.src = '../img/portaFechada.png'
})


var lari = document.getElementById('unidade');
console.log(lari);

document.getElementById("selecionar").onclick = function () { 
	var comboCidades = document.getElementById("cboCidades");
	 while (comboCidades.length) {
		 comboCidades.remove(0);
	 } 
};
//document.addEventListener("click", () => {
  //let checkbox = document.getElementById("checkTrue");
    //if (checkbox.checked) {
      //console.log("O cliente marcou o checkbox");
	  //console.log(checkbox.name);
    //} else {
      //console.log("O cliente não marcou o checkbox");
	  //}
  //})

 }