@echo off

set strCmd=scalac SingleObjectDemo1.scala

echo #%strCmd%
call %strCmd%

pause
