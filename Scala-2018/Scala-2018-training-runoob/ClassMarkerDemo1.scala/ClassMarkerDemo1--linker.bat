@echo off

set strCmd=scalac ClassMarkerDemo1.scala

echo #%strCmd%
call %strCmd%

pause
