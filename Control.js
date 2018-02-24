
//Store the API Walmart data that was retrieved into WalmartCallback
function handleWalmartResonse(response) {
    //Check for error

    if (response.status === 200) {
       var results = JSON.parse(response.response);

    }
    else if(response.status > 200)
        {
            var newP = document.createElement("p");
            var tNode = document.createTextNode("status " + response.status + ": " + response.statusText);
            newP.appendChild(tNode);
            newP.className += "errMsg";
            document.getElementById("main").insertBefore(newP, document.getElementById("main").childNodes[0]);
            return;
        }
    //check to see if we have 3 results



    //once results are parsed into results, walk through it with a For loop
    for (var i = 0;i < 3; i++) {

        var result = results.items[i];

        var information = {name: result.name, price: result.salePrice, link: result.productUrl, image: result.thumbnailImage};
        handleObjects(i + 1, information, "walmart");
        /*description: result.shortDescription,*/

    }

    localStorage.walmart = "true";
    checkAPIsForFinish();
    return;
}

function handleObjects(loopNumber, result, apiName)
{
    var id = 0;
    switch(apiName) {
        case "walmart":
           id = "wm_" + loopNumber + "_";
            break;
        case "ebay":
            id = "eb_" + loopNumber + "_";
            break;
    }
    document.getElementById(id + "name").innerHTML = result.name;
    document.getElementById(id + "price").innerHTML = "$" + result.price;
    //document.getElementById(id + "desc").innerHTML = result.description;
    document.getElementById(id + "img").src = result.image;
    document.getElementById(id + "img").alt = "no image available";
    document.getElementById(id + "link").href = result.link;
    // document.getElementById(id + "link").innerHTML = apiName + " link"; /* link text */
    document.getElementById(id + "link").target = "_blank"; /* open in new window */
}

function handleEbayResponse(response)
{
    //Check for error

    if (response.status === 200) {
       var results = JSON.parse(response.response);

    }
    else if(response.status > 200)
        {
            var newP = document.createElement("p");
            var tNode = document.createTextNode("status " + response.status + ": " + response.statusText);
            newP.appendChild(tNode);
            newP.className += "errMsg";
            document.getElementById("main").insertBefore(newP, document.getElementById("main").childNodes[0]);
            return;
        }
    //check to see if we have 3 results



    //once results are parsed into results, walk through it with a For loop
    for (var i = 0;i < 3; i++) {

        var result = results[i];

        var information = {name: result.title, price: result.price, link: result.link, image: result.img};
        handleObjects(i + 1, information, "ebay");

    }
    localStorage.ebay = "true";
    checkAPIsForFinish();
    return;
}

function checkAPIsForFinish(){
    if (localStorage.walmart == "true" && localStorage.ebay == "true"){
          document.getElementById("loader").style.display = "none";
          display();
    }
}

function dataHandle(){
    var getSearchText = document.getElementById("product").value;
    localStorage.walmart = "false";
    localStorage.ebay = "false";
    document.getElementById("loader").style.display = "block";
    searchWalmart(getSearchText, handleWalmartResonse);
    searchForItem(getSearchText, 3, handleEbayResponse);

    // if (localStorage.walmart === true && localStorage.ebay === true){
    //       display();
    //}

    // for(var i = 10000; i < 10000; i--)
    //     {
    //         wait(1000);
    //         if(localStorage.walmart == true && localStorage.ebay == true)
    //             continue;
    //         i =- 1000;
    //     }
    // if(localStorage.walmart == false || localStorage.ebay == false)
    //     {
    //         window.alert("One of the APIs timed out");
    //     }
}

