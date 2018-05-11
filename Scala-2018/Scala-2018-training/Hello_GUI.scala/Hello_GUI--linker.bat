@echo off

set strCmd=scalac Hello_GUI.scala

echo #%strCmd%
call %strCmd%

pause
