@echo off

set strCmd=scalac ScalaHexStringDemo1.scala

echo #%strCmd%
call %strCmd%

pause
