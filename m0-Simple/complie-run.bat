cd /d %~dp0
pushd src
javac Test.java
java Test
popd
pause