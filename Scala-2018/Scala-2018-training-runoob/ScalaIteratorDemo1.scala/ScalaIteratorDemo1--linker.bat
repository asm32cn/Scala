@echo off

set strCmd=scalac ScalaIteratorDemo1.scala

echo #%strCmd%
call %strCmd%

pause
