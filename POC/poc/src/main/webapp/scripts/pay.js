function onSuccess(data, status, jqXHR) {
	data = atob(data)
	window.location = "iframe.html?iframe="+data;

}

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(window.location.href);
    console.log("results === "+results)
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};


function iframeURL(){

	var src = getUrlParameter('iframe')
	console.log("src == "+src);

	$('#frame').attr('src',src);
}
var params = {};
var formData = new FormData();
function queryString() {
	
	// var getParams = function (url) {

	var url = window.location.href;
	//url='https://www.google.co.in/?order_id=8L8hq&status=CHARGED&status_id=21&signature=mgF5TQi1hZfzdrr%2FaEGnd1yRHbFNa3oGsjnoSoTvKjA%3D&signature_algorithm=HMAC-SHA256';
	console.log(url);
	var parser = document.createElement('a');
	parser.href = url;
	var query = parser.search.substring(1);
	var vars = query.split('&');
	for (var i = 0; i < vars.length; i++) {
		var pair = vars[i].split('=');
		console.log("pair i " + pair)
		params[pair[0]] = decodeURIComponent(pair[1]);

	}
	// return params;
	// };
	// var url =
	// 'https://www.google.co.in/?order_id=8L8hq&status=CHARGED&status_id=21&signature=mgF5TQi1hZfzdrr%2FaEGnd1yRHbFNa3oGsjnoSoTvKjA%3D&signature_algorithm=HMAC-SHA256';
	// var par=getParams(url);
	var val = "";
	var i = 1;
	for ( var key in params) {
		// alert("val")
		if (key == "status_id") {
			break;
		}
		val += "<tr class=" + "table-info" + ">";
		val += "<th scope=" + "row" + ">" + i + "</th>";
		val += "<td >" + key + "</td>";
		key == "order_id" ? val += "<td><a href='#' id='orderid'>" + params[key]
				+ "</a></td>" : val += "<td>" + params[key] + "</td>";
		val += "</tr>";
		i++;

		console.log("User " + params[key] + " is #" + key);

	}
	// alert("val---"+val)
	document.getElementById("ftbody").innerHTML = val;
	formData.append("queryString", url);
	console.log(formData);
	$.ajax({
		type : "POST",
		url : "https://www.camspay.in:8443/poc/service/merchant/queryString",
		// url : "http://localhost:8080/poc/service/merchant/queryString",
		data : formData,
		contentType : false,
		crossDomain : false,
		processData : false,
		timeout : 60000,
		cache : false,
		headers : {
			"Authorization" : "Basic " + btoa("camspay" + ":" + "cams$123"),
			//"Authorization" : "Basic " + btoa("camspay" + ":" + "camspay@123"),
		},

	});
}

function onFailure(jqXHR, status) {
	alert(status);
}

$('#pay').on(
		'click',
		function(event) {
			event.preventDefault();

			formData.append("amount", $("#amount").val());
			formData.append("remarks", $("#remarks").val());
			

			$.ajax({
				type : "POST",
				url : "https://www.camspay.in:8443/poc/service/merchant/pay",
				 //url : "http://localhost:8080/poc/service/merchant/pay",
				data : formData,
				contentType : false,
				crossDomain : false,
				processData : false,
				timeout : 60000,
				cache : false,
				headers : {
					"Authorization" : "Basic "
							+ btoa($("#user_id").val() + ":"
									+ $("#password").val()),
				},
				success : function(data, status, jqXHR) {
					console.log("data " + data)
					onSuccess(data, status, jqXHR);

				},
				error : function(jqXHR, status) {
					onFailure(jqXHR, status);
				}
			});
		});
$(document).on('click','#orderid' ,  function(event) {
	console.log("cliecked")
	var filename = jQuery(this).parents('tr').find("td:eq(1)").text();
	
	$.ajax({
		type : 'GET',
		url : "https://www.camspay.in:8443/poc/service/merchant/searchFile?filename="+filename,
		//url : "http://localhost:8080/poc/service/merchant/searchFile?filename=AwJXt",
		contentType : false,
		crossDomain : false,
		processData : false,
		headers : {
			"Authorization" : "Basic " + btoa("camspay" + ":" + "cams$123"),
			//"Authorization" : "Basic " + btoa("camspay" + ":" + "camspay@123"),
		},
		success : function(data, status, jqXHR) {
		//	alert("data "+data)
			
			$('#data').show();
			$('#data').val(data);
		},
		error : function(jqXHR, status) {
			console.log("Error " + status)
		}

	})

})
