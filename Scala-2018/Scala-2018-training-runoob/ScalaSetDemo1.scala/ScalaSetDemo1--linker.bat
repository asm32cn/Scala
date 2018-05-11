@echo off

set strCmd=scalac ScalaSetDemo1.scala

echo #%strCmd%
call %strCmd%

pause
