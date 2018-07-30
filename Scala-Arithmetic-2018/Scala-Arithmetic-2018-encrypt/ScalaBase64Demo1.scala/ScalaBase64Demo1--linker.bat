@echo off

set strCmd=scalac ScalaBase64Demo1.scala

echo #%strCmd%
call %strCmd%

pause
