@echo off

set strCmd=scalac ShellSortDemo1.scala

echo #%strCmd%
call %strCmd%

pause
