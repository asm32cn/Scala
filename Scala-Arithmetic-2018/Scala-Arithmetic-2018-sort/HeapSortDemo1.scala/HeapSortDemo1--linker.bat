@echo off

set strCmd=scalac HeapSortDemo1.scala

echo #%strCmd%
call %strCmd%

pause
