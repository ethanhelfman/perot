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
  <input type="radio" name="bulb" value="LED">
  <input type="radio" name="bulb" value="House">
  <input type="radio" name="bulb" value="Theater">
  <br>
  Location:
  &nbsp;<input type="text" name="location">
  <br>
  <br>
  <input type="submit" value="Submit">
</form>
