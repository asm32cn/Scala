@echo off

set strCmd=scalac ScalaCollectionDemo1.scala

echo #%strCmd%
call %strCmd%

pause
