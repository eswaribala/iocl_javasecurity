/**
 * Created by BALASUBRAMANIAM on 08-01-2015.
 */
for(i=0;i<window.localStorage.length;i++)
{
    if (window.localStorage.getItem("photo"+i) != undefined) {


        retrieveData(window.localStorage.getItem("photo"+i));


    }
}
function retrieveData(filename)
{

    console.log("image available");
    var img = new Image();

    img.onload = function (evt) {
        var photoref = document.getElementById("photosection");
        photoref.appendChild(img);
        node = document.createElement("hr");
        photoref.appendChild(node);
    }

    img.src = filename;
    img.width=50;
    img.height=50;


}