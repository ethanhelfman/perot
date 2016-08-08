function uptimebasic(input) {
  SpreadsheetApp.flush(); //refreshes answers
  var arr = input;
  arr[0] = ",";
  var arrstr = arr.toString().replace(/,/g , "/");
  var count = (arr.toString().match(/YES/g) || []).length; //counts yes
  var nocount = (arr.toString().match(/NO/g) || []).length; //counts no
  var len = 0;
  for(var i = 0; i < arr.length; i++) { //gets length
    if(arr[i] == "YES" || arr[i] == "NO")
      len++;
  }
  if((len) == 0)
    return "100%";
  var percent = (count * 100) / (len);
  return (Math.round(percent * 100) / 100) + "%";
}

function uptimerobot(input) {
  SpreadsheetApp.flush();
  var arr = input;
  arr[0] = ","; //clears title
  var arrstr = arr.toString().replace(/,/g , "/"); //clears empties
  arrstr = arr.toString().replace(/ /g , ""); //clears empties left over
  var count = (arr.toString().match(/ALL/g) || []).length; //counts
  var thrcount = (arr.toString().match(/3/g) || []).length; //counts
  var twocount = (arr.toString().match(/2/g) || []).length; //counts
  var onecount = (arr.toString().match(/1/g) || []).length; //counts
  var nonecount = (arr.toString().match(/NONE/g) || []).length; //counts
  var len = count + thrcount + twocount + onecount+ nonecount; //gets length from counts
  if((len) == 0)
    return "100%";
  var percent = ((count * 100) + (thrcount * 75)  + (twocount * 50) + (onecount * 25))/ (len);
  return (Math.round(percent * 100) / 100) + "%";
}
