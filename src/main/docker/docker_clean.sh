# 删除容器
docker rm -f `docker ps -a|grep kingisglory|awk '{print $1}'`;

# 删除镜像
docker rmi -f `docker images|grep kingisglory|awk '{print $3}'`


#java -jar /var/jenkins_home/workspace/kingisglory/target/kingisglory-0.0.1-SNAPSHOT.jar