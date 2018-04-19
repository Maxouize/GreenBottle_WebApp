$("#testClick").on('click', function() {
	alert("JQuery called");
});
$('.message a').click(function() {
	$('form').animate({
		height : "toggle",
		opacity : "toggle"
	}, "slow");
});