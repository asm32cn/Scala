@echo off

set strCmd=scalac ScalaClassDemo2.scala

echo #%strCmd%
call %strCmd%

pause
