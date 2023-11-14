FROM zl52074/openjdk8:1.0
# 指定镜像维护人员
MAINTAINER yuan
# 复制文件到目录并重命名
ADD target/*.jar /opt/app.jar
# 指定容器启动时要执行的命令-启动java程序
ENTRYPOINT ["java","-jar","/opt/app.jar","--spring.profiles.active=prd"]
#声明端口
EXPOSE 8080