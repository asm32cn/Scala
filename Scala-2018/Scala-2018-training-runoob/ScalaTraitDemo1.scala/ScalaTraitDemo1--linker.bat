@echo off

set strCmd=scalac ScalaTraitDemo1.scala

echo #%strCmd%
call %strCmd%

pause
