@echo off

set strCmd=scalac ScalaTryCacheDemo1.scala

echo #%strCmd%
call %strCmd%

pause
