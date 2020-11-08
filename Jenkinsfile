@Library('tom-lib')_

pipeline {
	agent jenkins01.tsand.org
	stages {
		stage('demo') {
			steps {
				helloWorld 'hi everyone'
				helloTom 'this is for tom'
				helloKat 'this is for kat'
			}
		}
	}
}
