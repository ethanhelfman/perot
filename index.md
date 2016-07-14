---
layout: default
---
<title>Perot Museum Issue Tracker</title>
Only submit issues if a machine is not working

<form action="https://formspree.io/perot.exhibits@gmail.com" method="POST">
  <input type="hidden" name="_next" value="//ethanhelfman.github.io/perot/"/>
  <input type="hidden" name="_format" value="plain"/>
  Floor:
  &nbsp;&nbsp;<input type="text" name="floor">
  <br>
  Machine:
  <input type="text" name="machine">
  <br>
  Issue:
  &nbsp;&nbsp;<input type="text" name="issue">
  <br>
  <br>
  <input type="submit" value="Submit">
</form>
