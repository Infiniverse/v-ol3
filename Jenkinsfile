pipeline {
    agent any
    environment {
        MAVEN_OPTS = '-Dmaven.repo.local=repository'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh "rm -rf repository/org/vaadin/addon/v-ol3"
                sh "mvn clean compile -B"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test -B"
            }
        }
        stage('Package') {
            steps {
                sh "mvn install -DskipTests -B"
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts:
                'repository/org/vaadin/addon/v-ol3/**,' +
                'repository/org/vaadin/addon/ol3-wrapper/**' +
                'repository/org/vaadin/gwt-ol3/**', fingerprint: true
        }
    }
}
