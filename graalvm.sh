export PATH=/home/ubuntu/Documenti/graavlm/mandrel-java11-linux-amd64-21.0.0.0-Final/mandrel-java11-21.0.0.0-Final/bin:$PATH
export JAVA_HOME=/home/ubuntu/Documenti/graavlm/mandrel-java11-linux-amd64-21.0.0.0-Final/mandrel-java11-21.0.0.0-Final
export GRAALVM_HOME=/home/ubuntu/Documenti/graavlm/mandrel-java11-linux-amd64-21.0.0.0-Final/mandrel-java11-21.0.0.0-Final/
echo $PATH
echo $JAVA_HOME

./mvnw package -Pnative
