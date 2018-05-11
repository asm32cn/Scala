@echo off

set strCmd=scalac ScalaOptionDemo1.scala

echo #%strCmd%
call %strCmd%

pause
