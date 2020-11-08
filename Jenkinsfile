@Library('tom-lib')_

pipeline {
	agent any
	stages {
		stage('demo') {
			steps {
				def build = currentBuild.build()
				print build.getExecutor().getOwner().getNode().getNodeName()
				helloWorld 'hi everyone'
				helloTom 'this is for tom'
				helloKat 'this is for kat'
			}
		}
	}
}
