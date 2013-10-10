<html>

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>

<script type="text/javascript" >
$(document).ready(function(){
  sendAjax();
});
 
function sendAjax() {
 
$.ajax({
    url: "/service_rs/projets",
    type: 'POST',
    dataType: 'json',
    data: "{\"nom\":\"4ptest\"}",
    contentType: 'application/json',
    mimeType: 'application/json',
    success: function(data) {
        alert(data.id + " " + data.nom);
    },
    error:function(data,status,er) {
        alert("error: "+data+" status: "+status+" er:"+er);
    }
});
}
</script>

<body>
<h2>Hello World!</h2>
</body>
</html>



