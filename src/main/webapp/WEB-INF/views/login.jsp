<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<form action="/login" method="POST" class="form-signin">
	<div class="container">
		<h2 class="form-signin-heading">Please sign in</h2>
		<p>
			<font color=red><h3>${errorMessage}</h3></font>
		</p>
		<label for="inputEmail" class="sr-only">Email address</label> 
		<input type="text"	name="userid" id="inputEmail" class="form-control" placeholder="userid/email" required autofocus>
		<label for="inputPassword" class="sr-only">Password</label> 
		<input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password"required>
		<div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</div>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>