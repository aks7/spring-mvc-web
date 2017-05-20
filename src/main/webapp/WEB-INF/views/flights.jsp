<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<font><h3>Welcome ${name}!!</h3> </font>
<form action="/flights" method="post" class="form-signin"> 

<label for="source" class="sr-only">Enter Source</label> 
	<input type="text"	name="source"  class="form-control" placeholder="source " required autofocus>
<label for="destination" class="sr-only">Enter Destination</label> 
	<input type="text"	name="destination"  class="form-control" placeholder="destination" required autofocus>
<button class="btn btn-lg btn-primary btn-block" type="submit">Search</button>
</form>



<%@ include file="../common/footer.jspf"%>