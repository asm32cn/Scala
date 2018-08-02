@echo off

set strCmd=scalac ScalaFNVHashDemo1.scala

echo #%strCmd%
call %strCmd%

pause
