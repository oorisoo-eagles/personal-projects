/* go from flashcard 1 to flashcard2*/
function next1()
  {
    window.location.href="flashcard2front.html";
}
/* go from flashcard 2 to flashcard 3*/
function next2()
  {
    window.location.href="flashcard3front.html"
}
/* go from flashcard 3 to flashcard 4*/
function next3()
  {
    window.location.href="flashcard4front.html"
}

function next4()
  {
    window.location.href="flashcard1front.html"
}
/* go from flashcard 1 front to flashcard 1 back*/
function flip1()
  {
    window.location.href="flashcard1back.html";
}
/* go from flashcard 1 back to flashcard 1 front*/
function flip2()
  {
    window.location.href="flashcard1front.html";
}
/* go from flashcard 2 front to flashcard 2 back*/
function flip3()
  {
    window.location.href="flashcard2back.html";
}
/* go from flashcard 2 back to flashcard 2 front*/
function flip4()
  {
    window.location.href="flashcard2front.html";
}
/* go from flashcard 3 front to flashcard 3 back*/
function flip5()
  {
    window.location.href="flashcard3back.html";
}
/* go from flashcard 3 back to flashcard 3 front*/
function flip6()
  {
    window.location.href="flashcard3front.html";
}
/* go from flashcard 4 front to flashcard 4 back*/
function flip7()
  {
    window.location.href="flashcard4back.html";
}
/* go from flashcard 4 back to flashcard 4 front*/
function flip8()
  {
    window.location.href="flashcard4front.html";
}
function check1()
  {
    let textbox = document.getElementById('answer1');
    let answer1 = textbox.value;
    if(answer1 == 'Cinna the Poet')
    {
      let correct=document.getElementById('correct1') ;
      correct1.innerText="you are right";
    }
    else{
      correct1.innerText="you are wrong";
    }
}
function check2()
  {
    let textbox = document.getElementById('answer2');
    let answer2 = textbox.value;
    if(answer2 == '1/3')
    {
      let correct=document.getElementById('correct2') ;
      correct2.innerText="you are right";
    }
    else{
      correct2.innerText="you are wrong";
    }
}
function check3()
  {
    let textbox = document.getElementById('answer3');
    let answer3 = textbox.value;
    if(answer3 == 'to be noble like the noble gases')
    {
      let correct=document.getElementById('correct3') ;
      correct3.innerText="you are right";
    }
    else{
      correct3.innerText="you are wrong";
    }
}
function check4()
  {
    let textbox = document.getElementById('answer4');
    let answer4 = textbox.value;
    if(answer4 == 'turtle')
    {
      let correct=document.getElementById('correct4') ;
      correct4.innerText="you are right";
    }
    else{
      correct4.innerText="you are wrong";
    }
}
