

function submitSearch() {
  hideDisplay();
  var product = document.getElementById("product").value;
  // window.alert("Search submitted: " + product);
  dataHandle();
}

function display() {
  document.getElementById("main").style.display = 'inline-block';
  document.getElementById("first").style.display = 'block';
}

function hideDisplay() {
  document.getElementById("main").style.display = "none";
}

function openDrawer(evt, typeName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");

  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace("active","");
  }

  document.getElementById(typeName).style.display = "block";
  evt.currentTarget.className += " active";
}





