@echo off

set strCmd=scalac ScalaExtractorDemo1.scala

echo #%strCmd%
call %strCmd%

pause
