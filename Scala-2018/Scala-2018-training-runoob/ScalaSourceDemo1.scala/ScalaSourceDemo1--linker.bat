@echo off

set strCmd=scalac ScalaSourceDemo1.scala

echo #%strCmd%
call %strCmd%

pause
