@Library('tom-lib')_

pipeline {
	agent any
        environment {
            def sel = [:]
            sel[0] = 'one'
            sel[1] = 'two'
            sel[2] = 'three'
        }
        parameters {
            choice(name: 'Choice', choices: ${sel} , description: 'Pick somethine')
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
