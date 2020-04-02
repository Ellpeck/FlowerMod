pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean --no-daemon'
        sh './gradlew build --no-daemon'
      }
    }

    stage('Upload Artifacts') {
      steps {
        archiveArtifacts 'build/libs/**.jar'
      }
    }
  }
}
