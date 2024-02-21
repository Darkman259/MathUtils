pipeline {
  agent any
  stages {
    stage('version') {
      steps {
        sh 'python3 --version'
      }
    }
    stage('test_math_utils') {
      steps {
        sh 'test_math_utils.py'
      }
    }
  }
}
