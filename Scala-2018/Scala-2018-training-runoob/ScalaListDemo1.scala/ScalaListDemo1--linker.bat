@echo off

set strCmd=scalac ScalaListDemo1.scala

echo #%strCmd%
call %strCmd%

pause
