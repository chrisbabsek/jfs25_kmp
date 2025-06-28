#! /usr/bin/env zsh
clear
./gradlew linkDebugExecutableMacosArm64
echo "\n=====> EXECUTING COMPILED CODE <====="
./shared/build/bin/macosArm64/debugExecutable/shared.kexe
