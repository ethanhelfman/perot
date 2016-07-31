---
layout: default
---
<title>Perot Museum Lightbulb Tracker</title>
Only submit issues if a bulb is not working

<form action="https://formspree.io/perot.exhibits@gmail.com" method="POST">
  <input type="hidden" name="_next" value="//ethanhelfman.github.io/perot/"/>
  <input type="hidden" name="_format" value="plain"/>
  Floor:
  &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="floor">
  <br>
  Area:
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="area">
  <br>
  Bulb Type:
  <label for="LED">LED</label>
  <input type="radio" name="bulb" value="LED" id="LED">
  <label for="House">House</label>
  <input type="radio" name="bulb" value="House" id="House">
  <label for="Theater">Theater</label>
  <input type="radio" name="bulb" value="Theater" id="Theater">
  <br>
  Location:
  &nbsp;<input type="text" name="location">
  <br>
  <br>
  <input type="submit" value="Submit">
</form>
