<%@include file="Menu.jsp"%>
<script src="JS/calculator.js"></script>

	<div class="calc">

	
		<form class="formButton" method="post">
			<div class="row">
				<input type="text" id="calcScreen" name="calcScreen" value=${ empty result ? "" : result }>
			</div>
			<div class="row">
				<input type="button" class="d1 ac" name="AC" value="AC" onclick="doWipe()">
			</div>
			<div class="row">
				<input type="button" class="d3 buttons" name="b1" value="1" onclick="doCalc(1)">
				<input type="button" class="d3 buttons" name="b2" value="2" onclick="doCalc(2)">
				<input type="button" class="d3 buttons" name="b3" value="3" onclick="doCalc(3)">
				<input type="button" class="d3 operators" name="b3" value="+" onclick="doCalc('+')">
			</div>
			<div class="row">
				<input type="button" class="d3 buttons" name="b4" value="4" onclick="doCalc(4)">
				<input type="button" class="d3 buttons" name="b5" value="5" onclick="doCalc(5)">
				<input type="button" class="d3 buttons" name="b6" value="6" onclick="doCalc(6)">
				<input type="button" class="d3 operators" name="-" value="-" onclick="doCalc('-')">
			</div>
			<div class="row">
				<input type="button" class="d3 buttons" name="b7" value="7" onclick="doCalc(7)" >
				<input type="button" class="d3 buttons" name="b8" value="8" onclick="doCalc(8)">
				<input type="button" class="d3 buttons" name="b9" value="9" onclick="doCalc(9)">
				<input type="button" class="d3 operators" name="*" value="*" onclick="doCalc('*')">
			</div>
			
			<div class="row">
				<input type="button" class="d3 buttons" name="b1" value="0" onclick="doCalc(0)">
				<input type="button" class="d3 buttons" name="b2" value="." onclick="doCalc('.')">
				<!-- Send form --> 
				<input type="submit" class="d3 operators" name="calculate" value="=">
				<input type="button" class="d3 operators" name="/" value="/" onclick="doCalc('/')">
			</div>
		</form>
	</div>
<%@include file="commonFooter.jsp"%>