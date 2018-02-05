var flag;
var name;
// $(".button_search").on('click',function(){
//   var name=$('.inputbox')[0].value;
//   var number=$('.inputbox')[1].value;
//   console.log(name);
//   console.log(number);
//   $.ajax({
//     type : 'GET',
//     url : '/info',
//     dataType: 'JSON',
//     success : function(){
//
//     }
//   })
// });
$(".job").on('click',function(){
  $(".container4").show();
  window.location.hash=".container4";
  $(".jobimage img").show();
  $(".jobcontents p").hide();
  var imageid=this.id.charAt(2);

  $(".jobimage img").attr("src","./image/content_image/i"+imageid+".png");
  var a=$(".jobcontents p")[imageid-1];
  $(a).show();
  if(imageid==1){
    $('.jobimage_title').text("자금운용");
  }
  else if(imageid==2){
    $('.jobimage_title').text("글로벌");
  }
  else if(imageid==3){
    $('.jobimage_title').text("디지털");
  }
  else if(imageid==4){
    $('.jobimage_title').text("빅데이터");
  }
  else if(imageid==5){
    $('.jobimage_title').text("IB");
  }
  else if(imageid==6){
    $('.jobimage_title').text("리스크");
  }
  else if(imageid==7){
    $('.jobimage_title').text("IT");
  }
  else if(imageid==8){
    $('.jobimage_title').text("기업금융");
  }
  else if(imageid==9){
    $('.jobimage_title').text("WM");
  }

});

$(document).ready(function(){
  // $('#myModal').hide();
  $(".container4").hide();
  $(".jobimage img").hide();
  flag=1;
  name=null;
  name=".jobinfo1";
  //console.log('ready');
  $(".jobinfo1").show();
  $(".jobinfo2").hide();
  $(".jobcontents p").hide();
})

$(".nextbtn").on('click',function(){
  if(flag==1){
    flag=2;
    $(name).hide();
    name=".jobinfo"+flag;
    $(name).show();
  }
  else{
    flag=1;
    $(name).hide();
    name=".jobinfo"+flag;
    $(name).show();
  }
})

$('#gomovie').on('click',function(){
  $('#myform').submit();
});

$('#gocert').on('click',function(){
	  $('#myform_cert').submit();
	})


