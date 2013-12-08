
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
     <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />
    <link rel="icon" type="./images/png" href="images/icon.jpg"/>
	 <title> Portail Pédagogique TG  </title>	
</head> 
<body>		
<div class="container">
  
<div id="pp_im"> 
   </div>
 
 
<form class="form-horizontal form-sign-in"  method ="post" action="auth">

  <div class="form-group">
    <label for="inputEmail3" class="col-sm-3 control-label">Identifiant</label>
    <div class="col-sm-9">
      <input type="email" class="form-control" name="email" placeholder="Adresse email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-3 control-label">Mot de passe</label>
    <div class="col-sm-9">
      <input type="password" class="form-control" name="passwd" placeholder="Mot de passe">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-9">
      <div class="checkbox">
        <label>
          <input type="checkbox">Rester connecté
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-9">
      <button type="submit" class="btn btn-default">Se connecter</button>
    </div>
  </div>
</form>

</div>
    
    
 
</body>
</html>
