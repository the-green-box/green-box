$('.summernote').summernote({
	height: 300,   //set editable area's height
	codemirror: { // codemirror options
		theme: 'monokai'
	},
});

$(document).ready(function() {
	$('#summernote').summernote('justifyLeft');
	$('#summernote').summernote('fontName', 'Arial');
	$('#summernote').summernote({placeholder: 'write here...'});

});

// save texts of html page 
 var save = function() {
 	  var makrup = $('.click2edit').summernote('code');
 	  $('.click2edit').summernote('destroy');
 };

