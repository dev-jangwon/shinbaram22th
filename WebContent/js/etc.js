var flag;
var name;
$(".button_search").on('click',function(){
  var name=$('.inputbox')[0].value;
  var number=$('.inputbox')[1].value;
  console.log(name);
  console.log(number);
  $.ajax({
    type : 'GET',
    url : '/info',
    dataType: 'JSON',
    success : function(){

    }
  })
});
$(".job").on('click',function(){
  console.log(this.id);
});
$(document).ready(function(){
  flag=1;
  name=null;
  name=".jobinfo1";
  //console.log('ready');
  $(".jobinfo1").show();
  $(".jobinfo2").hide();
})
$(".nextbtn").on('click',function(){
  if(flag==1){
    console.log('d');
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
