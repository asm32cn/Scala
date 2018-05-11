@echo off

set strCmd=scalac ScalaClassDemo1.scala

echo #%strCmd%
call %strCmd%

pause
