$(document).ready(function() {

	//Add new item (Open)
   $(document.body).on('click', '.newReminder h2', function() {
   	$(this).parent('.newReminder').addClass('active');
   	$('.entry').slideDown('slow');
	});
   	
	//Add new item (Close)
   $(document.body).on('click', '#saveUser', function() {
	flip();
   });

   
   $(document.body).on('click', '#cancelUser', function() {
	   flip();
	   // A2
   });
   
   $(document.body).on('click', '#registerUser', function() {
	   flip();
	   // A1
	   
   });
   
   function flip() {
	   $(".public-container").toggleClass("flip");
   }
   
   //Drag and Drop test
   $('.sortable').sortable({
     revert: true,
     axis: "y"
   });
   	
//End of Document Ready
});