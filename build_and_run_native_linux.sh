#! /usr/bin/env zsh
clear
./gradlew linkDebugExecutableLinuxX64
echo "\n=====> EXECUTING COMPILED CODE <====="
./shared/build/bin/linuxX64/debugExecutable/shared.kexe