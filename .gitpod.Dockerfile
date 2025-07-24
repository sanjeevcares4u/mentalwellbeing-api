FROM gitpod/workspace-full

# Install Java 21 via SDKMAN
RUN sdk install java 21.0.1-tem

# Set JAVA_HOME
ENV JAVA_HOME="/home/gitpod/.sdkman/candidates/java/current"
