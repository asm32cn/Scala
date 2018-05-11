@echo off

set strCmd=scalac ScalaExtractorDemo2.scala

echo #%strCmd%
call %strCmd%

pause
