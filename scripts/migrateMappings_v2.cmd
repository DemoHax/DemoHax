@echo off
cd ..
set /p targetMappings=Target Mappings (net.fabricmc.yarn:v2): 
call gradlew.bat migrateMappings --mappings="%targetMappings%"
rmdir /s /q "%cd%/src/main/java"
move "%cd%/remappedSrc" "%cd%/src/main/java"
pause