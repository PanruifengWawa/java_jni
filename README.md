步骤
- 编写Main.java
- 编译Main.java，`javac Main.java`
- 生成c++的头文件，`javah Main`
- 编写Main.cpp
- 编译Main.cpp，`g++ -I $JAVA_HOME/include -c Main.cpp`，生成Main.o文件
- 打包Main.o为clib，`g++ -dynamiclib -o libxxx.jnilib Main.o`，其中xxx为Main.java中引用的库
- 运行java程序，`java Main`
