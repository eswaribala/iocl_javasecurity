/**
 * Created by BALASUBRAMANIAM on 08-01-2015.
 */

function SaveImage()
{
   var fileref=document.getElementById("photo");
   var username=document.getElementById("username");
    console.log(username.value);
    window.localStorage.setItem("username",username.value);
   var filetype=/image.*/;
    console.log(fileref.files.length);
   // var imgarr = [];
  for(i=0;i<fileref.files.length;i++)
  {

        if (fileref.files[i].type.match(filetype)) {
            keyname="photo"+fileref.files.length+i;
            console.log("file type matching");
            store(i,fileref.files[i]);


        }
        else {

            console.log("file type not matching");

        }

  }

    //window.localStorage.setItem("photos", imgarr);
}
function store(i,f)
{
    var reader = new FileReader();
    reader.readAsDataURL(f);
    reader.onload = function () {

        window.localStorage.setItem("photo"+i,reader.result);
        console.log("file stored");
    };
}