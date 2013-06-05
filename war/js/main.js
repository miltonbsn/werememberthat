$(document).ready(function() {

	//Add new iten (Open)
   $(document.body).on('click', '.newReminder h2', function() {
   	$(this).parent('.newReminder').addClass('active');
   	$('.entry').slideDown('slow');
	});
   	
	//Add new iten (Close)
   $(document.body).on('click', '.newReminder.active h2', function() {
   	$(this).parent('.newReminder').removeClass('active');
   	$('.entry').slideUp('slow');
	});

   //Drag and Drop test
   $('.sortable').sortable({
     revert: true,
     axis: "y"
   });
   	
//End of Document Ready
});