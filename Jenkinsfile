pipeline {
	agent {
		docker {
			image 'maven:3-jdk-11'
			args '-v $HOME/.m2:/root/.m2'
		}
	}
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn -B -DskipTests clean package'
			}
		}
	
		stage('Test') {
			steps {
				sh 'mvn -B verify -P headless'
			}
		}
	}

	post {
		always {
			junit 'target/surefire-reports/**/*.xml'
  		}
  		
  		success {
			archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
  		}
  	}
}