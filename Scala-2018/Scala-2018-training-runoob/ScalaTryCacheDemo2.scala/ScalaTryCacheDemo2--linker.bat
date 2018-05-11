@echo off

set strCmd=scalac ScalaTryCacheDemo2.scala

echo #%strCmd%
call %strCmd%

pause
