@echo off

set projectName=%1

if %1=="" goto usage

mkdir %projectName%
cd %projectName%

start gradle init

ping -n 3 127.0>nul

del /f /s /q build.gradle
copy ..\startup.gradle startup.gradle

start gradle -b startup.gradle startup
ping -n 3 127.0>nul
gradle startup

:end
pause
exit 0

:usage
echo usage:
echo 	%0 projectName
pause
