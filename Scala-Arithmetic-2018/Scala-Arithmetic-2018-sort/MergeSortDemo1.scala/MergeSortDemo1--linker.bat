@echo off

set strCmd=scalac MergeSortDemo1.scala

echo #%strCmd%
call %strCmd%

pause
