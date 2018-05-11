@echo off

set strCmd=scalac ScalaIODemo1.scala

echo #%strCmd%
call %strCmd%

pause
