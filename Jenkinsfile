pipeline{

    agent any

    stages {
        stage('Build') {
            steps {
                echo "Step: Building the application ..."
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                echo "Step: Testing the Application ..."
                bat "mvn test"
            }
        }
        stage('Compile') {
            steps {
                echo "Step: Compiling the Project ..."
                bat "mvn compile"
            }
        }
        stage('Deploy') {
            steps {
                echo "Step: Deploying the Project ..."
            }
        }
    }
}
