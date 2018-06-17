@echo off

set strCmd=scalac ScalaRotatingHashDemo1.scala

echo #%strCmd%
call %strCmd%

pause
