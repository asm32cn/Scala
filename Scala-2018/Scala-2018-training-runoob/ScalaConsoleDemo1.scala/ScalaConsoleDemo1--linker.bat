@echo off

set strCmd=scalac ScalaConsoleDemo1.scala

echo #%strCmd%
call %strCmd%

pause
