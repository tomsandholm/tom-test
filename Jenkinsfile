@Library('tom-lib')_

pipeline {
	agent any
        environment {
          TAGS = getTags()
        }
        parameters {
            choice(name: 'Choice', choices: TAGS , description: 'Pick a Tag')
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
