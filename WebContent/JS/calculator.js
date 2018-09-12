/**
 * 
 */

function doCalc(value) {
	document.getElementById("calcScreen").value=document.getElementById("calcScreen").value+value;
}

function doWipe(value) {
	document.getElementById("calcScreen").value ="";
}