/*
jQuery Hover3d
=================================================
Version: 1.1.0
Author: Rian Ariona
Website: http://ariona.net
Docs: http://ariona.github.io/hover3d
Repo: http://github.com/ariona/hover3d
Issues: http://github.com/ariona/hover3d/issues
*/

(function($){
	
	$.fn.hover3d = function(options){
		
		var settings = $.extend({
			selector      : null,
			perspective   : 1000,
			sensitivity   : 20,
			invert        : false,
			shine         : false,
			hoverInClass  : "hover-in",
			hoverOutClass : "hover-out",
			hoverClass    : "hover-3d"
		}, options);
		
		return this.each(function(){
			
			var $this = $(this),
				$card = $this.find(settings.selector);
			var currentX = 0;
			var	currentY = 0;


			if( settings.shine ){
				$card.append('<div class="shine"></div>');
			}
			var $shine = $(this).find(".shine");

			// Set perspective and transformStyle value
			// for element and 3d object
			$this.css({
				perspective: settings.perspective+"px",
				transformStyle: "preserve-3d"
			});
			
			$card.css({
				perspective: settings.perspective+"px",
				transformStyle: "preserve-3d"
			});

			$shine.css({
				position  : "absolute",
				top       : 0,
				left      : 0,
				bottom    : 0,
				right     : 0,
				transform : 'translateZ(1px)',
				"z-index" : 9
			});
			
			// Mouse Enter function, this will add hover-in
			// Class so when mouse over it will add transition
			// based on hover-in class
			var enter = enter_funct(event);
			
			// Mouse movement Parallax effect
			 var move = move_funct(event);
			
			// Mouse leave function, will set the transform
			// property to 0, and add transition class
			// for exit animation
			var leave = function leave_funct(){
				$card.addClass(settings.hoverOutClass+" "+settings.hoverClass);
				$card.css({
					perspective    : settings.perspective+"px",
					transformStyle : "preserve-3d",
					transform      : "rotateX(0) rotateY(0)"
				});
				setTimeout( function(){
					$card.removeClass(settings.hoverOutClass+" "+settings.hoverClass);
					currentX = currentY = 0;
				}, 1000 );
			}
			
			// Mouseenter event binding
			$this.on( "mouseenter", function(){
				return enter_funct();
			});
			
			// Mousemove event binding
			$this.on( "mousemove", function(event){
				return move_funct(event);
			});
			
			// Mouseleave event binding
			$this.on( "mouseleave", function(){
				return leave_funct();
			});
			
		});
		
	};
	
}(jQuery));


function move_funct(event){
	
	var w      = $card.innerWidth(),
		h      = $card.innerHeight(),
		currentX = Math.round(event.pageX - $card.offset().left),
		currentY = Math.round(event.pageY - $card.offset().top),
		dx     = currentX - w / 2,
		dy     = currentY - h / 2,
		theta  = Math.atan2(dy, dx),
		angle  = theta * 180 / Math.PI - 90;
	var ax;
	var	ay;
	
		if (settings.invert){
			ax = ( w / 2 - currentX)/settings.sensitivity;
			ay = -( h / 2 - currentY)/settings.sensitivity;
		} else {
			ax = -( w / 2 - currentX)/settings.sensitivity;
			( h / 2 - currentY)/settings.sensitivity;
		}

		
	if (angle < 0) {
		angle  = angle + 360;
	}
	

	$card.css({
		perspective    : settings.perspective+"px",
		transformStyle : "preserve-3d",
		transform      : "rotateY("+ax+"deg) rotateX("+ay+"deg)"
	});

	$shine.css('background', 'linear-gradient(' + angle + 'deg, rgba(255,255,255,' + event.offsetY / h * .5 + ') 0%,rgba(255,255,255,0) 80%)');
}

function enter_funct(){
	$card.addClass(settings.hoverInClass+" "+settings.hoverClass);
	var currentY = 0;
	var currentX = currentY;
	setTimeout(function(){
		$card.removeClass(settings.hoverInClass);
	}, 1000);
}
