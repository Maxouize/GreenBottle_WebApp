<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<jsp:include page="header.jsp" />
	<main role="main">
	<div id="my_carousel" class="carousel slide w-50 center-block"
		data-ride="carousel" style="width: 50%; align-items: center;">
		<!-- Bulles -->
		<ol class="carousel-indicators">
			<li data-target="#my_carousel" data-slide-to="0" class="active"></li>
			<li data-target="#my_carousel" data-slide-to="1"></li>
			<li data-target="#my_carousel" data-slide-to="2"></li>
		</ol>
		<!-- Slides -->
		<div class="carousel-inner">
			<!-- Page 1 -->
			<div class="item active">
				<div class="carousel-page">
					<img src="img/bateauBouteille.jpg" alt="bateauBouteille"
						class="img-responsive" style="margin: 0px auto;" />
				</div>
			</div>
			<!-- Page 2 -->
			<div class="item">
				<div class="carousel-page">
					<img src="img/hommeBouteille.jpg"
						class="img-responsive img-rounded" alt="hommeBouteille"
						style="margin: 0px auto;" />
				</div>
			</div>
			<!-- Page 3 -->
			<div class="item">
				<div class="carousel-page">
					<img src="img/tasBouteille.jpg" alt="tasBouteille"
						class="img-responsive img-rounded"
						style="margin: 0px auto; max-height: 100%;" />
				</div>
			</div>
		</div>
		<!-- Contrôles -->
		<a class="left carousel-control" href="#my_carousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span>
		</a> <a class="right carousel-control" href="#my_carousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span>
		</a>
	</div>

	<hr class="featurette-divider">
	
	<!-- Marketing messaging 
	 ================================================== -->

	<div class="container marketing">

		<div class="row">
			<div class="col-lg-4">
				<i style="color: #8cc443;" class="fa fa-envira fa-3x"></i>
				<h2>
					Demandé, Déposé,<br> C'est recyclé!
				</h2>
				<p>Pour toutes vos bouteilles et emballages plastique, faites
					appel à nos service et donnez leurs une seconde vie! Pas de
					préparation, vous pouvez laisser les bouchons :)</p>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<i style="color: #8cc443;" class="fa fa-thumbs-o-up fa-3x"></i>
				<h2>
					Notre <br>concept
				</h2>
				<p>Comme vous le savez peut être, la france n'est pas encore
					championne du monde du recyclage. Dans des villes comme la notre,
					le tri n'est pas encore optimal et peut être amélioré. Notre
					démarche consiste à récupérer vos déchets plastique et faire en
					sorte qu'ils soient recyclés de manière la plus fiable qui soit. En
					optant pour notre solution, vous avez l'assurance que vous agissez
					en faveur de la planète.</p>
			</div>
			<div class="col-lg-4">
				<i style="color: #8cc443;" class="fa fa-map-marker fa-3x"></i>
				<h2>
					Nos <br>partenaires
				</h2>
				<p>Nous travaillons aussi bien avec des entreprise locales que
					nationales, afin de toujours pouvoir opter pour la meilleure
					solution en matière de recyclage.</p>
				<p>
					<a class="btn btn-secondary" href="https://www.paprec.com/fr"
						role="button">Paprec »</a> <a class="btn btn-secondary"
						href="http://www.dainville-recyclage.fr/" role="button">Dainville
						Recyclage »</a>
				</p>
			</div>
		</div>

		<hr class="featurette-divider">

	</div>
	
 	<footer class="container">
		<p class="float-right">
			<a href="#myNavbar">Back to top</a>
		</p>
		<p>
			© 2017-2018 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a>
		</p>
	</footer> 
	</main>
</body>
</html>
