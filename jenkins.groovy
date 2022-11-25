pipeline {
    agent any

    stages {
        stage('pull repo') {
            steps {
                git 'https://github.com/usertan123/student-ui.git'
            }
        }
    }
}
