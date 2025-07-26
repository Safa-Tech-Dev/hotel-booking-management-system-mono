function validation(){

	clearErrors();
	var city = document.getElementById('city').value;
	var checkin = document.getElementById('checkin').value;
	var checkout = document.getElementById('checkout').value;
	var rooms = document.getElementById('rooms').value;
	var adults = document.getElementById('adults').value;
	var child = document.getElementById('child').value;
	
	
	
	
	
	if(city == "" || city == null){
	  document.getElementById('cityName').innerHTML =" ** Please fill the city field";
	  return false;
	}
	if((city.length <= 2) || (city.length > 30)) {
	  document.getElementById('cityName').innerHTML =" ** City lenght must be between 2 to 30";
	  return false;	
	}
	if(checkin == ""){
		document.getElementById('checkinDate').innerHTML = " ** Check in Date must be filled";
		return false;	
	}
	if(checkout == ""){
		document.getElementById('checkoutDate').innerHTML = " ** Check out Date must be fliled";
		return false;	
	}
	if(rooms == "" ){
		document.getElementById('noOfRooms').innerHTML = " ** Number of rooms must be filled";
		return false;	
	}
	if(rooms < 0 ){
		document.getElementById('noOfRooms').innerHTML = " ** Number of rooms can't be negative enter positive number";
		return false;	
	}
	if(adults == "" ){
		document.getElementById('noOfAdults').innerHTML = " ** Number of adults must be filed";
		return false;	
	}
	if(adults < 0 ){
		document.getElementById('noOfAdults').innerHTML = " ** Number of adults can't be negative enter positive number";
		return false;	
	}
	if(child == "" ){
		document.getElementById('noOfchild').innerHTML = " ** Number of child must be filed";
		return false;	
	}
	if(child < 0 ){
		document.getElementById('noOfchild').innerHTML = " ** Number of child can't be negative enter positive number";
		return false;	
	}
	
}
function clearErrors(){
	

    errors = document.getElementsByClassName('formerror');
    for(let item of errors)
    {
        item.innerHTML = "";
    }
}
function guestValidation(){

	clearErrors();
	var GuestFirstName = document.getElementById('firstname').value;
	var GuestLastName = document.getElementById('lastname').value;
	var dob = document.getElementById('dateofbirth').value;
	var myDate = new Date(dob);
	var today = new Date();
	var Tguest = document.getElementById('totalguest').value;
	var Totalrooms = document.getElementById('totalroom').value;
	
	var cardNumber = document.getElementById('cardnumber').value;
	var billAmount = document.getElementById('amount').value;





	if(GuestFirstName == ""){
		document.getElementById('First Name').innerHTML =" ** Please fill the First Name field";
		return false;
	}
	if((GuestFirstName.length < 2) || (GuestFirstName.length > 15)) {
		document.getElementById('First Name').innerHTML =" ** First Name length must be between 2 to 15";
		return false;	
	}
	if(!isNaN(GuestFirstName)){
		document.getElementById('First Name').innerHTML =" ** only characters are allowed";
		return false;
	}



	if (GuestLastName == "") {
		document.getElementById('Last Name').innerHTML = " ** Please fill the Last Name";
		return false;
	}
	if ((GuestLastName.length < 2) || (GuestLastName.length > 30)) {
		document.getElementById('Last Name').innerHTML = " ** Last Name length must be between 2 and 30";
		return false;
	}
	if (!isNaN(GuestLastName)) {
		document.getElementById('Last Name').innerHTML = " ** only characters are allowed";
		return false;
	}





	if(dob == ""){
		document.getElementById('Date Of Birth').innerHTML =" ** Please fill the Date of Birth";
		return false;
	}


	if(myDate > today){
		document.getElementById('Date Of Birth').innerHTML =" ** You can not enter a DOB in the future";
		return false;
	}
	if (Tguest == "") {
		document.getElementById('Total Guest').innerHTML = " ** Please fill the Total Guest field";
		return false;
	}



	
	if (Totalrooms == "") {
		document.getElementById('Total Rooms').innerHTML = " ** Please fill the Total Rooms field";
		return false;
	}
	if (isNaN(Totalrooms)) {
		document.getElementById('Total Rooms').innerHTML = " ** user must write digits only not characters";
		return false;
	}

	if (cardNumber == "") {
		document.getElementById('Credit/Debit Card Number').innerHTML = " ** Please fill the Card Number field";
		return false;
	}
	if (isNaN(cardNumber)) {
		document.getElementById('Credit/Debit Card Number').innerHTML = " ** user must write digits only not characters";
		return false;
	}
	if (cardNumber.length != 16) {
		document.getElementById('Credit/Debit Card Number').innerHTML = " ** Card Number must be 16 digits only";
		return false;
	}


	if (billAmount == "") {
		document.getElementById('Bill Amount').innerHTML = " ** Please fill the Total Rooms field";
		return false;
	}
	if (isNaN(billAmount)) {
		document.getElementById('Bill Amount').innerHTML = " ** user must write digits only not characters";
		return false;
	}


}
function validation3(){
	clearErrors();
	var user = document.getElementById('hotelname').value;
	var pass = document.getElementById('gst').value;
	var Address = document.getElementById('address').value;
	var City = document.getElementById('city').value;
	
	
	if(user == ""){
		document.getElementById('Hotel Name').innerHTML =" ** Please fill the Hotel Name field";
		return false;
	}
	if((user.length <= 2) || (user.length > 20)) {
		document.getElementById('Hotel Name').innerHTML =" ** Hotel Name length must be between 2 and 20";
		return false;	
	}
	if(!isNaN(user)){
		document.getElementById('Hotel Name').innerHTML =" ** only characters are allowed";
		return false;
	}







	if(pass == ""){
		document.getElementById('GST Number').innerHTML =" ** Please fill the GST Number field";
		return false;
	}
	if((pass.length ) !=12) {
		document.getElementById('GST Number').innerHTML =" ** GST Number must be 12 digit numeric";
		return false;	
	}



	if (Address == "") {
		document.getElementById('Address').innerHTML = " ** Please fill the Address field";
		return false;
	}



	if (City == "") {
		document.getElementById('City').innerHTML = " ** Please fill the City field";
		return false;
	}



	
}



function check(elem) {
	// use one of possible conditions
	 if (elem.value == 'Aadhaar Card' ){
		document.getElementById("uid-aadhaar").style.display = 'block';
	}
	else if( elem.value=='Pan Card'){
		document.getElementById("uid-panCard").style.display = 'block';
	}
	else
	{
		document.getElementById("uid-panCard").style.display = 'none';
	}

}
function validation4(){

	clearErrors();
	var fname=document.getElementById('fname').value;
	var lname=document.getElementById('lname').value;

	var user = document.getElementById('user').value;
	var pass = document.getElementById('password').value;
	var emails = document.getElementById('email').value;
	
	var dob = document.getElementById('dob').value;
	var myDate = new Date(dob);
	var today = new Date();
	var mobile = document.getElementById('mob').value;
	
	var uanAdhar = document.getElementById('uid-aadhaar').value;
	var uanPan = document.getElementById('uid-pan').value;
	
	
	if(fname==""){
		document.getElementById('fname1').innerHTML =" ** Please fill the username field";
		return false;
	}
	if((fname.length)<2 || (fname.length)>20){
		document.getElementById('fname1').innerHTML =" ** First Name length should be between 2 and 20";
		return false;
	}


	if(lname==""){
		document.getElementById('lname1').innerHTML =" ** Please fill the username field";
		return false;
	}
	if((lname.length)<2 || (lname.length)>20){
		document.getElementById('lname1').innerHTML =" ** Last Name length should be between 2 and 20";
		return false;
	}

	



	if(user == ""){
		document.getElementById('username').innerHTML =" ** Please fill the username field";
		return false;
	}
	if((user.length < 4) || (user.length > 20)) {
		document.getElementById('username').innerHTML =" **Username should be minimum 4 and maximum 20 characters";
		return false;   
	}
	if(!isNaN(user)){
		document.getElementById('username').innerHTML =" ** only characters are allowed";
		return false;
	}

	if(pass == ""){
		document.getElementById('passwords').innerHTML =" ** Please fill the password field";
		return false;
	}
	if((pass.length < 5) || (pass.length > 20)) {
		document.getElementById('passwords').innerHTML =" ** Passwords lenght must be between  8 and 20";
		return false;   
	}


	if(emails == ""){
		document.getElementById('emailid').innerHTML =" ** Please fill the email field";
		return false;
	}
	
	if(dob == ""){
		document.getElementById('dateOfBirth').innerHTML =" ** Please fill the email field";
		return false;
	}

	if(myDate > today){
		document.getElementById('dateOfBirth').innerHTML =" ** You can not enter a DOB in the future";
		return false;
	}


	if(mobile == ""){
		document.getElementById('mobileno').innerHTML =" ** Please fill the mobile NUmber field";
		return false;
	}
	if(isNaN(mobile)){
		document.getElementById('mobileno').innerHTML =" ** user must write digits only not characters";
		return false;
	}
	if(mobile.length!=10){
		document.getElementById('mobileno').innerHTML =" ** Mobile Number must be 10 digits only";
		return false;
	}
	if(uanAdhar == ""){
		document.getElementById('adhar').innerHTML =" ** Aadhaar Number must be provided";
		return false;
	}
	if(isNaN(uanAdhar)){
		document.getElementById('adhar').innerHTML =" ** user must write digits only not characters";
		return false;
	}
	if(uanAdhar.length!=12){
		document.getElementById('adhar').innerHTML =" ** Aadhaar Number must be 12 digits only";
		return false;
	}
	if(uanPan == ""){
		document.getElementById('pan').innerHTML =" ** PAN Number must be provided";
		return false;
	}
	
	if(uanPan.length!=10){
		document.getElementById('pan').innerHTML =" ** PAN Number must be 10 digits only";
		return false;
	}

	
}

function roomValidation(){

	clearErrors();
	var Roomtype = document.getElementById('roomtype').value;
	var Roomsize = document.getElementById('roomsize').value;
	var Price = document.getElementById('price').value;
	var Amenity = document.getElementById('amenity').value;
	var Totalrooms = document.getElementById('totalroom').value;

	
	if (Roomtype == "") {
		document.getElementById('Room Type').innerHTML = " ** Please fill the Room Type field";
		return false;
	}

	
	if (Roomsize == "") {
		document.getElementById('Room Size').innerHTML = " ** Please fill the Room Size field";
		return false;
	}


	if (isNaN(Roomsize)) {
		document.getElementById('Room Size').innerHTML = " ** user must write digits only not characters";
		return false;
	}



	if (Price == "") {
		document.getElementById('Price').innerHTML = " ** Please fill the Price field";
		return false;
	}
	if (isNaN(Price)) {
		document.getElementById('Price').innerHTML = " ** user must write digits only not characters";
		return false;
	}
	


	if (Amenity == "") {
		document.getElementById('Amenity').innerHTML = " ** Please fill the Amenity field";
		return false;
	}



	if (Totalrooms == "") {
		document.getElementById('Total Rooms').innerHTML = " ** Please fill the Total Rooms field";
		return false;
	}
	if (isNaN(Totalrooms)) {
		document.getElementById('Total Rooms').innerHTML = " ** user must write digits only not characters";
		return false;
	}
	if (Totalrooms.length != 2) {
		document.getElementById('Total Rooms').innerHTML = " ** Total Rooms must be 2 digits only";
		return false;
	}
}