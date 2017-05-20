<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<h3><font color=blue> Welcome ${name}</font></h3> 
<label for="source" class="sr-only">Enter Source</label> 
	<input type="text"	name="source"  class="form-control" placeholder="source " required autofocus>
<label for="destination" class="sr-only">Enter Destination</label> 
	<input type="text"	name="destination"  class="form-control" placeholder="destination" required autofocus>





<%@ include file="../common/footer.jspf"%>