@Library('jenkins-pipeline-shared-lib-sample')_

pipeline {
    agent none
    stages {
        stage ('Print Build Info') {
            steps {
                script {
                    printBuildinfo {
                        name = "Sample Name"
                    }
                }
            }
         stage ('Disable balancer') {
            steps {
                script {
                    disableBalancerUtils()
                }
            }
         }
         stage ('Deploy') {
            steps {
                script {
                    deploy()
                }
            }
         }
         stage ('Enable balancer') {
            steps {
                script {
                    enableBalancerUtils()
                }
            }
         }
         stage ('Check Status') {
            steps {
                script {
                    checkStatus()
                }
            }
         }
    }
}
