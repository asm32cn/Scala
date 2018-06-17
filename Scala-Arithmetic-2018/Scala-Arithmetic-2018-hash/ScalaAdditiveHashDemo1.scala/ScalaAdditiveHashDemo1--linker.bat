@echo off

set strCmd=scalac ScalaAdditiveHashDemo1.scala

echo #%strCmd%
call %strCmd%

pause
