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
  $(".jobimage img").attr("src","./image/ighyun/i"+imageid+".jpg");
  var a=$(".jobcontents p")[imageid-1];
  $(a).show();

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
})