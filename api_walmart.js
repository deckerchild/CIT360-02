// Walmart API search

// Use searchWalmart as the main
// Pass search string as param 1
// Pass your callback function as param 2
function searchWalmart(searchText, callbackFunction){
    var searchURL = buildURL(searchText);
    getSearchDetails(searchURL,callbackFunction);
}


// example/test call back function
function myCallBack(result){
    console.log(result.status);
    if (result.status == 200) {
        console.log(JSON.parse(result.responseText));
    } else {
        console.log(result.status);
        console.log(result.responseText);
    }
}
// internal helper functions
function buildURL(searchText){
    // builds the walmart api search query
    // currently running through Ethan's server to resolve cross origin errors
    var searchURL = "https://stewartethan-portfolio.herokuapp.com/walmart?";
    // var searchURL = "https://api.walmartlabs.com/v1/search?";
    var apiKey = "apiKey=kmtpdvh9ta3bnnzfepjw66w9";
    var query = "&query=" + searchText;
    // var numItems = "&numItems=3";
    var searchQuery = searchURL + apiKey + query; // + numItems;
    return searchQuery;
}
function getSearchDetails(url, callback){
    // returns the XHR response to the callback function specified
    var xhr = new XMLHttpRequest();
    xhr.open("GET",url,true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            callback(xhr);
        }
        // if (xhr.readyState == 4 && xhr.status == 200) {
        //     var response = JSON.parse(xhr.responseText);
        //     callback(response);
        // }
    }
    xhr.setRequestHeader("Accept", "application/json");
    xhr.send(null);
}