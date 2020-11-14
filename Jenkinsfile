@Library('tom-lib')_

pipeline {
	agent any
        parameters {
            choice(name: 'Choice', choices: ['one','two'] , description: 'Pick a Tag')
        }
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
